package FirstWeek;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//������ģ���ջ
public class Stackk<Item> {

	private Node last;
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	public int size(){
		return N;
		
	}
	//���Ԫ��
	public void push(Item item){
		Node oldNode = first;
		first = new Node();
		first.item = item;
		first.next = oldNode;
		N++;
		
	}
	//��վ��ɾ��Ԫ��
	public Item pop(){
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	public Item peek(){
		if (isEmpty()) throw new RuntimeException("Stack underflow"); 
		return first.item;
		
		
	}
	
	
	public static void main(String[] args) {
		Stackk ss = new Stackk();
		while(!StdIn.isEmpty()){
		String itrem = StdIn.readString();
		if(!itrem.equals("-")){
			ss.push(itrem);
		}
		else if(!ss.isEmpty())
			StdOut.println(ss.pop()+"\n");
			
			
		}
		
		StdOut.println(ss.peek()+"_");
		 
 		
	}
	
	
	
	
}
