package Combat;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

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
	
	public void setFormulaId(int formulaId) {
		this.formulaId = formulaId;
	}
	
	public void setFormula(String formula) {
		this.formula = formula;
	}
	
	public static Formula findFormulaByFormulaId(int formulaId) {
		return null;
	}
	
	public static void initializeFormulas() {
		String path = "./Config/Formulas.xml";
		CombatControl.Formulas = new HashMap<>();
		File xmlFile = new File(path);
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(xmlFile);
			Element root = document.getRootElement();
			
			List<Element> list = root.elements();
			for(Element l:list) {
				int id = Integer.parseInt(l.attributeValue("id"));
				String formulaString = l.attributeValue("string");
				Formula f = new Formula();
				f.setFormulaId(id);
				f.setFormula(formulaString);
				
				CombatControl.Formulas.put(id, f);
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
