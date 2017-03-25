package FirstWeek;

import java.util.Iterator;
import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;

public class Test1 {
	public static void main(String[] args) {
Stack<String> stack = new Stack();
stack.add("qq");
stack.add("ww");
stack.add("rr");

/*for(String s: stack)
	StdOut.println(s);
	}
*/
Iterator<String> it = stack.iterator();
while(it.hasNext())
{
String s = it.next();
StdOut.println(s);
}
}

}
