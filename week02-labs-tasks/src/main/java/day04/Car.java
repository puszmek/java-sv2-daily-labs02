package day04;

public class Car {
    private int amountOfFuel;
    private int km;

    public double calculateConsumption() {
        return ((double)amountOfFuel / km) * 100;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
