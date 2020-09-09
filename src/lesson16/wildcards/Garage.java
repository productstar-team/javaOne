package lesson16.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Garage<T> {
    private  final List<T> vehicles = new ArrayList<>();

    public void addCar(T t){
        vehicles.add(t);
    }

    public void addAll(List<? extends T> cars){
        vehicles.addAll(cars);
    }

    public List<T> getVehicles() {
        return vehicles;
    }
}
