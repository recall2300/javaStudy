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
			System.out.println("���ƿ�");
		}else{
			System.out.println("�޶��");
		}
		sb3.append("�̰͵�").append("�ǳ�");
		System.out.println(sb3);
	}
}
