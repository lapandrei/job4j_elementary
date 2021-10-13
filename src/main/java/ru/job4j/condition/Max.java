package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int left = 35;
        int right = 20;
        System.out.println("Из чисел " + left + " и " + right + ", больше " + Max.max(left, right));
    }
}
