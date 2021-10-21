package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length - index; index++) {
            int tmp = array[index];
            if (index == 0) {
                array[index] = array[array.length - 1];
                array[array.length - 1] = tmp;
            } else {
                array[index] = array[array.length - 1 - index];
                array[array.length - 1 - index] = tmp;

            }
        }
        return array;
    }
}
