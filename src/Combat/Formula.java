package Combat;

public class Formula {
	public static int NOMAL_ATTACK_HITRATE_FORMULA_ID = 101;
	public static int PHYSICAL_CRITICAL_HITRATE_FORMULA_ID = 111;
	public static int MAGICAL_CRITICAL_HITRATE_FORMULA_ID = 112;
	
	private int formulaId;
	
	private String formula;
	
	public Formula() {
		
	}
	
	public String getFormula() {
		return formula;
	}
	
	public static Formula findFormulaByFormulaId(int formulaId) {
		return null;
	}
}
