// Name - Sayak Pan
// Roll No - 4
// Java Assignment 3 - Flow Control

import java.util.Arrays;

public class Three_D_array {
    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");
        int array_3d[][][] = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11, 12 } } };
        int[][][] array_3d_copy = new int[array_3d.length][array_3d[0].length][array_3d[0][0].length];

        for (int i = 0; i < array_3d.length; i++) {
            for (int j = 0; j < array_3d[i].length; j++) {
                System.arraycopy(array_3d[i][j], 0, array_3d_copy[i][j], 0, array_3d[i][j].length);
            }
        }

        for (int[][] elements : array_3d_copy) {
            for (int[] inner_elements : elements) {
                System.out.println(Arrays.toString(inner_elements));
            }
        }
    }
}
