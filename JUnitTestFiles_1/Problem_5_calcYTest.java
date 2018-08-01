
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class Problem_5_calcYTest {
	Problem_5_calcY  problem5;
	double x,y;
	@Before
	public void setUp() throws Exception {
		 problem5 = new Problem_5_calcY();
	}

	@Test
	@FileParameters("src/Problem_5.csv")
	public void test(int testcaseNumber,double x, double y,String bpNumber ) {
		assertEquals(y,problem5.calcY(x),0.01);
	}

}
