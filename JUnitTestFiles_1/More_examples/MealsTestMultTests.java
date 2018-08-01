
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MealsTestMultTests {

	Meals mymeal;
	
	@Before
	public void setUp() {
		mymeal=new Meals();
	}

	//@Test
	public void testNextMealTestCase1() {
	mymeal.setMeal(MealNames.breakfast);
	assertEquals(MealNames.breakfast,mymeal.meal);
	mymeal.nextMeal();
	assertEquals(MealNames.breakfast,mymeal.meal);
	}

	@Test
	public void testNextMealTestCase2() {
	mymeal.setMeal(MealNames.lunch);
	mymeal.nextMeal();
	assertEquals(MealNames.supper,mymeal.meal);
	}

	@Test
	public void testNextMealTestCase3() {
	mymeal.setMeal(MealNames.supper);
	mymeal.nextMeal();
	assertEquals(MealNames.breakfast,mymeal.meal);
	}

	@Test
	public void testSkipmultiplemeals() {
		mymeal.setMeal(MealNames.breakfast);
		mymeal.skipmultiplemeals(4);
		assertEquals(MealNames.lunch,mymeal.meal);
	}
}