
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class microwaveClassTestCase1 {

	private microwaveClass micOven;
	private boolean cooking,doorOpen, stopButton,cookState_res,stop_res;
	private int timer, timer_res;
	
	@Before
	public void setUp() {
		micOven = new microwaveClass(false, false, 0);
	}

	@Test
	public void test() {
//		test case 1
//		cooking,	doorOpen, 	stopButton,	timer, 	cookState_res,	stop_res,	timer_res
//		true,   	false,		true, 		1,		true,			false,		0
		cooking=true; doorOpen=false;stopButton=true;timer=1;cookState_res=true;stop_res=false;timer_res=0;
		micOven.setTimer(timer);
		micOven.operateMicrowave(cooking, doorOpen, stopButton);		
		assertEquals(cookState_res,micOven.isCookState());
		assertEquals(stop_res,micOven.isStop());
		assertEquals(timer_res,micOven.getTimer());

//		test case 2
//		cooking,	doorOpen, 	stopButton,	timer, 	cookState_res,	stop_res,	timer_res
//		true,   	false,		false, 		1,		false,			false,		0
		cooking=true; doorOpen=false;stopButton=false;timer=1;cookState_res=false;stop_res=false;timer_res=0;
		micOven.setTimer(timer);
		micOven.operateMicrowave(cooking, doorOpen, stopButton);		
		assertEquals(cookState_res,micOven.isCookState());
		assertEquals(stop_res,micOven.isStop());
		assertEquals(timer_res,micOven.getTimer());

//		test case 3
//		cooking,	doorOpen, 	stopButton,	timer, 	cookState_res,	stop_res,	timer_res
//		true,   	false,		false, 		0,		false,			true,		0


//		test case 3a
//		cooking,	doorOpen, 	stopButton,	timer, 	cookState_res,	stop_res,	timer_res
//		true,   	true,		false, 		0,		true,			true,		0


//		test case 3b
//		cooking,	doorOpen, 	stopButton,	timer, 	cookState_res,	stop_res,	timer_res
//		false,   	true,		false, 		0,		false,			true,		0

	}

}
