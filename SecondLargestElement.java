import java.util.Scanner;

public class SecondLargestElement {
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

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        System.out.println("Al doilea cel mai mare element este: " + secondLargest);
    }
}
