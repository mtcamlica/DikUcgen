import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ilkKenar;
        double ikinciKenar;
        double hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk dik kenarı girin: ");
        ilkKenar = input.nextDouble();

        System.out.print("İkinci dik kenarı girin: ");
        ikinciKenar = input.nextDouble();

        hipotenus = Math.sqrt(ilkKenar*ilkKenar + ikinciKenar*ikinciKenar);

        System.out.print("Girilen kenarlara ait hipotenüs değeri: "+ hipotenus);
    }
}