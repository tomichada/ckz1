import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wynik testu 1:");
        int firstTest = scanner.nextInt();
        System.out.println("Podaj wynik testu 2:");
        int secondTest = scanner.nextInt();
        System.out.println("Podaj wynik testu 3:");
        int thirdTest = scanner.nextInt();

        double avarage = (firstTest + secondTest + thirdTest) / 3;

        System.out.println("Wynik z testu 1: " + firstTest);
        System.out.println("Wynik z testu 2: " + secondTest);
        System.out.println("Wynik z testu 3: " + thirdTest);
        System.out.println("Srednia z testow 1-3: " + avarage);

    }
}