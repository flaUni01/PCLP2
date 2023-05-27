import java.io.FileReader;
import java.io.LineNumberReader;

public class OddLineReader {
    public static void main(String[] args) {
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader("test01.in"));

            String line;
            while ((line = reader.readLine()) != null) {
                if (reader.getLineNumber() % 2 != 0) {
                    System.out.println(reader.getLineNumber() + " " + line);
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
