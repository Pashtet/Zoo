import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;

abstract class Animal {
    private int caloriesConsumption;
    Meal meal;

    public Animal(int caloriesConsumption, Meal meal) {
        this.caloriesConsumption = caloriesConsumption;
        this.meal = meal;
    }

    public Meal getMeal() {
        return meal;
    }

    public int getCaloriesConsumption() {
        return caloriesConsumption;
    }
}

class Monkey extends Animal implements Eat, CountFood {
    public Monkey(int caloriesConsumption, Meal meal) {
        super(caloriesConsumption, meal);
    }

    @Override
    public void eatPerDay() {
        System.out.println("I'm eat " + Math.round(1.0 * this.getCaloriesConsumption() / this.getMeal().getCalories()) + " bananas a day.");
    }

    @Override
    public String eatPerMonth() {
        String s;
        s = "I'm eat " + Math.round(30.0 * this.getCaloriesConsumption() / this.getMeal().getCalories()) + " bananas a month";
        return s;
    }


    @Override
    public int countOneFoodAMonth() {
        return (int) Math.round(30.0 * this.getCaloriesConsumption() / this.getMeal().getCalories());
    }
}

class Lion extends Animal implements Eat, CountFood {

    public Lion(int caloriesConsumption, Meal meal) {
        super(caloriesConsumption, meal);
    }

    @Override
    public void eatPerDay() {
        System.out.println("I'm eat " + Math.round(1.0 * this.getCaloriesConsumption() / this.getMeal().getCalories()) + " meat a day.");
    }

    public String eatPerMonth() {
        String s;
        s = "I'm eat " + Math.round(30.0 * this.getCaloriesConsumption() / this.getMeal().getCalories()) + " meat a month.";
        return s;
    }

    @Override
    public int countOneFoodAMonth() {
        return (int) Math.round(30.0 * this.getCaloriesConsumption() / this.getMeal().getCalories());
    }
}

class Bear extends Animal implements Eat {
    Meal secondMeal;

    public Bear(int caloriesConsumption, Meal meal, Meal secondMeal) {
        super(caloriesConsumption, meal);
        this.secondMeal = secondMeal;
    }

    public Meal getSecondMeal() {
        return secondMeal;
    }

    @Override
    public void eatPerDay() {
        System.out.println("I'm eat " + Math.round(1.0 * this.getCaloriesConsumption() / 2 / this.getMeal().getCalories()) + " meat and " +
                Math.round(1.0 * this.getCaloriesConsumption() / 2 / this.getSecondMeal().getCalories()) + " bananas a day.");
    }

    public String eatPerMonth() {
        String s;
        s = "I'm eat " + Math.round(30.0 * this.getCaloriesConsumption() / 2 / this.getMeal().getCalories()) + " meat and " +
                Math.round(30.0 * this.getCaloriesConsumption() / 2 / this.getSecondMeal().getCalories()) + " bananas a month.";
        return s;
    }
}
