package String;

public class string {


    public static void main(String[] args) {
        String cumle="Bugun okulun son gunu";

        System.out.println("Cumlenin eleman sayisi"+cumle.length());
        System.out.println("cumlenin 3.elemanı"+cumle.charAt(2));
        System.out.println(cumle.concat("----- ekleme cumle"));
        System.out.println(cumle.startsWith("B"));
        System.out.println(cumle.endsWith("g"));

        char[] karakter= new char[5];

        cumle.getChars(0,5,karakter,0);
        System.out.println(karakter);
        System.out.println(cumle.indexOf("ug"));

    }
}
