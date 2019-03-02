package Selenium.Testngframework;

import org.testng.annotations.Test;

public class InnovationCount {

	@Test(invocationCount=10)
	public void test() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
