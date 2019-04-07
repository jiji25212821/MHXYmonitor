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
				buff.executeBuff();
			}
		}
	}
	
	public void doStepOrder() {
		Collections.sort(memberList, Member.SpeedComparator);
		for(Member member:memberList) {
			Order order = orderList.get(member);
		}
		
		for(Member member:memberList) {
			if(member.isActive() == true) {
				Order order = orderList.get(member);
			}
		}
	}
	
	public void doStepAfterOrder() {
		Collections.sort(memberList, Member.SpeedComparator);
		
		for(Member member:memberList) {
			for(Buff buff:member.getStepAfterOrderBuffList()) {
				buff.executeBuff();
			}
		}
	}
	
	public void logPrint(String log) {
		System.out.println(log);
	}
	
	public static void main(String[] args) {
		CombatControl control = new CombatControl();
	}
}
