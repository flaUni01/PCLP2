import java.util.*;

class Pair {
    Object first;
    Object second;

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class SortedVector extends Vector<Pair> {
    Comparator<Pair> comparator;

    public SortedVector(Comparator<Pair> comparator) {
        this.comparator = comparator;
    }

    @Override
    public boolean add(Pair pair) {
        boolean result = super.add(pair);
        Collections.sort(this, comparator);
        return result;
    }
}
