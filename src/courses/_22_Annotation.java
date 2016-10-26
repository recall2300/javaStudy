package courses;

import java.lang.reflect.Method;

class MyHello{
	@_22_Count100
	public void hello(){
		System.out.println("Hello!");
	}
}

public class _22_Annotation {
	// Java5�������� ����
	// Ŭ������ �޼��忡 �ٿ� ���
	// �ҽ��ڵ忡 ��Ÿ�ڵ�(�߰���������)�� �ٿ� ����ϴ� ��
	// �⺻������ ������ ����ڰ� ���� �����ϴ� Ŀ���Ҿ�����̼ǵ� ������
	// 1. ���� 
	// 2. ���
	// 3. ����
	
	public static void main(String[] args) {
		MyHello mh = new MyHello();
		try {
			Method method = mh.getClass().getDeclaredMethod("hello"); //ǥ���� �޼����� ������ �����Ͷ�.
			
			if(method.isAnnotationPresent(_22_Count100.class)){//������̼��� ����Ǿ��ִ� �޼����?
				for (int i = 0; i < 100; i++) {
					mh.hello();
				}
			}else{
				mh.hello();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
