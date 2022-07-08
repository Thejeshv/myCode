package com.myCode.Testcases;
import org.testng.annotations.Test;
import com.myCode.pageObjects.LoginPage;

public class Testcase01 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			System.out.println("login successfull");
			lp.clickLogout();
		}

	}

}
