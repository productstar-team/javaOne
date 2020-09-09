package lesson16.params;

import lesson16.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        adjustCarPrice(new Wrapper<>(500000, new Car()));

        List<String> stringList = getNewList();
        stringList.add("В лесу раздавался топор дровосека");



        List<Integer> intList = getNewList();
        intList.add(1);



        Long someVal = validateSource(new Long(10));
        System.out.println(++someVal);
        String someText = "Here is";
        String newText = validateSource(someText) + " some text";
        System.out.println(newText);
    }

    private static void adjustCarPrice(Wrapper<Car> wrapper){
        wrapper.getAsset().drive();
        wrapper.setPrice(wrapper.getPrice() + 10000);
    }

    public static <T> List<T> getNewList() {
        return new ArrayList<T>();
    }

    private static <T> T validateSource(T source){
        if (source == null){
            throw new UnsupportedOperationException("Can not process null entity");
        }
        return source;
    }


}
