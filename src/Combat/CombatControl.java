package Combat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CombatControl {
	private ArrayList<Member> memberList;
	private int round;
	
	private HashMap<Member, Order> orderList;
	
	public CombatControl() {
		logPrint("A combat is begining");
		/*
		while(!combatIsOver()) {
			doRoundBefore();
			doListenOrder();
			doRound();
		}
		*/
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
				int memberId = member.getMemberId();
				
				if(executeOrder(memberId)) {
					member.setActive(false);
				}
			}
		}
		
		for(Member member:memberList) {
			if(member.checkActive()) {
				//这里需要执行指令前的buff
				int memberId = member.getMemberId();
				
				if(executeOrder(memberId)) {
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
	
	public boolean executeOrder(int memberId) {
		Member member = findMemberByMemberId(memberId);
		Order order = orderList.get(member);
		
		//dealwithOrder
		switch (order.getOrderId()) {
			case Attack:
				int normalSkillGroupId = SkillGroup.findNormalSkillIdBySect(member.getSectId());
				executeSkillGroup(normalSkillGroupId, memberId, order.getTargetMemberId());
				break;
			case Skill:
				executeSkillGroup(order.getSkillGroupId(), memberId, order.getTargetMemberId());
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
	
	public void executeSkillGroup(int skillGroupId, int memberId, int targetMemberId) {
		SkillGroup skillGroup = SkillGroup.findSkillGroupBySkillGroupId(skillGroupId);
		for(Integer integer:skillGroup.getSkillIdList()) {
			executeSkill(integer, memberId, targetMemberId);
		}
	}
	
	public void executeSkill(int skillId, int memberId, int targetMemberId) {
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
								if((double)calcFormulaByFormulaId(Formula.NOMAL_ATTACK_HITRATE_FORMULA_ID, memberId, targetMemberId) < Math.random()) {
									executeAttackMiss();
									return ;
								}
							}
							//走伤害流程
							//判断有无其他状态影响
							//判断是否暴击
							boolean isCritical = false;
							if((double)calcFormulaByFormulaId(Formula.PHYSICAL_CRITICAL_HITRATE_FORMULA_ID, memberId, targetMemberId) >= Math.random()) {
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
	
	public Number calcFormulaByFormulaId(int formulaId, int srcMemberId, int dstMemberId) {
		Member srcMember = findMemberByMemberId(srcMemberId);
		Member dstMember = findMemberByMemberId(dstMemberId);
		
		Formula formulaStructure = Formula.findFormulaByFormulaId(formulaId);
		String formula = formulaStructure.getFormula();
		Number result = 0;
		ScriptEngineManager maneger = new ScriptEngineManager();
		ScriptEngine engine = maneger.getEngineByName("js");
		
		formula = formula.replaceAll("src_hp_original", String.valueOf(srcMember.getHp_original()));
		formula = formula.replaceAll("dst_hp_original", String.valueOf(dstMember.getHp_original()));
		
		formula = formula.replaceAll("src_hp_upper", String.valueOf(srcMember.getHp_upper()));
		formula = formula.replaceAll("dst_hp_upper", String.valueOf(dstMember.getHp_upper()));
		
		formula = formula.replaceAll("src_hp_current", String.valueOf(srcMember.getHp_current()));
		formula = formula.replaceAll("dst_hp_current", String.valueOf(dstMember.getHp_current()));
		
		formula = formula.replaceAll("src_mp_original", String.valueOf(srcMember.getMp_original()));
		formula = formula.replaceAll("dst_mp_original", String.valueOf(dstMember.getMp_original()));
		
		formula = formula.replaceAll("src_mp_current", String.valueOf(srcMember.getMp_current()));
		formula = formula.replaceAll("dst_mp_current", String.valueOf(dstMember.getMp_current()));
		
		formula = formula.replaceAll("src_physical_ATK_original", String.valueOf(srcMember.getPhysicalATK_original()));
		formula = formula.replaceAll("dst_physical_ATK_original", String.valueOf(dstMember.getPhysicalATK_original()));
		
		formula = formula.replaceAll("src_magical_ATK_original", String.valueOf(srcMember.getMagicalATK_original()));
		formula = formula.replaceAll("dst_magical_ATK_original", String.valueOf(dstMember.getMagicalATK_original()));
		
		formula = formula.replaceAll("src_physical_ATK_current", String.valueOf(srcMember.getPhysicalATK_current()));
		formula = formula.replaceAll("dst_physical_ATK_current", String.valueOf(dstMember.getPhysicalATK_current()));
		
		formula = formula.replaceAll("src_magical_ATK_current", String.valueOf(srcMember.getMagicalATK_current()));
		formula = formula.replaceAll("dst_magical_ATK_current", String.valueOf(dstMember.getMagicalATK_current()));
		
		formula = formula.replaceAll("src_physical_DEF_original", String.valueOf(srcMember.getPhysicalDEF_original()));
		formula = formula.replaceAll("dst_physical_DEF_original", String.valueOf(dstMember.getPhysicalDEF_original()));
		
		formula = formula.replaceAll("src_magical_DEF_original", String.valueOf(srcMember.getMagicalDEF_original()));
		formula = formula.replaceAll("dst_magical_DEF_original", String.valueOf(dstMember.getMagicalDEF_original()));
		
		formula = formula.replaceAll("src_physical_DEF_current", String.valueOf(srcMember.getPhysicalDEF_current()));
		formula = formula.replaceAll("dst_physical_DEF_current", String.valueOf(dstMember.getPhysicalDEF_current()));
		
		formula = formula.replaceAll("src_magical_DEF_current", String.valueOf(srcMember.getMagicalDEF_current()));
		formula = formula.replaceAll("dst_magical_DEF_current", String.valueOf(dstMember.getMagicalDEF_current()));
		
		formula = formula.replaceAll("src_hit_original", String.valueOf(srcMember.getHit_original()));
		formula = formula.replaceAll("dst_hit_original", String.valueOf(dstMember.getHit_original()));
		
		formula = formula.replaceAll("src_hit_current", String.valueOf(srcMember.getHit_current()));
		formula = formula.replaceAll("dst_hit_current", String.valueOf(dstMember.getHit_current()));
		
		formula = formula.replaceAll("src_miss_original", String.valueOf(srcMember.getMiss_original()));
		formula = formula.replaceAll("dst_miss_original", String.valueOf(dstMember.getMiss_original()));

		formula = formula.replaceAll("src_miss_current", String.valueOf(srcMember.getMiss_current()));
		formula = formula.replaceAll("dst_miss_current", String.valueOf(dstMember.getMiss_current()));
		
		formula = formula.replaceAll("src_speed_original", String.valueOf(srcMember.getSpeed_original()));
		formula = formula.replaceAll("dst_speed_original", String.valueOf(dstMember.getSpeed_original()));
		
		try {
			result = (Number)engine.eval(formula);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			result = Double.NaN;
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		CombatControl control = new CombatControl();
	}
}
