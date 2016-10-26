package courses;

/*class Box{
	private Object obj;
	
	public void setObj(Object obj){
		this.obj = obj;
	}
	public Object getObj(){
		return obj;
	}
}*/

class Box<E>{
	private E obj;
	
	public void setObj(E obj){
		this.obj = obj;
	}
	public E getObj(){
		return obj;
	}
}
public class _08_GenericClass {
	public static void main(String[] args) {
/*		Box b1 = new Box();
		b1.setObj(new Object());
		Object obj = b1.getObj();
		
		b1.setObj("Hello");
		String result = (String)b1.getObj();
		System.out.println(result);
		
		b1.setObj(1);
		int resultValue = (int)b1.getObj();
		System.out.println(resultValue);*/
		
		Box<Object> b2 = new Box<>();
		b2.setObj(new Object());
		Object obj2 = b2.getObj();
		
		Box<String> b3 = new Box<>();
		b3.setObj("hello");
		String string = b3.getObj();
		
		Box<Integer> b4 = new Box<>();
		b4.setObj(new Integer(3));
		int intvalue = b4.getObj();
		//���׸��� ������ Ÿ���� �����ϰ�, ����Ҷ��� ��ü���� Ÿ���� �����Ͽ� �پ��� Ÿ���� Ŭ������ ����� �� �ִ�.
	}
}
