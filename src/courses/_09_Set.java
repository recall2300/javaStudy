package courses;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _09_Set {//set�� �ߺ�X, ����X
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();//set�� �������̽��̹Ƿ�, ������ hashSet�̿�
		boolean complete = set1.add("head");
		System.out.println(complete);
		complete = set1.add("donguk");
		System.out.println(complete);
		complete = set1.add("head");
		System.out.println(complete);
		
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		for(String str : set1){
			System.out.println(str);
		}
	}
}
