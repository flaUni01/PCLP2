import java.util.Vector;
import java.util.Collections;

class Array {
    // Vector to store the elements
    private Vector<Integer> vector;

    // Constructor
    public Array() {
        vector = new Vector<>();
    }

    // Method to add an element to the vector using the current position
    public void addElement(Integer x) {
        vector.add(x);
    }

    // Method to add an element to the vector at a specified position
    public void addElement(Integer x, int pos) {
        if (pos >= 0 && pos <= vector.size()) {
            vector.add(pos, x);
        }
    }

    // Method to retrieve the element at the specified position
    public int get(int pos) {
        if (pos >= 0 && pos < vector.size()) {
            return vector.get(pos);
        } else {
            return Integer.MIN_VALUE;
        }
    }

    // Method to get the size of the vector
    public int getSize() {
        return vector.size();
    }

    // Method to remove an element from the vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    // Method to remove an element at a specified position from the vector
    public Integer remove(int pos) {
        return vector.remove(pos);
    }

    // Method to convert the Array object to a string representation
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < vector.size(); i++) {
            result.append(get(i));
            if (i < vector.size() - 1) {
                result.append(", ");
            }
        }
        result.append("}");
        return result.toString();
    }

    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array {
    public void sort() {
        // Already sorted, no need to sort again
    }
}

class MyStack {
    private Array stack;

    public MyStack() {
        stack = new Array();
    }

    public void push(Integer x) {
        stack.addElement(x);
    }

    public Integer pop() {
        if (stack.getSize() > 0) {
            int top = stack.get(stack.getSize() - 1);
            stack.remove(stack.getSize() - 1);
            return top;
        } else {
            return null; // Stack is empty
        }
    }

    public String toString() {
        return stack.toString();
    }
}

public class Main2 {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        sortedArray.addElement(5);
        sortedArray.addElement(3);
        sortedArray.addElement(7);
        sortedArray.sort();
        System.out.println("Sorted Array: " + sortedArray);

        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("Stack: " + myStack);
        System.out.println("Popped Element: " + myStack.pop());
    }
}
