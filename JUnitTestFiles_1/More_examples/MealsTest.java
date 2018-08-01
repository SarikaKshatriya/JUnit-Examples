
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MealsTest {

	Meals mymeal;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mymeal = new Meals();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNextMeal() {

  	/* Here we are relying on these tests to run sequentially and the output from the previous test case
	   becomes the input to the current. This is not a good practice but used for simplification

	   we don't need to use the setMeal() here because the switch sets the default value to breakfast
	*/
	assertEquals(MealNames.breakfast,mymeal.meal);
	mymeal.nextMeal();
	assertEquals(MealNames.lunch,mymeal.meal);

	//	Remove the comment delimiters below to raise a wrong assertion to show the exception raised
	//assertEquals(MealNames.breakfast,mymeal.meal);
	mymeal.nextMeal();
	assertEquals(MealNames.supper,mymeal.meal);

	//	Remove the comment delimiters below to raise a wrong assertion to show the exception raised
	//	assertEquals(MealNames.lunch,mymeal.meal);
	mymeal.nextMeal();
	assertEquals(MealNames.breakfast,mymeal.meal);
	}

	@Test
	public void testSkipmultiplemeals() {
		Meals mymeal=new Meals();
		mymeal.skipmultiplemeals(4);
		assertEquals(MealNames.lunch,mymeal.meal);
	}

}
