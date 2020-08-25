package lesson6;

public class CombustionCar extends Car{

    public CombustionCar(String name, int hp, int weight, CarType carType) {
        super(name, hp, weight, carType);
    }

    @Override
    public void drive() {
        getEngine().startEngine();
        getWheel().steer();
        getEngine().stopEngine();
    }
}
