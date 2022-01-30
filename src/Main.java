import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Zad1 Zad1 = new Zad1();
        Zad2 Zad2 = new Zad2();
        Zad3 Zad3 = new Zad3();
        Zad4 Zad4 = new Zad4();

        Zad1.setTab(Zad1.add_values(Zad1.getTab()));
        System.out.println(Arrays.toString(Zad1.getTab()));

        Zad2.setTab(Zad2.add_words(Zad2.getTab()));
        System.out.println(Arrays.toString(Zad2.getTab()));

        Zad3.write_personal_data(Zad3.getName());
        Zad3.write_personal_data(Zad3.getName(), Zad3.getSurname());
        Zad3.write_personal_data(Zad3.getName(), Zad3.getSurname(), Zad3.getAge());

        int zmiennaA = Zad4.add_integers(2, 3);
        int zmiennaB = Zad4.add_integers(7, 8, 9);

        System.out.println(zmiennaA + zmiennaB);



    }
}
