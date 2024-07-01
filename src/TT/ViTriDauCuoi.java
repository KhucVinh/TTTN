package TT;

import java.util.Scanner;

public class ViTriDauCuoi {
	public static int viTriDauTien(int[] a, int x) {
		int l = 0;
		int r = a.length - 1;
		int pos = -1;
		while(l <= r) {
			int m = l + (r-l)/2;
			if(a[m] == x) {
				pos = m;
				r = m - 1;
			}else if(a[m] < x) {
				l = m + 1;
			}else {
				r = m - 1;
			}
		}
		return pos;
	}
	
	public static int viTriCuoiCung(int[] a, int x) {
		int l = 0;
		int r = a.length - 1;
		int pos = -1;
		while(l <= r) {
			int m = l + (r-l)/2;
			if(a[m] == x) {
				pos = m;
				l = m + 1;				
			}else if(a[m] < x) {
				l = m + 1;
			}else {
				r = m - 1;
			}
		}
		return pos;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.print(viTriDauTien(a, target));
		System.out.print(" ");
		if(viTriDauTien(a, target) != -1) {
			System.out.println(viTriCuoiCung(a, target));
		}
		sc.close();
	}
}
