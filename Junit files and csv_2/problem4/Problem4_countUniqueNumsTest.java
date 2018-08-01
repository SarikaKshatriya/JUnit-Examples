import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem4_countUniqueNumsTest {
	Problem4_countUniqueNums problem4;
	int [] nums = new int[10]; 
	@Before
	public void setUp() throws Exception {
		problem4=new Problem4_countUniqueNums();
	}
	@SuppressWarnings("unused")
	private static final Object[] parametersForcountUniqueNumsTest () {
		return $(
//				Parameters are: (1,2)
//						1=array of numbers, 2=unique
//				Test case 1 11-12-14-15-11-21:MCDC(TTT)
				$(new int[] {3},1),
//				Test case 2 11-21:empty array
				$(new int[] { },0),
//				Test case 3 11-12-11-21 and BV and MCDC(FTT)
				$(new int[] {10},0),
//				Test case 4 11-12-14-17-18-11-21:decrements count if repetes
				$(new int[] {3,3},0),
//				Test case 5 11-12-14-17-11-21:not decrements when again repets
				$(new int[] {3,3,3},0),
//				Test case 6 BV -9
				$(new int[] {-9},1),
//				Test case 7 BV -8
				$(new int[] {-8},0),
//				Test case 8 BV -10  and MCDC(FTT)
				$(new int[] {-10},0),
//				Test case 9 BV 8
				$(new int[] {8},0),
//				Test case 10 BV 9
				$(new int[] {9},1),
//				Test case 11 BV-1
				$(new int[] {-1},1),
//				Test case 12 BV:0 and MCDC(TTF)
				$(new int[] {0},0),
//				Test case 13 BV 1
				$(new int[] {1},1),
//				Test case 14 all valid numbers
				$(new int[] {-1,-3,-5,-7,-9,1,3,5,7,9},10),
//				Test case 15 all valid numbers repeats
				$(new int[] {-1,-3,-5,-7,-9,1,3,5,7,9,9,7,5,3,1,-1,-3,-5,-7,-9},0)
				

		);
	}
	@Parameters(method="parametersForcountUniqueNumsTest")
	@Test
	public void test(int[] nums, int unique) {
	assertEquals(unique,problem4.countUnique(nums));
}

}

