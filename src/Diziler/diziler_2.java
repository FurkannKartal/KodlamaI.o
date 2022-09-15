package Diziler;

public class diziler_2 {


    public static void main(String[] args) {
        double[] liste={1,2,3,4,5,6,2,5,8,1};
        double toplam=0;
        double max=liste[0];
        for (double sayi:liste){
            toplam=toplam+sayi;
            if (max<sayi){
                max=sayi;
            }


        }
        System.out.println(toplam);
        System.out.println("max sayi="+max);



    }
}
