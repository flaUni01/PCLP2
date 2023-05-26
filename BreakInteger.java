
import java.util.Scanner;

public class BreakInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti un numar intreg pozitiv format din 6 cifre
        System.out.print("Introduceti un numar intreg pozitiv format din 6 cifre: ");
        int number = input.nextInt();

        // Descompune numarul in cifre individuale
        int[] digits = new int[6];
        for (int i = 5; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Afiseaza cifrele individuale
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
