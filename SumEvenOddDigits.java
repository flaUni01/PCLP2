import java.util.Scanner;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti un numar
        System.out.print("Introduceti un numar: ");
        int number = input.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        while (number != 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }

            number /= 10;
        }

        System.out.println("Suma cifrelor pare: " + sumEven);
        System.out.println("Suma cifrelor impare: " + sumOdd);
    }
}
