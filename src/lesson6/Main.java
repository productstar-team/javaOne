package lesson6;

public class Main {

    public static void main(String[] args) {
        Car mazdaCx5 = new CombustionCar("Mazda", 120, 2200, CarType.SUV);
        mazdaCx5.describe();

        Car tesla = new ElectricCar("Tesla", 250, 2000, CarType.SEDAN);
        tesla.describe();

        MotorBike motorBike = new MotorBike();

        drive(mazdaCx5);
        drive(tesla);
        drive(motorBike);
    }


    public static void drive(Drivable driveable){
        driveable.drive();
    }
}
