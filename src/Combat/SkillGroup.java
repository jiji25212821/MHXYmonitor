package Combat;

import java.util.ArrayList;

public class SkillGroup {
	private int skillGroupId;
	private ArrayList<Integer> skillIdList;
	
	public SkillGroup() {
		
	}
	
	public static int findNormalSkillIdBySect(Sect sect) {
		return 0;
	}
	
	public ArrayList<Integer> getSkillIdList() {
		return skillIdList;
	}
	
	public static SkillGroup findSkillGroupBySkillGroupId(int skillGroupId) {
		return null;
	}
}
