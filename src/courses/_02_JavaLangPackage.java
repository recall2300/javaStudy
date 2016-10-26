package courses;

public class _02_JavaLangPackage {
	public static void main(String[] args) {
		int i = 5;
		Integer i2 = new Integer(5);
		//Wrapper Class
		//Integer, Long, Float, Double, Boolean, Byte, Short..
		Integer i3 = 5; // no problem. because auto boxing.JAVA5 version
		
		int i4 = i3; // auto unboxing
		System.out.println(Integer.valueOf(i4));
	}
}
