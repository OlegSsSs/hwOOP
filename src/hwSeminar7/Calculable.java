package hwSeminar7;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);

    Calculable sumComplex(double re, double im);
    int getResult();
}
