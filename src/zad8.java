import java.util.Scanner;
import static java.lang.Math.pow;

public class zad8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę twojego ulubionego miasta: ");
        String miasto = scanner.nextLine();
        String lowerCase = miasto.toLowerCase();
        String upperCase = miasto.toUpperCase();
        int lenght = miasto.length();

        System.out.println("Twoje miasto ma " + lenght + " liter, " + lowerCase + " malych liter i " + upperCase + " dużych liter");

    }
}