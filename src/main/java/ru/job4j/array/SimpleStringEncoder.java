package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        result += symbol;
        for (int i = 1; i < input.length(); i++) {
            if (symbol != input.charAt(i)) {
                symbol = input.charAt(i);
                result = counter > 1 ? result + counter + symbol : result + symbol;
                counter = 1;
            } else {
                counter++;
            }
        }
        return counter > 1 ? result + counter : result;
    }
}
