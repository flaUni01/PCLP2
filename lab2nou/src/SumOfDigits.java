
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti un numar intreg intre 0 si 1000
        System.out.print("Introduceti un numar intreg intre 0 si 1000: ");
        int number = input.nextInt();

        // Calculeaza suma cifrelor
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        // Afiseaza suma cifrelor
        System.out.println("Suma tuturor cifrelor in numarul introdus este: " + sum);
    }
}
