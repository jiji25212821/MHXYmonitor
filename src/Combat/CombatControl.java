package Combat;

import java.util.ArrayList;
import java.util.HashMap;

public class CombatControl {
	private ArrayList<Member> memberList;
	private int round;
	
	private HashMap<Member, Order> orderList;
	
	public CombatControl() {
		while(!combatIsOver()) {
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
	
	public void doListenOrder() {
		
	}
	
	public void doRound() {
		doStepBeforeOrder();
		
		doStepOrder();
		
		doStepAfterOrder();	
	}
	
	public void doStepBeforeOrder() {
		
	}
	
	public void doStepOrder() {
		
	}
	
	public void doStepAfterOrder() {
		
	}
	
	public static void main() {
		CombatControl control;
	}
}
