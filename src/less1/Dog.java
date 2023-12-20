package less1;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);//вызывает конструктор из энимал

    }

    @Override
    protected void fly() {
        System.out.println("Dog don't flies");
    }

}
