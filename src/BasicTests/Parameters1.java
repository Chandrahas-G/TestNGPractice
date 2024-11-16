package BasicTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {

	@Parameters({ "URL" , "APIKey" })
	@Test
	public void test(String urlname, String key) {
		System.out.println(urlname);
		System.out.println(key);
	}
}
