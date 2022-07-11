public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    void countMealsForAnimalPerDay(Animal[] animals) {
        double result = 0;
        for (Animal a : animals) {
            Eat e = (Eat) a;
            e.eatPerDay();
        }
    }

    void countMealsForAnimalAMonth(Animal[] animals) {
        int foodAMonth = 0;
        String typeFood;
        typeFood = animals[0].getMeal().getName();
        for (Animal a : animals) {
            CountFood cf = (CountFood) a;
            foodAMonth += cf.countOneFoodAMonth();
        }
        System.out.println("Необходимо " + foodAMonth + " еды типа " + typeFood);
    }

    void countMealsForAnimalAMonth(Animal2[] animals) {
        int foodAMonth = 0, food2AtMonth = 0;
        String typeFood, typeFood2;
        typeFood = animals[0].getMeal().getName();
        typeFood2 = animals[0].getSecondMeal().getName();
        for (Animal2 a : animals) {
            CountFood cf = (CountFood) a;
            foodAMonth += cf.countOneFoodAMonth()/2;
            food2AtMonth += a.countSecondFoodAMonth()/2;
        }
        System.out.println("Необходимо " + foodAMonth + " еды типа " + typeFood + " и " + food2AtMonth + " еды типа " + typeFood2);
    }

}
