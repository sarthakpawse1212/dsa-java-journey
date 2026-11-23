package dsa.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInitialization {
    public static void main(String[] args) {

        // array initialization and declaration
            /*
            int[] arr = new int[5];
            System.out.println(arr[0]);

            int[] arr1 = {1, 2, 3, 4};
            System.out.println(arr1[1]);
             */

        Scanner input = new Scanner(System.in);

            /*
            //array of primitives

            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }

            System.out.println(Arrays.toString(arr));

             */

        // Array of objects

            /*
            String[] str = new String[4];

            for (int i = 0; i < str.length; i++) {
                str[i] = input.next();
            }

            System.out.println(Arrays.toString(str));
             */



        // 2D arrays

            /*
            int[][] arr = new int[3][3];

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = input.nextInt();
                }
                //System.out.println(Arrays.toString(arr[row]));
            }
            for(int[] e: arr){
                System.out.println(Arrays.toString(e));
            }

             */


        // dynamic arrays

            /*

            int[][] arr = {
                    {1, 2, 3},
                    {2 ,4},
                    {1, 3, 8, 9}
            };

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }

             */



        // ArrayList

        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        System.out.println(list);

    }
}
