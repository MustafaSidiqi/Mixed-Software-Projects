/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugeseddel2;

import java.util.Arrays;

/**
 *
 * @author Mustafa Sidiqi
 */
public class UgeSeddel2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        findTwoSum(A, 4);
    }

    public static void findTwoSum(int[] A, int x) {
        Arrays.sort(A);
        int start = 0;
        int end = A.length - 1;
        boolean found = false;
        while (!found && start < end) {
            if (A[start] + A[end] == x) {
                found = true;
            } else if (A[start] + A[end] > x) {
                end--;
            } else if (A[start] + A[end] < x) {
                start++;
            }
        }
        if (found) {
            System.out.println("Sum " + x
                    + " is found, values the making sum are " + A[start] + " , "
                    + A[end]);
        } else {
            System.out.println("No pair exists whose sum is " + x);
        }
    }
}
