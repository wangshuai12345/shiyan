package FirstWeek;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BruteForceSearch {
	
	
	public static int tank(int key, int[] a){
		for(int i = 0; i<a.length; i++)
			if(a[i] == key) 
				return i;
		return -1;
	}
	
public static void main(String args[]){
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();
    while(!StdIn.isEmpty()){
    	
    	int key = StdIn.readInt();
    if(BruteForceSearch.tank(key, whitelist)==-1){
    	StdOut.println(key);
    	
    }
	
    }
	
}
	


}
