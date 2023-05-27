public class Fractie {
    private int numarator;
    private int numitor;

    public Fractie() {
        this(0, 1);
    }

    public Fractie(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public int getNumarator() {
        return numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public void setNumitor(int numitor) {
        this.numitor = numitor;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public Fractie suma(Fractie f) {
        int comun = gcd(this.numitor, f.getNumitor());
        int numarator = this.numarator * (f.getNumitor() / comun) + f.getNumarator() * (this.numitor / comun);
        int numitor = this.numitor * (f.getNumitor() / comun);
        return new Fractie(numarator, numitor);
    }

    @Override
    public String toString() {
        return numarator + "/" + numitor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Fractie fractie = (Fractie) obj;
        return numarator == fractie.numarator && numitor == fractie.numitor;
    }
}
