package courses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class _06_UtilClass {
	public static void main(String[] args) {
		//LinkedList
		LinkedList<Object> test = new LinkedList<Object>();
		test.add("C");
		test.add("B");
		test.add("A");
		Iterator<Object> it = test.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//StringTokenizer
		StringTokenizer stringToken = new StringTokenizer("This is game.");
		
		while(stringToken.hasMoreTokens()){
			System.out.println(stringToken.nextToken());
		}
		
		Stack<Object> testStack = new Stack<Object>();
		testStack.push("hi");
		testStack.push("donguk");

		it = testStack.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
