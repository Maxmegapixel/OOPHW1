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
        //System.out.println(barsik.getLegsCount());
        Animal sharik = new Dog("Sharik", LocalDate.of(2002, 1, 12),
                new ArrayList<>(), "Chumka", "Boss");
        Animal bubble = new Fish("Bubble", LocalDate.of(2012, 12, 2),
                new ArrayList<>(), "Chumka", "Boss");
        Animal claw = new Eagle("Claw", LocalDate.of(2023, 1, 12),
                new ArrayList<>(), "Chumka", "Boss");
        Animal donald = new Duck("Donald", LocalDate.of(2012, 12, 2),
                new ArrayList<>(), "Chumka", "Boss");

//        List<Animal> animals = new ArrayList<>();
//        animals.add(barsik);
//        animals.add(sharik);

        // sharik.wakeup();
        // sharik.wakeup(2);

//        barsik.wakeup();
//        barsik.eat();
//        barsik.sleep();
//        barsik.play();
        barsik.lifeCycle();
        System.out.println(sharik);
        sharik.lifeCycle();
        System.out.println(bubble);
        bubble.lifeCycle();
        System.out.println(claw);
        claw.lifeCycle();
        System.out.println(donald);
        donald.lifeCycle();

    }
}

