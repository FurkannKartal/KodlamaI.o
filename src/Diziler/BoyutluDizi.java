package Diziler;

public class BoyutluDizi {
    public static void main(String[] args) {
        String[][] ulkeler= new String[3][3];

        ulkeler[0][0]="turkey";
        ulkeler[0][1]="ABD";
        ulkeler[0][2]="Polnya";
        ulkeler[1][0]="Alamnya";
        ulkeler[1][1]="France";
        ulkeler[1][2]="Norveç";
        ulkeler[2][0]="Danimarka";
        ulkeler[2][1]="Kore";
        ulkeler[2][2]="Japonya";

        for (int i = 0; i <= 2; i++) {
            System.out.println("-------------");
            for (int j = 0; j <= 2; j++) {

                System.out.println(ulkeler[i][j]);

            }

        }



    }
}
