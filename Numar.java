
public class Numar {
    private int nr;

    public Numar(int nr) {
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int suma(int a) {
        return nr + a;
   public int suma(int a, int b) {
        return suma(a) + b;
    }

    public int suma(int a, int b, int c) {
        return suma(a, b) + c;
    }

    public int suma(int a, int b, int c, int d) {
        return suma(a, b, c) + d;
    }

    public static void main(String[] args) {
        Numar numar = new Numar(5);
        System.out.println(numar.suma(1, 2, 3, 4));  // prints 15
    }
}
