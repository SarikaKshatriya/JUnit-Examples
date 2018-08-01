
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3_railroadClassTest {

	private Problem3_railroadClass p3;
	
	@Before
	public void setUp () {
		p3 = new Problem3_railroadClass();
	}
	
	@Test
	@FileParameters("src/test3.csv")	
	public void test(int testcaseNumber,int boxInCarNum, int rrCarNum, int shipmentNum,int currBox,String bpNumber) {		
		p3.calcCurrBoxNumber (boxInCarNum,rrCarNum,shipmentNum);
		assertEquals(currBox,p3.calcCurrBoxNumber (boxInCarNum,rrCarNum,shipmentNum));
	
	}
}
