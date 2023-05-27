public class Punct {
    private int x;
    private int y;

    public Punct() {
        this.x = 0;
        this.y = 0;
    }

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Punct p1) {
        return this.distance(p1.getX(), p1.getY());
    }
}

public class Test {
    public static void main(String[] args) {
        Punct A = new Punct(1, 2);
        Punct B = new Punct(-1, 3);
        System.out.println("Distance between A and B: " + A.distance(B));
    }
}
