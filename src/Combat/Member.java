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
	
	public int getSpeed_original() {
		return speed_original;
	}
	
	public int getSpeed_current() {
		return speed_current;
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
