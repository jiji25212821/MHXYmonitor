package Combat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CombatControl {
	private ArrayList<Member> memberList;
	private int round;
	
	private HashMap<Member, Order> orderList;
	
	public CombatControl() {
		logPrint("A combat is begining");
		while(!combatIsOver()) {
			doRoundBefore();
			doListenOrder();
			doRound();
		}
	}
	
	public boolean combatIsOver() {
		boolean teamOneOver = true;
		boolean teamTwoOver = true;
		for(Member member:memberList) {
			if(member.isPlayer() && member.getHp_current() > 0) {
				if(member.getTeam() == 1) {
					teamOneOver = false;
					return false;
				}
				else if(member.getTeam() == 2) {
					teamTwoOver = false;
					return false;
				}
			}
		}
		return teamOneOver || teamTwoOver;
	}
	
	public void doRoundBefore() {
		
	}
	
	public void doListenOrder() {
		
	}
	
	public void doRound() {
		doStepBeforeOrder();
		
		doStepOrder();
		
		doStepAfterOrder();
		
		round++;
	}
	
	public void doStepBeforeOrder() {
		Collections.sort(memberList, Member.SpeedComparator);
		
		for(Member member:memberList) {
			member.setActive(true);
			
			for(Buff buff:member.getStepBeforeOrderBuffList()) {
				executeBuff(buff);
			}
		}
	}
	
	public void doStepOrder() {
		Collections.sort(memberList, Member.SpeedComparator);
		
		for(Member member:memberList) {
			if(member.checkActive()) {
				//这里需要执行指令前的buff
				
				if(executeOrder(member)) {
					member.setActive(false);
				}
			}
		}
		
		for(Member member:memberList) {
			if(member.checkActive()) {
				//这里需要执行指令前的buff
				
				if(executeOrder(member)) {
					member.setActive(false);
				}
			}
		}
	}
	
	public void doStepAfterOrder() {
		Collections.sort(memberList, Member.SpeedComparator);
		
		for(Member member:memberList) {
			for(Buff buff:member.getStepAfterOrderBuffList()) {
				executeBuff(buff);
			}
		}
	}
	
	public void logPrint(String log) {
		System.out.println(log);
	}
	
	public boolean executeOrder(Member member) {
		Order order = orderList.get(member);
		
		//dealwithOrder
		switch (order.getOrderId()) {
			case Attack:
				int normalSkillGroupId = SkillGroup.findNormalSkillIdBySect(member.getSectId());
				executeSkillGroup(normalSkillGroupId, order.getTargetMemberId());
				break;
			case Skill:
				executeSkillGroup(order.getSkillGroupId(), order.getTargetMemberId());
				break;
			case Object:
				break;
			case Defence:
				break;
			case Summon:
				break;
			case SummonBack:
				break;
			case Flee:
				break;
			case trump:
				break;
			default:
				break;
		}
		
		//execute
		return true;
	}
	
	public void executeSkillGroup(int skillGroupId, int targetMemberId) {
		SkillGroup skillGroup = SkillGroup.findSkillGroupBySkillGroupId(skillGroupId);
		for(Integer integer:skillGroup.getSkillIdList()) {
			executeSkill(integer, targetMemberId);
		}
	}
	
	public void executeSkill(int skillId, int targetMemberId) {
		//首先读取技能信息
		Skill skill = Skill.findSkillBySkillId(skillId);
		
		
		//判断效果的目标
		ArrayList<Member> targetMemberList = new ArrayList<>();
		Member tempMember = findMemberByMemberId(targetMemberId);
		targetMemberList.add(tempMember);
		for(int i = 0; i < targetMemberId - 1; i++) {
			if(i < memberList.size()) {
				tempMember = memberList.get(i);
				targetMemberList.add(tempMember);
				
				switch (skill.getEffect()) {
					case Attack:
						//是否有合击
						if(isAttackTogether()) {
							doAttackTogether();
						} else { //非合击流程
							//判断命中率
							if(skill.getIsCalcAttackHitRate()) {
								if(calcFormulaByFormulaId(Formula.NOMAL_ATTACK_HITRATE_FORMULA_ID) < Math.random()) {
									executeAttackMiss();
									return ;
								}
							}
							//走伤害流程
							//判断有无其他状态影响
							//判断是否暴击
							boolean isCritical = false;
							if(calcFormulaByFormulaId(Formula.PHYSICAL_CRITICAL_HITRATE_FORMULA_ID) >= Math.random()) {
								isCritical = true;
							}
							
							
						}
						break;
					case Cure:
						break;
				}
			}
		}
	}
	
	public void executeBuff(Buff buff) {
		//check condition
		
		//choose target
		
		//doskill
	}
	
	public void executeAttackMiss() {
		
	}
	
	public Member findMemberByMemberId(int memberId) {
		if(memberList == null || memberList.isEmpty()) {
			return null;
		}
		
		for(Member member:memberList) {
			if(member.getMemberId() == memberId) {
				return member;
			}
		}
		return memberList.get(0);
	}
	
	public boolean isAttackTogether() {
		return false;
	}
	
	public void doAttackTogether() {
		
	}
	
	public double calcFormulaByFormulaId(int formulaId) {
		Formula formula = Formula.findFormulaByFormulaId(formulaId);
		return 0;
	}
	
	public static void main(String[] args) {
		CombatControl control = new CombatControl();
	}
}
