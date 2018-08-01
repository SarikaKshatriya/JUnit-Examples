
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class microwaveClassTestJUnitParams {

	private microwaveClass micOven;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersFormicrowaveClassTest () {
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//				Test case 1
				$(true,   false,	true, 1,	true,	false,	0),
//				Test case 2
				$(true,   false,	false,1,	false,	false,	0),
//				Test case 3
				$(true,   false,	false,0,	false,	true,	0),
//				Test case 3a
				$(true,   true,		false,0,	true,	true,	0),
//				Test case 3b
				$(false,  true,		false,0,	false,	true,	0)
		);
	}

	@Before
	public void setUp () {
		micOven = new microwaveClass(false, false, 0);
	}
	
	@Test
	@Parameters(method="parametersFormicrowaveClassTest")
	public void test(boolean cooking, boolean doorOpen, boolean stopButton, int timer, boolean cookState_res, boolean stop_res, int timer_res) {
		
		micOven.setTimer(timer);
		micOven.operateMicrowave(cooking, doorOpen, stopButton);
		assertEquals(cookState_res,micOven.isCookState());
		assertEquals(stop_res,micOven.isStop());
		assertEquals(timer_res,micOven.getTimer());
	}

}
