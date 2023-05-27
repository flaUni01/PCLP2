import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti primul sir: ");
        String string1 = input.nextLine();

        System.out.print("Introduceti al doilea sir: ");
        String string2 = input.nextLine();

        char[] chars1 = string1.toLowerCase().toCharArray();
        char[] chars2 = string2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean areAnagrams = Arrays.equals(chars1, chars2);

        if (areAnagrams) {
            System.out.println("Sirurile sunt anagrame.");
        } else {
            System.out.println("Sirurile nu sunt anagrame.");
        }
    }
}