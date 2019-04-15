package Combat;

enum TargetRange {
	Own, //1
	OwnMonster, //2
	TeamMember, //3
	TeamPlayer, //4
	TeamPlayerExceptOwn, //4
	TeamMonster, //5
	TeamMonsterExceptOwn, //6
	Enemy, //7
	EnemyPlayer, //8
	EnemyMonster, //9
}

enum TargetRule {
	Speed_currentMax, //1
	Speed_currentMin, //2
	Hp_currentMax, //3
	Hp_currentMin, //4
	Hp_currentPercentMax, //5
	Hp_currentPercentMin, //6
}

enum Effect {
	Attack, //1
	Cure, //2
	
}

public class Skill {
	private int skillId;
	private TargetRange targetRange;
	private int targetNumber;
	private TargetRule targetRule;
	
	private Effect effect;
	
	private int skillLevel;
	
	private boolean isCalcHitRate;
	
	public Skill() {
		
	}
	
	public TargetRange getTargetRange() {
		return targetRange;
	}
	
	public int getTargetNumber() {
		return targetNumber;
	}
	
	public TargetRule getTargetRule() {
		return targetRule;
	}
	
	public Effect getEffect() {
		return effect;
	}
	
	public int getSkillLevel() {
		return skillLevel;
	}
	
	public boolean getIsCalcAttackHitRate() {
		return isCalcHitRate;
	}
	
	public static Skill findSkillBySkillId(int skillId) {
		return null;
	}
}
