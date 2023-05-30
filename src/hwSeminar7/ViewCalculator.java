package hwSeminar7;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            String cmd1 = prompt("Выберите простые(S) или комплексные(C) числа S/C: ");
            if (cmd1.equals("S")) {
                int primaryArg = promptInt("Введите первый аргумент: ");
                Calculable calculator = calculableFactory.create(primaryArg);
                while (true) {
                    String cmd = prompt("Введите команду (*, +, =) : ");
                    if (cmd.equals("*")) {
                        int arg = promptInt("Введите второй аргумент: ");
                        calculator.multi(arg);
                        continue;
                    }
                    if (cmd.equals("+")) {
                        int arg = promptInt("Введите второй аргумент: ");
                        calculator.sum(arg);
                        continue;
                    }
                    if (cmd.equals("=")) {
                        int result = calculator.getResult();
                        System.out.printf("Результат %d\n", result);
                        break;
                    }
                }
            }
            if (cmd1.equals("C")) {
                double real = promptDouble("Введите вещественную часть 1 комплексного числа");
                double imag = promptDouble("Введите мнимую часть 1 комплексного числа");
                Calculable calculator1 = calculableFactory.createComplex(real, imag);
                while (true) {
                    String cmd = prompt("Введите команду (+, -, =) : ");
                    if (cmd.equals("+")) {
                        double real1 = promptDouble("Введите вещественную часть 2 комплексного числа");
                        double imag1 = promptDouble("Введите мнимую часть 2 комплексного числа");
                        Calculable calculator2 = calculableFactory.createComplex(real1, imag1);
                        calculator1.sumComplex(real1, imag1);
                        continue;
                    }
                    if (cmd.equals("=")) {
                        double result1 = calculator1.getResult();
                        System.out.printf("Результат %,.3f\n", result1);
                    }
                    System.out.println(calculator1);
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return Double.parseDouble(in.nextLine());
    }
}
