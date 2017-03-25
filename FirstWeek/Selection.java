package FirstWeek;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Selection {

	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i = 0; i<N; i++){
			int min = i;
			for(int j = i+1; j<N; j++){
				if(less(a[j],a[min])) min = j;
				exch(a,i ,min);
				
			}
		}
		
	}

	private static void exch(Comparable[] a, int i,int j) {
		Comparable t = a[i]; a[i]  = a[j]; a[j] = t;
		
	}

	private static  boolean less (Comparable c,Comparable d ){
		return c.compareTo(d)<0;
	}
	


	private static void show(String[] a) {
		for(int i = 0; i<a.length; i++){
			StdOut.print(a[i]);
			StdOut.println();
		}
		
	}


}
