package less1;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{
    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    protected void toGo() {
        System.out.println("Fish don't goes");
    }

    @Override
    protected void fly() {
        System.out.println("Fish don't flies");
    }

}
