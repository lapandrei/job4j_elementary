package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index <= pref.length - 1; index++) {
            if (word[index] != pref[index]) {
                return false;
            }
        }
        return result;
    }
}
