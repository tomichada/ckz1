import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz cene detaliczną pojedyńczej płytki (zł): ");
        double cost = scanner.nextInt();
        double percent = 0.4;
        double earnings = cost * percent;
        System.out.println("Zarobki ze sprzedaży: " + earnings + " zł");
    }
}
