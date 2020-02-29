package demo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ForcefullySkipping {
	
	@Test
	public void skipp() {
		throw new SkipException("forcefully skipping");
	}

}
