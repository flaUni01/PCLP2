import java.util.Scanner;

 public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti un numar
        System.out.print("Introduceti un numar: ");
        int number = input.nextInt();

        // Verifica daca numarul este pozitiv sau negativ
        if (number > 0) {
            System.out.println("Numarul este pozitiv");
        } else if (number < 0) {
            System.out.println("Numarul este negativ");
        } else {
            System.out.println("Numarul este zero");
        }
    }
}
