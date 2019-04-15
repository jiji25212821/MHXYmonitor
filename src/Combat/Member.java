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
