import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem_2_GndCollWarnClassParameterized {
	private Problem_2_GndCollWarnClass problem2;
	private int timer;
	private double altfeet;
	private boolean gearUp,gndCollCaut, gndCollWarn, gndCollAlert,emerGD;
	
	
	@Before
	public void setUp() throws Exception {
		problem2= new Problem_2_GndCollWarnClass();
	}

	   @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
//	    		Parameters are: (1=gearUp,2=altfeet,3=gndCollCaut,4=gndCollWarn,5=gndCollAlert,6=emerGD)
//	    		Test Case 1:true 200.1	true	false	false	false
	        	{true, 200.1,	true,	false,	false,	false},	        	
//	    		Test Case 2:false	201.1	false	false	false	false
	        	{false	,200.1	,false	,false	,false	,false},
//	      		Test Case 3:true	400.1	false	false	false	false
	        	{true,	400.1,	false,	false,	false,	false},
//	    		Test Case 4:true 100.1	false	true false false
	        	{true, 100.1,	false,	true, false, false},
//	    		Test Case 5:true	50.0	false	false	true	true
	        	{true,	50.0,	false,	false,	true,	true},
//	    		Test Case 6:true 50.1	false	false true false
	        	{true, 50.1,	false,	false, true, false},
//	    		Test Case 7:true 50,000.0	false	false false false
	        	{true, 50_000.0,	false,	false, false, false},
//	    		Test Case 8:true 400.0	true false	false	false
	        	{true, 400.0,	true, false,	false,	false},
//	            Test Case 9:true	200.0	false	true	false	false
	            {true,	200.0,	false,	true,	false,	false},
//	    		Test Case 10:true	100.0	false	false true 	false
	            {true,	100.0,	false,	false, true, 	false},
//	    		Test Case 11:true 0.0	false	false	true true
	            {true, 0.0,	false,	false,	true, true}
	       });
	    }
	    public Problem_2_GndCollWarnClassParameterized(boolean gearUp,double altfeet,boolean gndCollCaut,boolean gndCollWarn,boolean gndCollAlert,boolean emerGD)
	    {
	    	this.gearUp=gearUp;
	    	this.altfeet=altfeet;
	    	this.gndCollCaut=gndCollCaut;
	    	this.gndCollWarn=gndCollWarn;
	    	this.gndCollAlert=gndCollAlert;
	    	this.emerGD=emerGD;
	       	
	    }
	    	
	    @Test
	    public void test() {
			problem2.gndCollWarning(gearUp,altfeet);
			problem2.setTimer(timer);
			problem2.setGndCollWarn(gndCollWarn);
			problem2.setGndCollCaut(gndCollCaut);
			problem2.setGndCollAlert(gndCollAlert);
			problem2.setEmerGD(emerGD);
			assertEquals(timer,problem2.getTimer());
			assertEquals(gndCollCaut,problem2.isGndCollCaut());
			assertEquals(gndCollWarn,problem2.isGndCollWarn());
			assertEquals(gndCollAlert,problem2.isGndCollAlert());
			assertEquals(emerGD,problem2.isEmerGD());
	
	}

}
