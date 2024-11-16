package BasicTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters2 {

	@Parameters({ "URL" , "APIKey"})
	@Test
	public void test(String urlname, String key) {
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(dataProvider = "getData")
	public void login(String name, String pass) {
		System.out.println(name);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] Data = new Object[3][2];
		Data[0][0] = "UserName1";
		Data[0][1] = "Password1";
		
		Data[1][0] = "UserName2";
		Data[1][1] = "Password2";
		
		Data[2][0] = "UserName3";
		Data[2][1] = "Password3";
		
		return Data;
	}
}
