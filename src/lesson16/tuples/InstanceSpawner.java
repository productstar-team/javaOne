package lesson16.tuples;

public class InstanceSpawner<T, C> {
    private Class<T> classT;
    private Class<C> classC;
    public InstanceSpawner(Class<T> classT, Class<C> classC) {
        this.classT = classT;
        this.classC = classC;
    }
    public T spawnT() throws IllegalAccessException, InstantiationException {
        return classT.newInstance();
    }
    public C spawnC() throws IllegalAccessException, InstantiationException {
        return classC.newInstance();
    }

}
