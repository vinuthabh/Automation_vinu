package my_project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void demo() {
		Reporter.log("bye bye",true);
	}
}
