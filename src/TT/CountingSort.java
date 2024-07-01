package TT;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
	public static void countingSort(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[a.length];

        
        for (int num : a) {
            count[num - min]++;
        }

        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[a[i] - min] - 1] = a[i];
            count[a[i] - min]--;
        }

        System.out.println(Arrays.toString(output));
//        System.arraycopy(output, 0, a, 0, a.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        }
        countingSort(a);
//        System.out.println(Arrays.toString(a)); 
        sc.close();
    }
}
