import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        double ilkKenar;
        double ikinciKenar;
        double ucuncuKenar;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk kenarı girin: ");
        ilkKenar = input.nextDouble();

        System.out.print("İkinci kenarı girin: ");
        ikinciKenar = input.nextDouble();

        System.out.print("Üçüncü kenarı girin: ");
        ucuncuKenar = input.nextDouble();

        double u = (ilkKenar + ikinciKenar + ucuncuKenar) / 2;
        double cevre = 2 * u;
        double alan = Math.sqrt(u*(u-ilkKenar)*(u-ikinciKenar)*(u-ucuncuKenar));



        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.print("Üçgenin alanı: " + alan);




    }
}
