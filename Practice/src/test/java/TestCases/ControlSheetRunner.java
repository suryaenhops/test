package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

import suite.XLSReader;


public class ControlSheetRunner {
	
	
	public static void main(String args[]) {
	
		XLSReader suite = new XLSReader("./AutomationControlSheet.xlsx");
		suite.getTests("select * from TestCase where Active='y'");
		TestNG test=new TestNG();
		List<String> suitefiles=new ArrayList<String>();
		suitefiles.add("./testng-suite.xml"); 
		test.setTestSuites(suitefiles);
		test.run();
	}
	
	
	
	

}
