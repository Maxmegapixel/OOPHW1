package lesson;

public class Employe {
    // состояние
    private long ID;  // поля класса
    private String name;
    private int countOfChildren;
    private double salary;
    private Adress adress;

    // поведение (методы)
    public Employe(String name, double salary) { // конструктор (alt+ins вызов меню)
        this(name); // при идентичной записи в конструкторе (берется из нижнего), должен быть на первой строке
        this.salary = salary;
    }

    public Employe(String name) { // нельзя создать конструктор с такими же типами параметров (стринг, дабл уже есть)
        this.name = name;
    }

    public Employe(String name, double salary, int countOfChildren) {
        this(name, salary);
        this.countOfChildren = countOfChildren;
    }

    public String getName() { // getter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
