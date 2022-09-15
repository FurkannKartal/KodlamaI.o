package Projeler;

public class Ardisik_sayiler {
    public static void main(String[] args) {

        int sayi1=220;
        int sayi2=284;

        int topla1=0;
        int topla2=0;
        for (int i = 0; i < sayi1-1; i++) {
            if (sayi1%i==0){
                topla1=topla1+i;
            }
            
        }
        for (int i = 0; i <sayi2-1 ; i++) {
            if (sayi2%i==0){
                topla2=topla2+1;
            }
            
        }
        if (sayi1==topla2 && sayi2==topla1){
            System.out.println("Bu sayilar arkadastir");
        }
    }
}
