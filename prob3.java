import java.util.*;

interface Persoana extends Comparable<Persoana> {
    double calculMedieGenerala();
    String getNume();
    void setNume(String nume);
    void addMedie(double medie);
}

class Student implements Persoana {
    private String nume;
    private List<Double> medii = new ArrayList<>();

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public double calculMedieGenerala() {
        return medii.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void addMedie(double medie) {
        medii.add(medie);
    }

    @Override
    public int compareTo(Persoana o) {
        int nameCompare = nume.compareTo(o.getNume());
        if (nameCompare == 0) {
            return Double.compare(o.calculMedieGenerala(), calculMedieGenerala());
        }
        return nameCompare;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + calculMedieGenerala() +
                '}';
    }
}

public class prob3 {
    public static void main(String[] args) {
        List<Persoana> students = new ArrayList<>();
        Student student1 = new Student("John");
        student1.addMedie(8.5);
        student1.addMedie(9.0);
        students.add(student1);

        Student student2 = new Student("John");
        student2.addMedie(9.5);
        student2.addMedie(9.0);
        students.add(student2);

        


}
