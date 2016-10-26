package courses;

class Student{
	String name;
	String number;
	int birthYear;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}
	
}

public class _01_ObjectAndOverriding {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Donguk";
		s1.number = "201002436";
		s1.birthYear = 1991;
		
		Student s2 = new Student();
		s2.name = "Donguk";
		s2.number = "201002436";
		s2.birthYear = 1991;
		
		if(s1.equals(s2)){
			System.out.println("�����մϴ�.");
		}else{
			System.out.println("���������ʽ��ϴ�.");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
