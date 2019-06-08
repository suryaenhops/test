package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestNgRunner {
	
	@Test
	public void runner(){
		TestNG test=new TestNG();
		List<String> suitefiles=new ArrayList<String>();
		suitefiles.add("./testNg.xml"); 
		suitefiles.add("./testNg1.xml"); 
		test.setTestSuites(suitefiles);
		test.run();
	}

}
