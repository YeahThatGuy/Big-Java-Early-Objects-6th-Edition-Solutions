package tiles;

import java.util.Arrays;
import java.util.Scanner;

public class Tiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the floor: ");
        int i = sc.nextInt();
        System.out.print("Enter the width of the floor: ");
        int j = sc.nextInt();

        //create a 2D array and populate it with 0
        int floor[][] = new int[i][j];

        //ii = rows; jj = columns
        for (int ii = 0; ii < floor.length; ii++) {
            for (int jj = 0; jj < floor[ii].length; jj++) {
                if (ii % 2 == 0) {
                    if (jj % 2 == 0) {
                        floor[ii][jj] = 1;
                    }
                } else if ((ii % 2 != 0) && (jj % 2 != 0)) {
                    floor[ii][jj] = 1;
                }

            }

        }
        System.out.println(Arrays.deepToString(floor));

        /*
         int[] arrLength = new int[i];
         int[] arrWidth = new int[j];
         int b = 0;
         int w = 1;

         arrLength[0] = b;
         System.out.println(arrLength[0]);

         for (int iRow = 1; iRow < arrLength.length; iRow++) {
         if (arrLength[iRow - 1] == 0) {
         arrLength[iRow] = 1;
         } else {
         arrLength[iRow] = 0;
         }
         System.out.print(arrLength[iRow]);
         }
        
         for (int iCol = 1; iCol < arrWidth.length; iCol++) {
         if
         } */
    }

}
