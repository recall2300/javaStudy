package courses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _10_List {//list 중복가능, 순서있음(인덱스처리)
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("donguk");
		list.add("donook");
		list.add("nooki");
		list.add("nooki");
		
		System.out.println(list.size());
		
		for(String str : list){
			System.out.println(str);
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
