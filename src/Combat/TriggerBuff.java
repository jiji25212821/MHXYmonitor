package Combat;

public class TriggerBuff extends Buff{
	private int triggerSkillId;
	private double hitRate;
	
	public TriggerBuff() {
		
	}
	
	public void executeBuff() {
		//check condition
		if(Math.random() < hitRate) {
			return;
		}
		
		//choose target
				
		//doskill
	}
}
