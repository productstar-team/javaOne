package lesson16.persons;

public class Main {
    public static void main(String[] args) {
        Processor<Student> studentProcessor = new Processor<>(new Student());
        studentProcessor.makeObjectDoSomething();

        Processor<Docent> docentProcessor = new Processor<>(new Docent());
        docentProcessor.makeObjectDoSomething();
    }


}
