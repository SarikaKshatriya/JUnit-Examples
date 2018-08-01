import static junitparams.JUnitParamsRunner.$;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
@RunWith(JUnitParamsRunner.class)
public class Problem_3_maverickFinancialPlannerTestJUnitParams {
	private Problem_3_maverickFinancialPlanner problem3;
//	private int number_of_shares;
	private double closing_price=140.0;

	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_3_maverickFinancialPlannerTest () {
		return $(
//				Parameters are: 1=number_of_shares,2=portfolio_amount
				//Test case 1 50	$7,009.50
				 $(50,7_009.50),
				//Test case 2 299	$42,375.11
				 $(299,42_375.11),
				//Test case 3 750	$107,100.00
				 $(750,107_100.00), 
				//Test case 4 999	$143,356.50
				$(999,143_356.50),
				//Test case 5 2000	$287,700.00
				$(2_000,287_700.00),
				//Test case 6 2001	$289,944.90
				 $(2_001,289_944.90),
				//Test case 7 10,000	$1,449,000.00
				 $(10_000,1_449_000.00),
				//Test case 8 1000	$143,850.00
				$(1_000,143_850.00),
				//Test case 9 751	$107,768.50
				$(751,107_768.50),
				//Test case 10 300	$42,840.00
				$(300,42_840.00),
				//Test case 11 51	$7,186.39
				$(51,7_186.39),
				//Test case 12 0	-$50.00
				$(0,-50.00)
				);
	}


	@Before
	public void setUp() throws Exception {
		problem3=new Problem_3_maverickFinancialPlanner();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Parameters(method="parametersForProblem_3_maverickFinancialPlannerTest")
	public void test(int number_of_shares,double portfolio_amount ) {
		problem3.calculate_balance(number_of_shares,closing_price);
		problem3.setPortfolio_amount(portfolio_amount);
		assertEquals(portfolio_amount,problem3.getPortfolio_amount(),0.01);

		
	}

}
