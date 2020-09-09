package lesson16.inherit;

public class BaseSpawner <T> {
    private Class<T> classT;
    public BaseSpawner(Class<T> classT) {
        this.classT = classT;
    }
    public T spawn() throws IllegalAccessException, InstantiationException {
        return classT.newInstance();
    }

}
