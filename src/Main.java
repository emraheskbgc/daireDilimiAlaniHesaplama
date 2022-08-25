import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Yarı Çap Giriniz : ");
        int yarıCap= input.nextInt();

      /*  double alan = pi * yarıCap * yarıCap;
        double cevre = 2 * pi * yarıCap;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi  : " + cevre); */

        // ÖDEV ÖDEV ÖDEV ÖDEV
        System.out.println("Merkez Açısını Giriniz");
        int merkezAcı = input.nextInt();

        double merkezAcıAlan = (pi*(yarıCap*yarıCap)*merkezAcı)/360;
        System.out.println("Daire Diliminin Alanı : " + merkezAcıAlan);


    }
}
