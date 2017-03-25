package FirstWeek;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Queue<Item> {
	private Node first;
	private Node last;
	private int N;
	private class Node{
		Item item;
		Node next;
		
	}

	public boolean isEmpty(){
		return first == null;
		
	}
	
	//向表尾添加元素
	
	public void enqueue(Item item){
		Node olderlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else  olderlast.next = last;
		N++;

		
	}
	  public Item peek() {
	        if (isEmpty()) throw new RuntimeException("Queue underflow");
	        return first.item;
	    }
	
	public Item dequeue(){
		Item item = first.item;
		first = first.next;
		if(isEmpty()) last =null;
		return item;
	
		
	}

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }
    public Iterator<Item> iterator()  {
        return new ListIterator();  
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }

	
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		
		while(!StdIn.isEmpty())
		{
			String item = StdIn.readString();
			
			/*if(!item.equals("-"))
				queue.enqueue(item);
			
			else if (!queue.isEmpty()) StdOut.println(queue.dequeue());
			*/
			
			
			StdOut.print(queue.toString());
			
		}
		
		
	}
	

}
