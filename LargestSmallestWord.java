public class LargestSmallestWord {
    public static void main(String[] args) {
        String input = "This is an umbrella";

        String[] words = input.split(" ");

        String smallest = words[0];
        String largest = words[0];

        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            } else if (word.length() < smallest.length()) {
                smallest = word;
            }
        }

        System.out.println("Cel mai mic cuvant este: " + smallest);
        System.out.println("Cel mai mare cuvant este: " + largest);
    }