package lesson16.inherit;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        StringSpawner stringSpawner = new StringSpawner();
        String str = stringSpawner.spawn();
        System.out.println(str.getClass());
    }
}
