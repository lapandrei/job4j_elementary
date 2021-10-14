package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int left = 20;
        int right = 20;
        System.out.println("Из чисел " + left + " и " + right + ", больше  " + Max.max(left, right));
    }
}
