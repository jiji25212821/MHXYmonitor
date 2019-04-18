package Combat;

import java.util.ArrayList;
import java.util.Comparator;

enum Sect {
	DT, //1
	FC, //2
	HS, //3
	NE, //4
	PT, //5
	LG, //6
	TG, //7
	WZ, //8
	MW, //9
	STL, //10
	DF, //11
	PS, //12
	SML, //13
	LBC, //14
	WDD, //15
	TJC, //16
	HGS, //17
	NBW, //18
}

public class Member {
	private int memberId;
	private String name;
	private Sect sectId;
	private int team;
	private boolean isPlayer;
	
	private int level;
	
	private int hp_original;
	private int hp_upper;
	private int hp_current;
	
	private int mp_original;
	private int mp_current;
	
	private int physical_ATK_original;
	private int physical_ATK_current;
	
	private int magical_ATK_original;
	private int magical_ATK_current;
	
	private int physical_DEF_original;
	private int physical_DEF_current;
	
	private int magical_DEF_original;
	private int magical_DEF_current;
	
	private int hit_original;
	private int hit_current;
	
	private int miss_original;
	private int miss_current;
	
	private int speed_original;
	private int speed_current;
	
	private int seal_level_original;
	private int seal_level_current;
	
	private double seal_rate_original;
	private double seal_rate_current;
	
	private int anti_seal_level_original;
	private int anti_seal_level_current;
	
	private double anti_seal_rate_original;
	private double anti_seal_rate_current;
	
	private int physical_critical_level_original;
	private int physical_critical_level_current;
	
	private double physical_critical_rate_original;
	private double physical_critical_rate_current;
	
	private int anti_physical_critical_level_original;
	private int anti_physical_critical_level_current;
	
	private double anti_physical_critical_rate_original;
	private double anti_physical_critical_rate_current;
	
	private int physical_critical_expand_val_original;
	private int physical_critical_expand_val_current;
	
	private double physical_critical_expand_val_percent_original;
	private double physical_critical_expand_val_percent_current;
	
	private int physical_ATK_result_original;
	private int physical_ATK_result_current;
	
	private double physical_ATK_result_rate_origianl;
	private double physical_ATK_result_rate_current;
	
	private int magical_critical_level_original;
	private int magical_critical_level_current;
	
	private double magical_critical_rate_original;
	private double magical_critical_rate_current;
	
	private int anti_magical_critical_level_original;
	private int anti_magical_critical_level_current;
	
	private double anti_magical_critical_rate_original;
	private double anti_magical_critical_rate_current;
	
	private int magical_critical_expand_val_original;
	private int magical_critical_expand_val_current;
	
	private double magical_critical_expand_val_percent_original;
	private double magical_critical_expand_val_percent_current;
	
	private int magical_ATK_result_original;
	private int magical_ATK_result_current;
	
	private double magical_ATK_result_rate_origianl;
	private double magical_ATK_result_rate_current;
	
	private int cure_original;
	private int cure_current;
	
	private int hp_recovery_original;
	private int hp_recovery_current;
	
	private int mp_recovery_original;
	private int mp_recovery_current;
	
	private int VIT_original;
	private int VIT_current;
	
	private int STR_original;
	private int STR_current;
	
	private int MAG_original;
	private int MAG_current;
	
	private int END_original;
	private int END_current;
	
	private int DEX_original;
	private int DEX_current;
	
	private int physical_practice_level;
	private int magical_practice_level;
	private int anti_physical_practice_level;
	private int anti_magical_practice_level;
	
	private int shield;
	
	private ArrayList<Buff> stepBeforeOrderBuffList;
	
	private ArrayList<Buff> stepAfterOrderBuffList;
	
	private boolean isActive;
	
