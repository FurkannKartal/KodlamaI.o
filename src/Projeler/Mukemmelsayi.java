package Projeler;

public class Mukemmelsayi {
    public static void main(String[] args) {
        int number =5;
        int toplam=0;

        for (int i = 1; i <number-1 ; i++) {

            if (number%i==0){
                toplam=toplam+1;
            }

        }

        if (toplam==number){
            System.out.println("Mukemmel sayidir");
        }else
            System.out.println("Mukemmel sayi değildir");

    }
}
