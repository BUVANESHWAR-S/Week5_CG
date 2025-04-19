import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }
}

class Meal<T extends MealPlan> {
    T meal;
    Meal(T meal) {
        this.meal = meal;
    }
    String describeMeal() {
        return "Meal Type: " + meal.getMealType();
    }
}

class MealPlanner {
    <T extends MealPlan> Meal<T> generatePlan(T meal) {
        return new Meal<>(meal);
    }

    <T extends MealPlan> boolean validateMealPlan(Meal<T> meal) {
        return meal.meal != null && meal.meal.getMealType() != null;
    }
}

public class gn4 {
    public static void main(String[] args) {
        MealPlanner planner = new MealPlanner();

        Meal<VeganMeal> vegan = planner.generatePlan(new VeganMeal());
        Meal<KetoMeal> keto = planner.generatePlan(new KetoMeal());

        if (planner.validateMealPlan(vegan)) {
            System.out.println(vegan.describeMeal());
        }

        if (planner.validateMealPlan(keto)) {
            System.out.println(keto.describeMeal());
        }
    }
}
