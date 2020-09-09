package lesson16.tuples;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        InstanceSpawner<String, ArrayList> spawner = new InstanceSpawner<>(String.class, ArrayList.class);
        String str = spawner.spawnT();
        System.out.println(str.getClass());

        ArrayList list = spawner.spawnC();
        System.out.println(list.getClass());
    }
}
