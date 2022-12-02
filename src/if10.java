import java.util.Scanner;
import static java.lang.Math.pow;

public class if10 {
    public static void main(String[] args) {

        //Napisz program, który wyświetla prośbę o wprowadzenie liczby kalorii i gramów tłuszczu w produkcie
        //żywnościowym. Program powinien wyświetlać procent kalorii pochodzących z tłuszczu. Jeden gram
        //tłuszczu ma 9 kalorii. Dlatego:
        //kalorie z tłuszczu = gramy tłuszczu × 9
        //Procent kalorii pochodzących z tłuszczu można obliczyć w następujący sposób:
        //kalorie z tłuszczu/kalorie w sumie
        //Jeśli kalorie pochodzące z tłuszczu stanowią mniej niż 30% kalorii w produkcie, należy dodatkowo
        //wyświetlać komunikat, że produkt jest niskotłuszczowy.
        //UWAGA: Liczba kalorii pochodzących z tłuszczu nie może być większa niż łączna liczba kalorii w
        //produkcie. Jeśli program wykryje, że liczba kalorii z tłuszczu jest wyższa niż łączna liczba kalorii,
        //powinien wyświetlać komunikat o błędzie informujący, że dane wejściowe są nieprawidłowe.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość tłuszcuz w produkcie w gramach (np. 9.5): ");
        double oil = scanner.nextDouble();
        System.out.println("Podaj ilość kalorii w produkcie (np. 800): ");
        double kcal = scanner.nextDouble();

        double oilKcal = oil * 9;

        double percantageKcal = oilKcal / kcal * 100;

        if (percantageKcal <= 30 && percantageKcal > 0) {
            System.out.println("Ten produkt jest niskotłuszczowy");

        } else if (percantageKcal > 30 && percantageKcal < 70) {
            System.out.println("Ten produkt ma prawidłowy % tłuszczów");

        } else if (percantageKcal >= 70) {
            System.out.println("Ten produkt jest wysokotłuszczowy");

        } else if (oilKcal < kcal) {
            System.out.println("Nieprawidłowe dane ");

        }


    }
}
