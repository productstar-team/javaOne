package lesson16.wildcards;

import lesson16.Car;
import lesson16.Drivable;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garage<Car> carsGarage = new Garage<>();
        carsGarage.addCar(new Car());
        carsGarage.addCar(new Ferrari());

        List<Maseratti> newMaseratti = Arrays.asList(new Maseratti(), new Maseratti());
        carsGarage.addAll(newMaseratti);

        Garage<Car> carGarage = new Garage<>();
        Garage<Drivable> newGarage = new Garage<>();

        move(carGarage, newGarage);
    }

    public static <T> void move(Garage<? extends T> source, Garage<? super T> destination){
        destination.addAll(source.getVehicles());
    }

}
