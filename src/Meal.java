class Meal {
    private String name;
    private int calories;

    public Meal(String name, int calories){
        this.name = name;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }
}
