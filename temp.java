import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti temperatura in Fahrenheit
        System.out.print("Introduceti o temperatura in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        // Converteste temperatura in Celsius
        float celsius = (fahrenheit - 32) * 5 / 9;

        // Afiseaza rezultatul
        System.out.println(fahrenheit + " grade Fahrenheit este egal cu " + celsius + " in Celsius.");
    }
}
