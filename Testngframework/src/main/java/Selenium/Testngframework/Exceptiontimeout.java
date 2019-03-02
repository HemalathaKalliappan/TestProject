package Selenium.Testngframework;

import org.testng.annotations.Test;

public class Exceptiontimeout {
	
	@Test(invocationTimeOut=2)
	public void test() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x ="200X";
		Integer.parseInt(x);
			
	}

}
