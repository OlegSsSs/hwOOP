package hwSeminar7;

public interface ICalculableFactory {
    Calculable create(int primaryArg);

    Calculable createComplex(double real, double imag);
}
