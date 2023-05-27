import java.util.Scanner;
import java.util.Random;

public class MatrixTrace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Introduceti dimensiunea matricei
        System.out.print("Introduceti dimensiunea matricei: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        // Generarea elementelor matricei
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }

        // Calcularea urmei matricei
        int trace = 0;
        for (int i = 0; i < n; i++) {
            trace += matrix[i][i];
        }

        System.out.println("Urma matricei este: " + trace);
    }
}
