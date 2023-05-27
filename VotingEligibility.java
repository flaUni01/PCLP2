import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti varsta
        System.out.print("Introduceti varsta: ");
        int age = input.nextInt();

        // Verifica eligibilitatea pentru vot
        String eligibility = (age >= 18) ? "eligible" : "not_eligible";

        switch (eligibility) {
            case "eligible":
                System.out.println("Persoana este eligibila pentru a vota");
                break;
            case "not_eligible":
                System.out.println("Persoana nu este eligibila pentru a vota");
                break;
            default:
                System.out.println("Valoare invalida");
        }
    }
}
