import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)
public class Problem1_microwaveClassTest {
	private Problem1_microwaveClass problem1;
//	boolean cooking=false,stopButton=false,startButton=false,doorOpen=false;
//	int timer=0;




	@Test
	@FileParameters("src/HW5P1.csv")
	public void test(int testCaseNumber,boolean cooking,boolean stopButton,boolean startButton,boolean doorOpen,int timer,boolean opcooking,int optimer,String bPath ) {
		problem1=new Problem1_microwaveClass(cooking,timer);
		problem1.operateMicrowave(stopButton,startButton,doorOpen);

		assertEquals(opcooking,problem1.iscooking());
		assertEquals(optimer,problem1.getTimer());
		
		
	}

}


