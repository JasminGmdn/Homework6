package Task3;

import java.util.Scanner;

public class Calculator {

    void sum(int x, int y) {
        double result = x + y;
        System.out.println("Сумма чисел = " + result);
    }

    void sub(int x, int y) {
        double result = x - y;
        System.out.println("Разница чисел = " + result);
    }

    void mul(int x, int y) {
        double result = x * y;
        System.out.println("Произведение чисел = " + result);
    }

    void div(int x, int y) {
        double result = x / y;
        System.out.println("Вычитание чисел = " + result);
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println("Введите второе число: ");
        in = new Scanner(System.in);
        int y = in.nextInt();

        calculator.sum(x,y);
        calculator.sub(x,y);
        calculator.mul(x,y);
        calculator.div(x,y);
    }
}
