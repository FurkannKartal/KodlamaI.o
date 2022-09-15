package IF_Bloklari;

public class SayiKarsilastirma {

    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=42;
        int sayi3=12;
        int enbuyuksayi=sayi3;

        if (enbuyuksayi<sayi2){
            enbuyuksayi=sayi2;

        }
        if (enbuyuksayi<sayi3){
            enbuyuksayi=sayi3;
        }
        System.out.println("En buyuk sayi = "+enbuyuksayi);


    }
}
