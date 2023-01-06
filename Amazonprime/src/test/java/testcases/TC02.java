package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Reporter;

@Listeners(demo.Listner.class)
public class TC02 {
	@Test
	public void m2() {
		Reporter.log("Tc2 Running");
	}
	
	
	
}


