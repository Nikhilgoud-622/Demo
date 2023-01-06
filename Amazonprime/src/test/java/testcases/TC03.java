package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Reporter;

@Listeners(demo.Listner.class)
public class TC03 {
	@Test
	public void m1() {
		Reporter.log("Tc3 Running");
		
		
	}
	


}
