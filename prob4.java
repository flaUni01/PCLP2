 java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExtensionFileFilter implements FileFilter {
    private Set<String> extensions;
    private Set<String> words;

    public ExtensionFileFilter(String[] extensions, String[] words) {
        this.extensions = new HashSet<>(Arrays.asList(extensions));
        this.words = new HashSet<>(Arrays.asList(words));
    }

    @Override
    public boolean accept(File file) {
        String name = file.getName().toLowerCase();
        for (String word : words) {
            if (name.contains(word.toLowerCase())) {
                int index = name.lastIndexOf('.');
                if (index > 0) {
                    String extension = name.substring(index + 1);
                    if (extensions.contains(extension)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }