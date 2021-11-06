package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер ages равен " + ages.length);
        System.out.println("Размер surnames равен " + surnames.length);
        System.out.println("Размер prices равен " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Andrei Lapihin";
        names[2] = "Mikki Maus";
        names[3] = "Vladimir Lenin";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
