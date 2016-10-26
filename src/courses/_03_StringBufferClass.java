package courses;

public class _03_StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		String result = sb.toString();
		
		System.out.println(result);
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.append("Hello"));
		StringBuffer sb3 = sb2.append("Hello");
		
		if(sb2==sb3){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
		sb3.append("이것도").append("되나");
		System.out.println(sb3);
	}
}
