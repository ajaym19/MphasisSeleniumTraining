package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider = "getLoginData")
	public void loginTest(Object uname, Object pwd) {
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		//create an object of Object Class
		//first parameter >> no. of rows
		//second parameter >> no. of columns per row
		//indexing starts from 0
		Object[][] data = new Object[3][2];
		data[0][0] = "admin";
		data[0][1] = "admin123";
		data[1][0] = "hr";
		data[1][1] = "hr123";
		data[2][0] = "manager";
		data[2][1] = "manager123";
		
		return data;
	}
	
}
