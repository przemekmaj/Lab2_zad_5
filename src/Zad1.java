public class Zad1 {
    private int[] tab = new int[20];

    public int[] getTab(){
        return  this.tab;
    }

    public void setTab(int[] tab1){
        this.tab = tab1;
    }

    public int[] add_values(int[] tab2){
        for(int i = 19; i >= 0; i--){
            tab2[i] = 40 - i;
        }
        return tab2;
    }
}
