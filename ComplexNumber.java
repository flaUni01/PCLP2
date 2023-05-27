public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber(ComplexNumber c) {
        this.real = c.getReal();
        this.imag = c.getImag();
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public ComplexNumber add(double real, double imag) {
        return new ComplexNumber(this.real + real, this.imag + imag);
    }

    public ComplexNumber add(ComplexNumber c) {
        return this.add(c.getReal(), c.getImag());
    }

    public ComplexNumber addReal(double real) {
        return new ComplexNumber(this.real + real, this.imag);
    }

    public ComplexNumber addIm(double imag) {
        return new ComplexNumber(this.real, this.imag + imag);
    }

    public ComplexNumber subtract(double real, double imag) {
        return new ComplexNumber(this.real - real, this.imag - imag);
    }

    public ComplexNumber subtract(ComplexNumber c) {
        return this.subtract(c.getReal(), c.getImag());
    }

    public ComplexNumber subtractRe(double real) {
        return new ComplexNumber(this.real - real, this.imag);
    }

    public ComplexNumber subtractIm(double imag) {
        return new ComplexNumber(this.real, this.imag - imag);
    }

    public double absValue() {
        return Math.sqrt(real * real + imag * imag);
    }
}

public class Test {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(-1, 3);

        ComplexNumber sum = a.add(b);
        ComplexNumber difference = a.subtract(b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Absolute value of a: " + a.absValue());
        System.out.println("Absolute value of b: " + b.absValue());
    }
}
