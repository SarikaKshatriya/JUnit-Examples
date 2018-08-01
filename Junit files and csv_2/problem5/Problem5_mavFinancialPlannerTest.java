import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5_mavFinancialPlannerTest {
	//double portfolio_amount;
	double closing_price=140.0;
	 Problem5_mavFinancialPlanner problem5;
	 Problem5_calcPlanInterface mockobj;
	@Before
	public void setUp() throws Exception {
		problem5=new Problem5_mavFinancialPlanner();
		mockobj=EasyMock.createMock(Problem5_calcPlanInterface.class);
	}
	@Test
	@FileParameters("src/p5testcase.csv")
	public void test(int testCaseNumber,int number_of_shares,double portfolio_amount,String bPath ) {
		EasyMock.expect(mockobj.getShares()).andReturn(number_of_shares);
		EasyMock.replay(mockobj);
		problem5.setMavPlan(mockobj);
		problem5.calculate_balance(closing_price);
		problem5.setPortfolio_amount(portfolio_amount);
		assertEquals(portfolio_amount,problem5.getPortfolio_amount(),0.01);
		EasyMock.verify(mockobj);
		EasyMock.reset(mockobj);
	}

}

