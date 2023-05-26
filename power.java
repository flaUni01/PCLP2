import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti un numar
        System.out.print("Introduceti un numar: ");
        float number = input.nextFloat();

        // Calculeaza patratul, cubul si puterea a patra
        float square = number * number;
        float cube = number * number * number;
        float fourthPower = number * number * number * number;

        // Afiseaza rezultatul
        System.out.printf("Patrat: %.2f%nCub: %.2f%nPuterea a patra: %.2f%n", square, cube, fourthPower);
    }
}
