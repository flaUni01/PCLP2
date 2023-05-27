 class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater {
    public Paralelogram(int latura1, int latura2, double unghi1, double unghi2) {
        super(latura1, latura2, latura1, latura2, unghi1, unghi2, unghi1, unghi2);
    }
}

class Romb extends Paralelogram {
    public Romb(int latura, double unghi) {
        super(latura, latura, unghi, unghi);
    }
}

class Dreptunghi extends Paralelogram {
    public Dreptunghi(int lungime, int latime) {
        super(lungime, latime, 90.0, 90.0);
    }
}

class Patrat extends Dreptunghi {
    public Patrat(int latura) {
        super(latura, latura);
    }
}

public class Main {
    public static void main(String[] args) {
        Patrat patrat = new Patrat(5);
        System.out.println("Perimetru patrat: " + patrat.perimetru());

        Romb romb = new Romb(4, 60.0);
        System.out.println("Perimetru romb: " + romb.perimetru());
    }
}
