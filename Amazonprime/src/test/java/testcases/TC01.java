package testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Reporter;

@Listeners(demo.Listner.class)
public class TC01 {
@Test
	public void m1() {
		Reporter.log("TC01 running");	
	}
	

	

}
