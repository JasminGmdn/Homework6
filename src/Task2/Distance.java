package Task2;

import java.util.Scanner;

public class Distance {
    double distance;

    void print(double distance){
        System.out.println("Указанное растояние равно =" + distance);
    }

    public static class Converter extends Distance {
        static void kilometers(double distance){
            double result;
            result = distance / 1000;
            System.out.println("Растояние в киллометрах = " + result);
        }

        static void mile(double distance) {
            double result;
            result = distance / 1609;
            System.out.println("Растояние в милях = " + result);
        }

        static void inch(double distance) {
            double result;
            result = distance * 39.37;
            System.out.println("Растояние в дюймах = " + result);

        }
    }

    public static void main(String[] args) {
        Distance.Converter distance1 = new Converter();
        System.out.println("Введите растояние между объектами: ");
        Scanner in = new Scanner(System.in);
        double distance = in.nextDouble();

        distance1.print(distance);
        Converter.kilometers(distance);
        Converter.mile(distance);
        Converter.inch(distance);

    }



}
