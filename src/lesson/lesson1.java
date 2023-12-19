package lesson;

public class lesson1 {
    public static void main(String[] args) { // static (если переменная статическая, он относится ко всему классу, иначе к экземпляру)
        Employe vasa = new Employe("Вася", 123); // (заполняется по конструктору)
        System.out.println(vasa.getName());
        vasa.setName("Алена");
        System.out.println(vasa.getName());
    }
}
