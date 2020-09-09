package lesson16.DZ3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stable<Horse> stable = new Stable<>();

        Mustang mustang = new Mustang();
        stable.addHorse(mustang);

        Pony pony = new Pony();
        stable.addHorse(pony);

        List<Mustang> wildMustangs = new ArrayList<>();
        wildMustangs.add(new Mustang());
        wildMustangs.add(new Mustang());

        stable.addHorses(wildMustangs);
    }
}
