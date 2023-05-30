package hwSeminar7;

public class Complex implements Calculable {
    private double re;
    private double im;

    public Complex(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public double abs() {
        return Math.hypot(re, im);
    }

    public Complex plus(Complex b) {
        Complex a = this;
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }


    public Complex minus(Complex b) {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    public Complex plus(Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex sum = new Complex(real, imag);
        return sum;
    }

    @Override
    public Calculable sum(int arg) {
        return null;
    }

    @Override
    public Calculable multi(int arg) {
        return null;
    }

    @Override
    public Calculable sumComplex(double re, double im) {
        double real = re + 2;
        double imag = im + 1;
//        Complex sum = new Complex(real, imag);
        return new Complex(real, imag);
    }

    @Override
    public int getResult() {
        return getResult();
    }
}
