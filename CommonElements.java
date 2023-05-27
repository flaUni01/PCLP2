import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer i : array1) {
            set1.add(i);
        }

        for (Integer i : array2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        Integer[] commonElements = set1.toArray(new Integer[0]);

        System.out.println("Elementele comune sunt: ");
        for (Integer element : commonElements) {
            System.out.print(element + " ");
        }
    }
}
