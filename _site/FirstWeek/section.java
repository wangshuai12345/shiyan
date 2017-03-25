package FirstWeek;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class section {
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i = 1;i<N; i++){
			for(int j = i; j>0&&less(a[j],a[j-1]); j--)
				exch(a,j,j-1);
		}
	}

	private static void exch(Comparable[] a, int j, int i) {
		Comparable t = a[j]; a[j ] = a[j-1]; a[j-1] = t;
		
	}

	private static boolean less(Comparable s,Comparable t) {
	return s.compareTo(t)<0;
	}
	
	public static void main(String[] args) {
		String[] a = In.readStrings();
		sort(a);
		show(a);
	}

	private static void show(String[] a) {
	for(int i = 0; i<a.length;i++){
		StdOut.println(a[i]);
	}
		
	}

}
