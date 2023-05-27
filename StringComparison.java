public class StringComparison {
    public static void main(String[] args) {
        String string1 = "example.com";
        StringBuffer stringBuffer = new StringBuffer("example.com");

        boolean comparison1 = string1.contentEquals(stringBuffer);
        System.out.println("Compararea dintre example.com si example.com: " + comparison1);

        stringBuffer = new StringBuffer("Example.com");
        boolean comparison2 = string1.contentEquals(stringBuffer);
        System.out.println("Compararea dintre Example.com si example.com: " + comparison2);
    }
}