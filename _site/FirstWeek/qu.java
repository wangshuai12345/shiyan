package FirstWeek;

import java.util.LinkedList;
import java.util.Queue;

import edu.princeton.cs.algs4.StdOut;

public class qu {
	public static void main(String[] args) {
		Queue queue = new LinkedList();
		queue.add("aa");
		queue.add("bb");
		queue.add("cc");
		
		
		System.out.println(queue.offer("aa"));
		StdOut.print(queue);
		
	}
	
	

}
