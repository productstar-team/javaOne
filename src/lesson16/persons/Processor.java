package lesson16.persons;

public class Processor <T extends Person> {
    T object;
    public Processor(T object) {
        this.object = object;
    }

    public void makeObjectDoSomething(){
        object.saySomething();
    }
}
