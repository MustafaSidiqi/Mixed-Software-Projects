
import java.util.*;

public class MergerSort {

    public static void main(String[] args) {
        Integer[] a = {2, 6, 44, 11, 25, 35, 6, 44, 3, 5, 1};
        //mergeSort(a);
       
        int A[] = {0, 10, 9, 7, 8, 2, 23}; 
        System.out.println(Arrays.toString(A));
        findTwoSum(A, 15);
        //System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(Comparable[] a) {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
    }

    private static void mergeSort(Comparable[] a, Comparable[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    private static void merge(Comparable[] a, Comparable[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (a[left].compareTo(a[right]) < 0) {
                tmp[k++] = a[left++];
            } else if (a[left].compareTo(a[right]) == 0) {
                break;
            } else {
                tmp[k++] = a[right++];
            }
        }

        while (left <= leftEnd) // Copy rest of first half
        {
            tmp[k++] = a[left++];
        }

        while (right <= rightEnd) // Copy rest of right half
        {
            tmp[k++] = a[right++];
        }

        // Copy tmp back
        for (int i = 0; i < num; i++, rightEnd--) {
            a[rightEnd] = tmp[rightEnd];
        }
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
