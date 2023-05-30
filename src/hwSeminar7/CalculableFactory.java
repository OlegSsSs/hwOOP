package hwSeminar7;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }

    public Calculable createComplex(double real, double imag) {
        return new Complex(real, imag);
    }
}
