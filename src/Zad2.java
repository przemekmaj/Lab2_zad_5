import java.util.Scanner;

public class Zad2 {
    private String[] tab = new String[6];
    Scanner scanner = new Scanner(System.in);

    public String[] getTab() {
        return this.tab;
    }

    public void setTab(String[] tab3) {
        this.tab = tab3;
    }

    public String[] add_words(String[] tab4){
        for(int i = 0; i < 6;i++){
            System.out.print("Podaj "+(i+1)+" element tablicy: ");
            tab4[i]=scanner.nextLine();

        }
        return tab4;
    }
}
