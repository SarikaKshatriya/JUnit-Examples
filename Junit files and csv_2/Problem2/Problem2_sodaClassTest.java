import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2_sodaClassTest {
	private Problem2_sodaClass problem2;


	@Before
	public void setUp() throws Exception {
		problem2=new Problem2_sodaClass("Welcome",false,false,Problem2_sodaEnum.Start);
	}
	
	

	@Test
	@FileParameters("src/problem2Testcase.csv")
	//test case 2-13
	public void test(int testCaseNumber,Problem2_sodaEnum currentstate,Problem2_sodaEnum nextstate,boolean q,boolean s,boolean r,boolean d,boolean c,String m) {
		problem2=new Problem2_sodaClass(m,c,d,currentstate);
		problem2.processState (q,s,r);
		problem2.setState(nextstate);
		assertEquals(m,problem2.getM());
		assertEquals(c,problem2.isC());
		assertEquals(d,problem2.isD());
		assertEquals(nextstate,problem2.getState());
		
	}

}

