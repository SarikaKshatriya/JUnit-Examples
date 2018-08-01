import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;



@RunWith(JUnitParamsRunner.class)
public class Problem_1_setWarningsTestJUnitParams {
	
	
private Problem_1_setWarnings setWarning;
@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_1_setWarningsTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=distance, 2=RedLight, 3=YellowLight, 4=GreenLight, 5=Buzzer,6=Brakes
//				Test case 1-200.0	false	false	true	false	false
				$(200.0,   false,false,	true,	false,	false),
//				Test case 2-75.1	false	true	false	false	false
				$(75.1,   false,true,false,	false,	false),
//				Test case 3-25.0	true	true	false	false	false
				$(25.0,   true,	true,false,	false,false),
//				Test case 4- 24.9	true	true	false	true	true
				$(24.9,true,true,false,true,true),
//				Test case 5- 250.0	false	false	true	false	false
				$(250.0,false,false,true,	false,	false),
//       		  Test case 6-199.9	false	true	false	false	false
				$(199.9,   false,	true,false,	false,	false),
//				Test case 7-75.0	true	true	false	false	false
				$(75.0,true,true,false,	false,	false),
//				Test case 8-0.0	true	true	false	true	true
				$(0.0, true,true,false,true,true)
				);
	}

	@Before
	public void setUp () {
		setWarning = new Problem_1_setWarnings();
	}

	@Test
	@Parameters(method="parametersForProblem_1_setWarningsTest")
		
	public void test(double distance,boolean redLight,boolean yellowLight,boolean greenLight,boolean buzzer,boolean brakes)
	  {
		
		setWarning.setWarnings(distance);
		assertEquals(redLight,setWarning.isRedLight());
		assertEquals(yellowLight,setWarning.isYellowLight());
		assertEquals(greenLight,setWarning.isGreenLight());
		assertEquals(buzzer,setWarning.isBuzzer());
		assertEquals(brakes,setWarning.isBrakes());
		}
	}


