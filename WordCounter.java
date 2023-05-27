import java.io.FileReader;
import java.io.StreamTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test02.in");
            StreamTokenizer tokenizer = new StreamTokenizer(reader);

            int wordCount = 0;
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    wordCount++;
                }
            }

            System.out.println("Number of words: " + wordCount);

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}