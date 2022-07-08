public class Main {
    public static void main(String[] args) {

        System.out.println("Hello zoo!");
        Meal banana = new Meal("Бананы", 680);
        Meal meat = new Meal("Мясо", 1430);
        int numberOfMonkeys = 5;
        int numberOfLions = 3;
        int numberOfBears = 2;
        Animal[] monkeys = new Monkey[numberOfMonkeys];
        Animal[] lions = new Lion[numberOfLions];
        Animal[] bears = new Bear[numberOfBears];
        for (int i = 0; i < monkeys.length; i++)
            monkeys[i] = new Monkey(1000, banana);
        for (int i = 0; i < lions.length; i++)
            lions[i] = new Lion(10000, meat);
        for (int i = 0; i < bears.length; i++)
            bears[i] = new Bear(15000, banana, meat);
        User u = new User("Федя");
        System.out.println("Федя посчитал количество еды на месяц (30 дней) для обезьян:");
        u.countMealsForAnimalAMonth(monkeys);
        System.out.println("Федя посчитал количество еды на месяц (30 дней) для львов:");
        u.countMealsForAnimalAMonth(lions);
        //System.out.println("Федя посчитал количество еды на месяц (30 дней) для медведей:");
        //u.countMealsForAnimalAMonth(bears);

    }
}