	public Member() {
		
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public int getTeam() {
		return team;
	}
	
	public Sect getSectId() {
		return sectId;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isPlayer() {
		return isPlayer;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getHp_original() {
		return hp_original;
	}
	
	public int getHp_upper() {
		return hp_upper;
	}
	
	public int getHp_current() {
		return hp_current;
	}
	
	public int getMp_original() {
		return mp_original;
	}
	
	public int getMp_current() {
		return mp_current;
	}
	
	public int getPhysicalATK_original() {
		return physical_ATK_original;
	}
	
	public int getPhysicalATK_current() {
		return physical_ATK_current;
	}
	
	public int getMagicalATK_original() {
		return magical_ATK_original;
	}
	
	public int getMagicalATK_current() {
		return magical_ATK_current;
	}
	
	public int getPhysicalDEF_original() {
		return physical_DEF_original;
	}
	
	public int getPhysicalDEF_current() {
		return physical_DEF_current;
	}
	
	public int getMagicalDEF_original() {
		return magical_DEF_original;
	}
	
	public int getMagicalDEF_current() {
		return magical_DEF_current;
	}
	
	public int getHit_original() {
		return hit_original;
	}
	
	public int getHit_current() {
		return hit_current;
	}
	
	public int getMiss_original() {
		return miss_original;
	}
	
	public int getMiss_current() {
		return miss_current;
	}
	
	public int getSpeed_original() {
		return speed_original;
	}
	
	public int getSpeed_current() {
		return speed_current;
	}
	
	public int getSealLevel_original() {
		return seal_level_original;
	}
	
	public int getSealLevel_current() {
		return seal_level_current;
	}
	
	public double getSealRate_original() {
		return seal_rate_original;
	}
	
	public double getSealRate_current() {
		return seal_rate_current;
	}
	
	public int getAntiSealLevel_original() {
		return anti_seal_level_original;
	}
	
	public int getAntiSealLevel_current() {
		return anti_seal_level_current;
	}
	
	public double getAntiSealRate_original() {
		return anti_seal_rate_original;
	}
	
	public double getAntiSealRate_current() {
		return anti_seal_rate_current;
	}
	
	public int getPhysicalCriticalLevel_original() {
		return physical_critical_level_original;
	}
	
	public int getPhysicalCriticalLevel_current() {
		return physical_critical_level_current;
	}
	
	public double getPhysicalCriticalRate_original() {
		return physical_critical_rate_original;
	}
	
	public double getPhysicalCriticalRate_current() {
		return physical_critical_rate_current;
	}
	
	public int getAntiPhysicalCriticalLevel_original() {
		return anti_physical_critical_level_original;
	}
	
	public int getAntiPhysicalCriticalLevel_current() {
		return anti_physical_critical_level_current;
	}
	
	public double getAntiPhysicalCriticalRate_original() {
		return anti_physical_critical_rate_original;
	}
	
	public double getAntiPhysicalCriticalRate_current() {
		return anti_physical_critical_rate_current;
	}
	
	public int getPhysicalCriticalExpandVal_original() {
		return physical_critical_expand_val_original;
	}
	
	public int getPhysicalCriticalExpandVal_current() {
		return physical_critical_expand_val_current;
	}
	
	public double getPhysicalCriticalExpandValPecent_original() {
		return physical_critical_expand_val_percent_original;
	}
	
	public double getPhysicalCriticalExpandValPecent_current() {
		return physical_critical_expand_val_percent_current;
	}
	
	public int getPhysicalATKResult_original() {
		return physical_ATK_result_original;
	}
	
	public int getPhysicalATKResult_current() {
		return physical_ATK_result_current;
	}
	
	public double getPhysicalATKResultRate_original() {
		return physical_ATK_result_rate_origianl;
	}
	
	public double getPhysicalATKResultRate_current() {
		return physical_ATK_result_rate_current;
	}
	
	public int getMagicalCriticalLevel_original() {
		return magical_critical_level_original;
	}
	
	public int getMagicalCriticalLevel_current() {
		return magical_critical_level_current;
	}
	
	public double getMagicalCriticalRate_original() {
		return magical_critical_rate_original;
	}
	
	public double getMagicalCriticalRate_current() {
		return magical_critical_rate_current;
	}
	
	public int getAntiMagicalCriticalLevel_original() {
		return anti_magical_critical_level_original;
	}
	
	public int getAntiMagicalCriticalLevel_current() {
		return anti_magical_critical_level_current;
	}
	
	public double getAntiMagicalCriticalRate_original() {
		return anti_magical_critical_rate_original;
	}
	
	public double getAntiMagicalCriticalRate_current() {
		return anti_magical_critical_rate_current;
	}
	
	public int getMagicalCriticalExpandVal_original() {
		return magical_critical_expand_val_original;
	}
	
	public int getMagicalCriticalExpandVal_current() {
		return magical_critical_expand_val_current;
	}
	
	public double getMagicalCriticalExpandValPecent_original() {
		return magical_critical_expand_val_percent_original;
	}
	
	public double getMagicalCriticalExpandValPecent_current() {
		return magical_critical_expand_val_percent_current;
	}
	
	public int getMagicalATKResult_original() {
		return magical_ATK_result_original;
	}
	
	public int getMagicalATKResult_current() {
		return magical_ATK_result_current;
	}
	
	public double getMagicalATKResultRate_original() {
		return magical_ATK_result_rate_origianl;
	}
	
	public double getMagicalATKResultRate_current() {
		return magical_ATK_result_rate_current;
	}
	
	public int getPhysicalPracticeLevel() {
		return physical_practice_level;
	}
	
	public int getAntiPhysicalPracticeLevel() {
		return anti_physical_practice_level;
	}
	
	public int getMagicalPracticeLevel() {
		return magical_practice_level;
	}
	
	public int getAntiMagicalPracticeLevel() {
		return anti_magical_practice_level;
	}
	
	public int getCure_original() {
		return cure_original;
	}
	
	public int getCure_current() {
		return cure_current;
	}
	
	public int getHpRecovery_original() {
		return hp_recovery_original;
	}
	
	public int getHpRecovery_current() {
		return hp_recovery_current;
	}
	
	public int getMpRecovery_original() {
		return mp_recovery_original;
	}
	
	public int getMpRecovery_current() {
		return mp_recovery_current;
	}
	
	public int getVIT_original() {
		return VIT_original;
	}
	
	public int getVIT_current() {
		return VIT_current;
	}
	
	public int getSTR_original() {
		return STR_original;
	}
	
	public int getSTR_current() {
		return STR_current;
	}
	
	public int getMAG_original() {
		return MAG_original;
	}
	
	public int getMAG_current() {
		return MAG_current;
	}
	
	public int getEND_original() {
		return END_original;
	}
	
	public int getEND_current() {
		return END_current;
	}
	
	public int getDEX_original() {
		return DEX_original;
	}
	
	public int getDEX_current() {
		return DEX_current;
	}
	
	public int getShield() {
		return shield;
	}
	
	
	public void setHp_original(int hp_original) {
		this.hp_original = hp_original;
	}
	
	public void setHp_upper(int hp_upper) {
		this.hp_upper = hp_upper;
	}
	
	public void setHp_current(int hp_current) {
		this.hp_current = hp_current;
	}
	
	public void setMp_original(int mp_original) {
		this.mp_original = mp_original;
	}
	
	public void setMp_current(int mp_current) {
		this.mp_current = mp_current;
	}
	
	public void setPhysicalATK_original(int physical_ATK_original) {
		this.physical_ATK_original = physical_ATK_original;
	}
	
	public void setPhysicalATK_current(int physical_ATK_current) {
		this.physical_ATK_current = physical_ATK_current;
	}
	
	public void setMagicalATK_original(int magical_ATK_original) {
		this.magical_ATK_original = magical_ATK_original;
	}
	
	public void setMagicalATK_current(int magical_ATK_current) {
		this.magical_ATK_current = magical_ATK_current;
	}
	
	public void setPhysicalDEF_original(int physical_DEF_original) {
		this.physical_DEF_original = physical_DEF_original;
	}
	
	public void setPhysicalDEF_current(int physical_DEF_current) {
		this.physical_DEF_current = physical_DEF_current;
	}
	
	public void setMagicalDEF_original(int magical_DEF_original) {
		this.magical_DEF_original = magical_DEF_original;
	}
	
	public void setMagicalDEF_current(int magical_DEF_current) {
		this.magical_DEF_current = magical_DEF_current;
	}
	
	public void setHit_original(int hit_original) {
		this.hit_original = hit_original;
	}
	
	public void setHit_current(int hit_current) {
		this.hit_current = hit_current;
	}
	
	public void setMiss_original(int miss_original) {
		this.miss_original = miss_original;
	}
	
	public void setMiss_current(int miss_current) {
		this.miss_current = miss_current;
	}
	
	public void setSpeed_original(int speed_original) {
		this.speed_original = speed_original;
	}
	
	public void setSpeed_current(int speed_current) {
		this.speed_current = speed_current;
	}
	
	public void setSealLevel_original(int seal_level_original) {
		this.seal_level_original = seal_level_original;
	}
	
	public void setSealLevel_current(int seal_level_current) {
		this.seal_level_current = seal_level_current;
	}
	
	public void setSealRate_original(double seal_rate_original) {
		this.seal_rate_original = seal_rate_original;
	}
	
	public void setSealRate_current(double seal_rate_current) {
		this.seal_rate_current = seal_rate_current;
	}
	
	public void setAntiSealLevel_original(int anti_seal_level_original) {
		this.anti_seal_level_original = anti_seal_level_original;
	}
	
	public void setAntiSealLevel_current(int anti_seal_level_current) {
		this.anti_seal_level_current = anti_seal_level_current;
	}
	
	public void setAntiSealRate_original(double anti_seal_rate_original) {
		this.anti_seal_rate_original = anti_seal_rate_original;
	}
	
	public void setAntiSealRate_current(double anti_seal_rate_current) {
		this.anti_seal_rate_current = anti_seal_rate_current;
	}
	
	public void setPhysicalCriticalLevel_original(int physical_critical_level_original) {
		this.physical_critical_level_original = physical_critical_level_original;
	}
	
	public void setPhysicalCriticalLevel_current(int physical_critical_level_current) {
		this.physical_critical_level_current = physical_critical_level_current;
	}
	
	public void setPhysicalCriticalRate_original(double physical_critical_rate_original) {
		this.physical_critical_rate_original = physical_critical_rate_original;
	}
	
	public void setPhysicalCriticalRate_current(double physical_critical_rate_current) {
		this.physical_critical_rate_current = physical_critical_rate_current;
	}
	
	public void setAntiPhysicalCriticalLevel_original(int anti_physical_critical_level_original) {
		this.anti_physical_critical_level_original = anti_physical_critical_level_original;
	}
	
	public void setAntiPhysicalCriticalLevel_current(int anti_physical_critical_level_current) {
		this.anti_physical_critical_level_current = anti_physical_critical_level_current;
	}
	
	public void setAntiPhysicalCriticalRate_original(double anti_physical_critical_rate_original) {
		this.anti_physical_critical_rate_original = anti_physical_critical_rate_original;
	}
	
	public void setAntiPhysicalCriticalRate_current(double anti_physical_critical_rate_current) {
		this.anti_physical_critical_rate_current = anti_physical_critical_rate_current;
	}
	
	public void setPhysicalCriticalExpandVal_original(int physical_critical_expand_val_original) {
		this.physical_critical_expand_val_original = physical_critical_expand_val_original;
	}
	
	public void setPhysicalCriticalExpandVal_current(int physical_critical_expand_val_current) {
		this.physical_critical_expand_val_current = physical_critical_expand_val_current;
	}
	
	public void setPhysicalCriticalExpandValPecent_original(double physical_critical_expand_val_percent_original) {
		this.physical_critical_expand_val_percent_original = physical_critical_expand_val_percent_original;
	}
	
	public void setPhysicalCriticalExpandValPecent_current(double physical_critical_expand_val_percent_current) {
		this.physical_critical_expand_val_percent_current = physical_critical_expand_val_percent_current;
	}
	
	public void setPhysicalATKResult_original(int physical_ATK_result_original) {
		this.physical_ATK_result_original = physical_ATK_result_original;
	}
	
	public void setPhysicalATKResult_current(int physical_ATK_result_current) {
		this.physical_ATK_result_current = physical_ATK_result_current;
	}
	
	public void setPhysicalATKResultRate_original(int physical_ATK_result_rate_origianl) {
		this.physical_ATK_result_rate_origianl = physical_ATK_result_rate_origianl;
	}
	
	public void setPhysicalATKResultRate_current(int physical_ATK_result_rate_current) {
		this.physical_ATK_result_rate_current = physical_ATK_result_rate_current;
	}
	
	public void setMagicalCriticalLevel_original(int magical_critical_level_original) {
		this.magical_critical_level_original = magical_critical_level_original;
	}
	
	public void setMagicalCriticalLevel_current(int magical_critical_level_current) {
		this.magical_critical_level_current = magical_critical_level_current;
	}
	
	public void setMagicalCriticalRate_original(double magical_critical_rate_original) {
		this.magical_critical_rate_original = magical_critical_rate_original;
	}
	
	public void setMagicalCriticalRate_current(double magical_critical_rate_current) {
		this.magical_critical_rate_current = magical_critical_rate_current;
	}
	
	public void setAntiMagicalCriticalLevel_original(int anti_magical_critical_level_original) {
		this.anti_magical_critical_level_original = anti_magical_critical_level_original;
	}
	
	public void setAntiMagicalCriticalLevel_current(int anti_magical_critical_level_current) {
		this.anti_magical_critical_level_current = anti_magical_critical_level_current;
	}
	
	public void setAntiMagicalCriticalRate_original(double anti_magical_critical_rate_original) {
		this.anti_magical_critical_rate_original = anti_magical_critical_rate_original;
	}
	
	public void setAntiMagicalCriticalRate_current(double anti_magical_critical_rate_current) {
		this.anti_magical_critical_rate_current = anti_magical_critical_rate_current;
	}
	
	public void setMagicalCriticalExpandVal_original(int magical_critical_expand_val_original) {
		this.magical_critical_expand_val_original = magical_critical_expand_val_original;
	}
	
	public void setMagicalCriticalExpandVal_current(int magical_critical_expand_val_current) {
		this.magical_critical_expand_val_current = magical_critical_expand_val_current;
	}
	
	public void setMagicalCriticalExpandValPecent_original(double magical_critical_expand_val_percent_original) {
		this.magical_critical_expand_val_percent_original = magical_critical_expand_val_percent_original;
	}
	
	public void setMagicalCriticalExpandValPecent_current(double magical_critical_expand_val_percent_current) {
		this.magical_critical_expand_val_percent_current = magical_critical_expand_val_percent_current;
	}
	
	public void setMagicalATKResult_original(int magical_ATK_result_original) {
		this.magical_ATK_result_original = magical_ATK_result_original;
	}
	
	public void setMagicalATKResult_current(int magical_ATK_result_current) {
		this.magical_ATK_result_current = magical_ATK_result_current;
	}
	
	public void setMagicalATKResultRate_original(int magical_ATK_result_rate_origianl) {
		this.magical_ATK_result_rate_origianl = magical_ATK_result_rate_origianl;
	}
	
	public void setMagicalATKResultRate_current(int magical_ATK_result_rate_current) {
		this.magical_ATK_result_rate_current = magical_ATK_result_rate_current;
	}
	
	public void setPhysicalPracticeLevel(int physical_practice_level) {
		this.physical_practice_level = physical_practice_level;
	}
	
	public void setAntiPhysicalPracticeLevel(int physical_practice_level) {
		this.physical_practice_level = physical_practice_level;
	}
	
	public void setMagicalPracticeLevel(int magical_practice_level) {
		this.magical_practice_level = magical_practice_level;
	}
	
	public void setAntiMagicalPracticeLevel(int anti_magical_practice_level) {
		this.anti_magical_practice_level = anti_magical_practice_level;
	}
	
	public void setCure_original(int cure_original) {
		this.cure_original = cure_original;
	}
	
	public void setCure_current(int cure_current) {
		this.cure_current = cure_current;
	}
	
	public void setHpRecovery_original(int hp_recovery_original) {
		this.hp_recovery_original = hp_recovery_original;
	}
	
	public void setHpRecovery_current(int hp_recovery_current) {
		this.hp_recovery_current = hp_recovery_current;
	}
	
	public void setMpRecovery_original(int mp_recovery_original) {
		this.mp_recovery_original = mp_recovery_original;
	}
	
	public void setMpRecovery_current(int mp_recovery_current) {
		this.mp_recovery_current = mp_recovery_current;
	}
	
	public void setVIT_original(int VIT_original) {
		this.VIT_original = VIT_original;
	}
	
	public void setVIT_current(int VIT_current) {
		this.VIT_current = VIT_current;
	}
	
	public void setSTR_original(int STR_original) {
		this.STR_original = STR_original;
	}
	
	public void setSTR_current(int STR_current) {
		this.STR_current = STR_current;
	}
	
	public void setMAG_original(int MAG_original) {
		this.MAG_original = MAG_original;
	}
	
	public void setMAG_current(int MAG_current) {
		this.MAG_current = MAG_current;
	}
	
	public void setEND_original(int END_original) {
		this.END_original = END_original;
	}
	
	public void setEND_current(int END_current) {
		this.END_current = END_current;
	}
	
	public void setDEX_original(int DEX_original) {
		this.DEX_original = DEX_original;
	}
	
	public void setDEX_current(int DEX_current) {
		this.DEX_current = DEX_current;
	}
	
	public void setShield(int shield) {
		this.shield = shield;
	}
	
	
	
	
	public ArrayList<Buff> getStepBeforeOrderBuffList() {
		return stepBeforeOrderBuffList;
	}
	
	public ArrayList<Buff> getStepAfterOrderBuffList() {
		return stepAfterOrderBuffList;
	}
	
	public boolean checkActive() {
		//checkCondition
		if(getHp_current() == 0) {
			return false;
		}
		
		
		return isActive;
	}
	
	public void setActive(boolean b) {
		isActive = b;
	}
	
	public static Comparator<Member> SpeedComparator = new Comparator<Member>() {

		@Override
		public int compare(Member o1, Member o2) {
			int speed1 = o1.getSpeed_current();
			int speed2 = o2.getSpeed_current();
			return speed1-speed2;
		}
	};
}
