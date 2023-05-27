import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti numarul de elemente
        System.out.print("Introduceti numarul de elemente: ");
        int n = input.nextInt();
        int[] array = new int[n];

        // Introduceti elementele array-ului
        System.out.println("Introduceti elementele array-ului: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int value : array) {
            uniqueElements.add(value);
        }

        int newLength = uniqueElements.size();
        System.out.println("Noua lungime a array-ului este: " + newLength);
    }
}
