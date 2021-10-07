package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double heigth = p / (2 * (k + 1));
        double length = heigth * k;
        double rsl = heigth * length;
        return rsl;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println(" p =6, k = 2, s = 2, real = " + result1);
    }
}
