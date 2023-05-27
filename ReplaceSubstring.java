public class ReplaceSubstring {
    public static void main(String[] args) {
        String input = "A batman with bat";
        String toReplace = "bat";
        String replacement = "snow";

        String output = input.replaceAll(toReplace, replacement);
        System.out.println("Rezultatul este: " + output);
    }
}
