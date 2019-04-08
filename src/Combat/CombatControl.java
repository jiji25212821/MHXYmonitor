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
				int normalSkillId = Skill.findNormalSkillIdBySect(member.getSectId());
				executeSkill(normalSkillId, order.getTargetMemberId());
				break;
			case Skill:
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
	
	public void executeSkill(int skillId, int targetMemberId) {
		//首先读取技能信息
		Skill skill = Skill.findSkillBySkillId(skillId);
		
		//判断技能的目标
		ArrayList<Member> targetMemberList = new ArrayList<>();
		Member tempMember = findMemberByMemberId(targetMemberId);
		targetMemberList.add(tempMember);
		for(int i = 0; i < targetMemberId - 1; i++) {
			if(i < memberList.size()) {
				tempMember = memberList.get(i);
				targetMemberList.add(tempMember);
			}
		}
		
		switch (skill.getEffect()) {
			case Attack:
				break;
			case Cure:
				break;
		}
		
	}
	
	public void executeBuff(Buff buff) {
		//check condition
		
		//choose target
		
		//doskill
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
	
	public static void main(String[] args) {
		CombatControl control = new CombatControl();
	}
}
