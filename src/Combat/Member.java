package Combat;

import java.util.ArrayList;

public class Member {
	private int memberId;
	private String Name;
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
	
	ArrayList<Buff> buffList;
	
	public Member() {
		
	}
	
	public int getTeam() {
		return team;
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
}
