import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class Problem_4_isPrimeShipperTestJUnitParams {
	private Problem_4_isPrimeShipper problem4;
	int numItems,yearsCust;
	double total,shippingCost;
	boolean a;
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_4_isPrimeShipperTest () {
		return $(
//				Parameters are:1=numItems,2=yearsCust,3=total,4=shippingCost,5=a
				//Test case 1 	9	11	$50,000.01	$49.99 true
				$(9,11,50_001.00,49.99,true),
				//Test case 2 9	11 $50,000.00	$49.99	false
				$(9,11,50_000.00,49.99,false),
				//Test case 3 	9	11	$50,000.00	$50.00 false
				$(9,11,50_000.01,50.00,false),
				//Test case 4 	8	11	$50,000.01	$49.99 false
				$(8,11,50_000.01,49.99,false),
				//Test case 5 	9	10 $50,000.01	$49.99	false
				$(9,10,50_000.01,49.99,false),
				//Test case 6 	9	11	 $0.00	$49.99 false
				$(9,11,0.00,49.99,false),
				//Test case 7 	9	11	$100,000.00	$49.99 true
				$(9,11,100_000.00,49.99,true),
				//Test case 8	9	11	 $50,000.01	$0.00 true
				$(9,11,50_000.01,0.00,true),
				//Test case 9 	9	11	 $50,000.01	$100.00 false
				$(9,11,50_000.01,100.00,false),
				//Test case 10 	0	11 $50,000.01	$49.99	false
				$(0,11,50_000.01,49.99,false),
				//Test case 11 	20	11 $50,000.01	$49.99	true
				$(20,11,50_000.01,49.99,true),
				//Test case 12 	9	0 $50,000.01	$49.99	false
				$(9,0,50_000.01,49.99,false),
				//Test case 13 	9	50	$50,000.01	$49.99 true
				$(9,50,50_000.01,49.99,true)
				);
	}
	@Before
	public void setUp() throws Exception {
		problem4=new Problem_4_isPrimeShipper();
	}



	@Test
	@Parameters(method="parametersForProblem_4_isPrimeShipperTest")
	public void test(int numItems, int yearsCust, double total, double shippingCost,boolean a) {
		
		assertEquals(a,problem4.isPrimeShipper(numItems,yearsCust,total,shippingCost));
	}

}
