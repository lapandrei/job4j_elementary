package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left, max(right, third));
    }

    public static int max(int left, int right, int third, int four) {
        return max(left, max(right, third, four));
    }

        public static void main(String[] args) {
        int left = 20;
        int right = 20;
        System.out.println("Из чисел " + left + " и " + right + ", больше  " + Max.max(left, right));
    }
}
