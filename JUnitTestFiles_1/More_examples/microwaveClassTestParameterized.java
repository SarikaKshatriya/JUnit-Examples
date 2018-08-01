
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class microwaveClassTestParameterized {

	private microwaveClass micOven;
	private int timer,timer_res;
    private boolean cooking, doorOpen,stopButton,cookState_res,stop_res;

    @Before
	public void setUp() throws Exception {
		micOven = new microwaveClass(false, false, 0);
	}

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
//			Parameters are: (1,2,3,4,5)
//			1=cooking, 2=doorOpen, 3=stopButton, 4=timer, 5=cookState_res,6=stop_res,7=timer_res
//			Test case 1
            {true,   false,		true, 1,	true,	false,	0}, 

//			Test case 2
            {true,   false,		false,1,	false,	false,	0}, 
            
//			Test case 3
            {true,   false,		false,0,	false,	true,	0}, 

//			Test case 3a
            {true,   true,		false,0,	true,	true,	0},
            
//			Test case 3b            
            {false,  true,		false,0,	false,	true,	0}
       });
    }

    public microwaveClassTestParameterized(boolean cooking, boolean doorOpen, boolean stopButton, int timer, boolean cookState_res, boolean stop_res, int timer_res) {
    	this.cooking=cooking;
    	this.doorOpen=doorOpen;
    	this.stopButton=stopButton;
    	this.cookState_res=cookState_res;
    	this.stop_res=stop_res;
    	this.timer=timer;
    	this.timer_res=timer_res;
    }
	@Test
	public void test() {
		micOven.setTimer(timer);
		micOven.operateMicrowave(cooking, doorOpen, stopButton);
		assertEquals(cookState_res,micOven.isCookState());
		assertEquals(stop_res,micOven.isStop());
		assertEquals(timer_res,micOven.getTimer());
		}
}
