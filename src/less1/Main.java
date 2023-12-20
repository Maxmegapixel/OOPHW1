package less1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final LocalDate LocalDate = null;

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal sharik = new Dog("Шарик", LocalDate.of(2002, 1, 12),
                new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animalses = new ArrayList<>();
        animalses.add(barsik);
        animalses.add(sharik);
        // sharik.wakeup();
        // sharik.wakeup(2);
        System.out.println("_______________________");
        // barsik.wakeup();
        // barsik.eat();
        // barsik.sleep();
        // barsik.play();
        barsik.lifiCycle();

    }
}

