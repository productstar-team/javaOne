package lesson5;

public class Docent extends Person {

    @Override
    public void sayHi() {
        System.out.println("Yo, mate! I'm a docent. Respect my authority!");
    }

    public void makeStudentsSuffer(){
        System.out.println("You shall not pass!");
    }
}
