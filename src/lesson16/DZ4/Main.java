package lesson16.DZ4;

public class Main {
    public static void main(String[] args) {
        Stable<Horse> stable = new Stable<>();
        Stable<Animal> animalsStable = new Stable<>();
        moveHorses(stable, animalsStable);
    }

    public static <T> void moveHorses(Stable<? extends T> source, Stable<? super T> destination){
        destination.addHorses(source.getHorses());
    }

}
