public class Coffee {
    private int amountOfMilk;
    private int gramsOfCoffee;
    private int amountOfSugar;
    private int amountOfWater;
    private String name;

    public Coffee(String name, int amountOfMilk, int gramsOfCoffee, int amountOfSugar, int amountOfWater) {
        this.name = name;
        this.amountOfMilk = amountOfMilk;
        this.gramsOfCoffee = gramsOfCoffee;
        this.amountOfSugar = amountOfSugar;
        this.amountOfWater = amountOfWater;
    }
    public Coffee(){
        this(null, 0, 0, 0, 0);
    }

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public void setAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }

    public int getGramsOfCoffee() {
        return gramsOfCoffee;
    }

    public void setGramsOfCoffee(int gramsOfCoffee) {
        this.gramsOfCoffee = gramsOfCoffee;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }

    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public void setAmountOfWater(int amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "amountOfMilk=" + amountOfMilk +
                ", gramsOfCoffee=" + gramsOfCoffee +
                ", amountOfSugar=" + amountOfSugar +
                ", amountOfWater=" + amountOfWater +
                ", name='" + name + '\'' +
                '}';
    }
}
