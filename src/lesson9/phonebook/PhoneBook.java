package lesson9.phonebook;

import java.util.Scanner;

import static lesson9.phonebook.Person.findPerson;
import static lesson9.phonebook.Person.initBD;

public class PhoneBook {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        initBD();

        System.out.print("Для поиcка по имени введите 1, по номеру 2, email 3: ");
        String searchType = in.nextLine();

        System.out.print("Введите поисковое значение: ");
        String searchString = in.nextLine();

        findPerson(searchType, searchString);

    }
}

class Person {
    private String name;
    private String phone;
    private String email;
    private static Person[] persons = new Person[10];

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }

    public static void initBD() {
        persons[0] = new Person("Юля", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("Сергей", "777777", "borya@yandex.com");
        persons[2] = new Person("Друган", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
    }

    public String toString() {
        return "\n\nName: " + this.getName() + "\nPhone number: " + this.getPhone() + "\nEmail: " +
                this.getEmail();
    }

    // поиск человека
    public static void findPerson(String searchType, String searchString) {

        switch (searchType) {
            case "1":
                //по имени
                System.out.println(findName(searchString, persons));
                break;
            case "2":
                //по телефону
                break;
            case "3":
                // по почте
                break;
            default:
                break;
        }
    }

    public static Person findName(String name, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.getName().equals(name)) {
                return person;
            }
        }
        System.out.println("нет такого человека");
        return null;
    }

}

/*
 ДЗ
Дописать методы поиска для телефона и почты
Сделать так же выход
Продумать обработку исключений для поиска по пустым значениям

*/