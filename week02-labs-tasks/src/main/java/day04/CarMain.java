package day04;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(482);

        System.out.println("Tankolás ára: " + gasStation.tankCar(car, 35) + " Ft.");

        car.setKm(547);

        System.out.println("Átlagfogyasztás 100 km-en: " + car.calculateConsumption() +" l.");
    }
}
