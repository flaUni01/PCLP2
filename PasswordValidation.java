import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti parola: ");
        String password = input.nextLine();

        boolean validLength = password.length() >= 8;
        boolean noSpaces = !password.contains(" ");
        boolean startsWithUppercase = Character.isUpperCase(password.charAt(0));
        boolean containsSpecial = password.matches(".*[#$%].*");

        if (validLength && noSpaces && startsWithUppercase && containsSpecial) {
            System.out.println("Parola este valida.");
        } else {
            System.out.println("Parola nu este valida. Nu indeplineste urmatoarele reguli:");
            if (!validLength) {
                System.out.println("- Trebuie sa aiba cel putin 8 caractere.");
            }
            if (!noSpaces) {
                System.out.println("- Nu trebuie sa contina spatii.");
            }
            if (!startsWithUppercase) {
                System.out.println("- Trebuie sa inceapa cu o litera mare.");
            }
            if (!containsSpecial) {
                System.out.println("- Trebuie sa contina cel putin un caracter special (#, $, %).");
            }
        }
    }
}
