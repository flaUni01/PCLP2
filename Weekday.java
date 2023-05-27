
import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti un numar intre 1 si 7
        System.out.print("Introduceti un numar intre 1 si 7: ");
        int day = input.nextInt();

        // Afiseaza ziua saptamanii
        switch (day) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Numarul introdus nu este valid");
        }
    }
}
