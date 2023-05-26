

import java.util.Scanner;



public class OperationsOnIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduceti doua numere intregi
        System.out.print("Introduceti primul numar intreg: ");
        int number1 = input.nextInt();
        System.out.print("Introduceti al doilea numar intreg: ");
        int number2 = input.nextInt();

        // Calculeaza si afiseaza rezultatele
        System.out.println("Suma: " + (number1 + number2));
        System.out.println("Diferenta: " + (number1 - number2));
        System.out.println("Produsul: " + (number1 * number2));
        System.out.println("Media: " + (number1 + number2) / 2.0); // Am adaugat .0 

        // Calculeaza si afiseaza distanta, maximul si minimul
        System.out.println("Distanta: " + Math.abs(number1 - number2));
        System.out.println("Maxim: " + Math.max(number1, number2));
        System.out.println("Minim: " + Math.min(number1, number2));
    }
}