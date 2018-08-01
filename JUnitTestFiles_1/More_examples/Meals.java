
public class Meals {
	 
	MealNames meal = MealNames.breakfast;
	  
	  public void nextMeal() {

		switch (meal) {
	    case breakfast:
	      meal = MealNames.lunch;
	      break;
	    case lunch:
	      meal = MealNames.supper;
	      break;
	    case supper:
	      meal = MealNames.breakfast;
	      break;
	    default:
	      meal = MealNames.breakfast;
	    }
	  }

	  public void skipmultiplemeals(int numberOfMeals) {

		  for (int i = 0; i < numberOfMeals; i++)
		    nextMeal();

	  }

	public MealNames getMeal() {
		return meal;
	}

	public void setMeal(MealNames meal) {
		this.meal = meal;
	}
}
