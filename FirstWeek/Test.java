package FirstWeek;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Test {
	

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = -1;
		int b = 9;
		int c = Math.max(a, b);
		double d = Math.sin(30);
		double r = Math.random();
		//0到1之间的实数
		double t = StdRandom.random();
		//0到N-1之间的整数
		int tt = StdRandom.uniform(4);
		int ttt = StdRandom.uniform(3, 6);
		double tttt = StdRandom.uniform(5.3, 9.6);
		boolean bb = StdRandom.bernoulli(0.121);
		int [] arr = {3,5,6,7,8,8,9};
		 StdRandom.shuffle(arr);
		int aa = Integer.parseInt("4");
		String n = Integer.toString(aa);
		double sum = 0;
		int count = 0;
		while(!StdIn.isEmpty())
		{
			sum +=StdIn.readDouble();
			count++;
			
			
		}
		
		double avage = sum/count;
		
		StdOut.printf("avage is %.5f\n",avage);
	
		
		
		
		
		
	}

}
