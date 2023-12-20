package less1;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {// extends расширяет класс (Cft класс наследник класса Animal)

    private int legsCount; // количество лап


    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);//вызывает конструктор из энимал
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    protected void fly() {
        System.out.println("Cat don't flies");
    }

    @Override
    protected void swim() {
        System.out.println("Cat don't swims");
    }

}
