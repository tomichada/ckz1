import java.util.Scanner;
import static java.lang.Math.pow;

public class zad15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość rzędów w metrach: ");
        double R = scanner.nextDouble();
        System.out.println("Podaj ilość miejsce zajmowane przez okratowanie w metrach: ");
        double E = scanner.nextDouble()/100;
        System.out.println("Podaj odległość między sadzonkami w metrach: ");
        double S = scanner.nextDouble();

        double V = (R-2*E) / S;
        System.out.println("W każdym rzędzie można zasadzić " + V + "sadzonek");



    }
}