package Combat;

public class TriggerBuff extends Buff{
	private int triggerSkillId;
	private double hitRate;
	
	public TriggerBuff() {
		
	}
	
	public int getTriggerSkillId() {
		return triggerSkillId;
	}
	
	public double getHitRate() {
		return hitRate;
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
