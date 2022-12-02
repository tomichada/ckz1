import java.util.Scanner;
import static java.lang.Math.pow;

public class if9 {
    //Firma „Szybkie Dostawy” nalicza następujące opłaty:
    //Waga przesyłki Stawka za 500 kilometrów
    //Kilogram lub mniej 1,10 złotego
    //Powyżej kilograma do trzech kilogramów 2,20 złotego
    //Powyżej trzech kilogramów do pięciu kilogramów 3,70 złotego
    //Powyżej pięciu kilogramów 3,80 złotego
    //Opłaty za 500 kilometrów nie są obliczane proporcjonalnie. Jeśli np. kilogramowa przesyłka
    //zostanie przesłana na odległość 550 kilometrów, opłata wyniesie 2,20 złotego.
    //Napisz program, który wyświetla prośbę o wprowadzenie wagi i odległości przesyłki,
    //a następnie wyświetla jej koszt
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wage przesyłki w kilogramach (np. 2.5): ");
        double weight = scanner.nextDouble();
        System.out.println("Podaj odległość przesyłki w kilometrach (np. 560): ");
        double distance = scanner.nextDouble();

        if (weight <= 1 && weight > 0){
            double pricePer500 = 1.1;

            double priceMultiplier = distance/501;
            double price = priceMultiplier * pricePer500;

            System.out.println("Koszt przesylki będzie wynosił: " + price + "zl");
        } if ((weight > 1) && (weight <= 3)) {
            double pricePer500 = 2.2;

            double priceMultiplier = distance/501;
            double price = priceMultiplier * pricePer500;

            System.out.println("Koszt przesylki będzie wynosił: " + price + "zl");
        } if ((weight > 3) && (weight <= 5)) {
            double pricePer500 = 3.7;

            double priceMultiplier = distance/501;
            double price = priceMultiplier * pricePer500;

            System.out.println("Koszt przesylki będzie wynosił: " + price + "zl");
        } if (weight > 5) {
            double pricePer500 = 3.8;

            double priceMultiplier = distance/501;
            double price = priceMultiplier * pricePer500;

            System.out.println("Koszt przesylki będzie wynosił: " + price + "zl");
        } else {
            double pricePer500 = 0;

            System.out.println("Niepoprawne dane");
        }


    }
}
