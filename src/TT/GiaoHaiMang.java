package TT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoHaiMang {
	public static boolean timKiem(int[] a, int x) {
		int l = 0;
		int r = a.length - 1;
		while(l <= r) {
			int m = l + (r-l)/2;
			if(a[m] == x) {
				return true;
			}else if(a[m] < x) {
				l = m + 1;
			}else {
				r = m - 1;
			}
		}
		return false;
	}
	
	public static List<Integer> giaoHaiMang(int[] a, int[] b){
		if(a.length > b.length) {
			return giaoHaiMang(b, a);
		}
		
		List<Integer> g = new ArrayList<>();
		for(int i : a) {
			if(timKiem(b, i)) {
				g.add(i);
			}
		}
		return g;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[n];
		for(int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		List<Integer> g = giaoHaiMang(a, b);
		System.out.println(g);
		sc.close();
	}
}
