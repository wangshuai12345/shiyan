package FirstWeek;
//Õ»Ä£Äâ
import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Testing {
	public static void main(String[] args) {
		Stack<String>  s  =new Stack<String>();
		
		while(!StdIn.isEmpty()){
			String item = StdIn.readString();
			if(!item.equals("-"))
			   s.push(item);
		
			else if(!s.isEmpty())
				StdOut.print(s.pop()+"\n");
			
			
		}
		
	}
	

}
