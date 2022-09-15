package Diziler;

public class diziler {


    public static void main(String[] args) {

        String[] adayisimleri= new String[3];
        adayisimleri[0]="Furkan";
        adayisimleri[1]="Fatih";
        adayisimleri[2]="Seyma";


        for (int i = 0; i < adayisimleri.length ; i++) {

            System.out.println(adayisimleri[i]);

        }
        for (String ogrenci:adayisimleri){
            System.out.println(ogrenci);
        }





    }







}
