public class Zad3 {
    private final String name = "Przemysław";
    private final String surname = "Majewski";
    private final int age = 22;

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getAge(){
        return age;
    }

    public void write_personal_data(String imie){
        System.out.println("Mam na imię " + imie + ".");
    }

    public void write_personal_data(String imie, String nazwisko){
        System.out.println("Nazywam się " + imie + " " + nazwisko + ".");
    }

    public void write_personal_data(String imie, String nazwisko, int wiek){
        System.out.println("Nazywam się " + imie + " " + nazwisko + ". Mam " + wiek + " lata.");
    }
}