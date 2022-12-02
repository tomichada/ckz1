import java.util.Scanner;
import static java.lang.Math.pow;

public class zad13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwote poczatkowo zdeponowana na koncie (zł): ");
        double P = scanner.nextDouble();
        System.out.println("Podaj roczna stope oprocentowania w procentach: ");
        double r = scanner.nextDouble()/100;
        System.out.println("Podaj ile razy w roku srodki sa kapitalizowane: ");
        double n = scanner.nextDouble();
        System.out.println("Podaj ile lat srodki beda zdeponowane na koncie: ");
        double t = scanner.nextDouble();

        double A = P *pow((1+(r/n)),(n*t));
        System.out.println("Po " + t + " na koncie będzie znajdowało się " + A + "zł");

    }
}
