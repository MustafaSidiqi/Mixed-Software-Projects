/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugeseddel1;

/**
 *
 * @author Mustafa Sidiqi
 */
public class UgeSeddel1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {1,2,3,4,5,6,7,8,9,10,11};
        naive(A);
        findLocalMaximum(A);
        peak(A, 0, A.length - 1);
    }

    public static int naive(int[] arr) {
        int l = arr.length;
        if (arr[0] >= arr[1]) {
            System.out.println(arr[0]);
            return 0;

        }
        if (arr[l - 1] > arr[l - 2]) {
            System.out.println(arr[l - 1]);
            return l - 1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                System.out.println(arr[i]);
                return i;
            }
        }
        return -1;
    }

    public static int findLocalMaximum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println(arr[max]);
        return max;
    }
    
        public static void peak (int arr[], int low, int high)
    {
        int N = arr.length;
        if (high - low < 2)
            return;
        int mid = (low + high) / 2;
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            System.out.print(arr[mid] +" ");
        /* Recursively find other peak elements */        
        peak (arr, low, mid);
        peak (arr, mid, high);    
    }        
}
    
    
    

