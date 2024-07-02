package TT;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	public static void countingSort(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();

        int[] count = new int[max+1];
        int[] output = new int[a.length];

        
        for (int num : a) {
            count[num]++;
        }

        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        countingSort(a);
        sc.close();
    }
}
