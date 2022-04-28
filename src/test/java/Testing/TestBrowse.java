package Testing;

import java.io.IOException;

import org.testng.annotations.Test;

import com.testing.Base;

public class TestBrowse extends Base {
	
	@Test()
	public void basePageLoad() throws IOException {
		driver.get(getBaseURL());
	}
	
	
	
}
