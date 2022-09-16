package Projeler;

public class SayiAsalmi {

    public static void main(String[] args) {

        int number=25;
        boolean asal=true;

        for (int i = 2; i <number-1 ; i++) {
           if (number%i==0){
               asal=false;

           }

           }
        if (asal==true){
            System.out.println("Sayi asaldir");
        }else
            System.out.println("Sayi asal degildir");

    }
}
