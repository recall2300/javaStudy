package courses;

import java.lang.reflect.Method;

class MyHello{
	@_22_Count100
	public void hello(){
		System.out.println("Hello!");
	}
}

public class _22_Annotation {
	// Java5에서부터 지원
	// 클래스나 메서드에 붙여 사용
	// 소스코드에 메타코드(추가적인정보)를 붙여 사용하는 것
	// 기본제공도 있으며 사용자가 직접 제작하는 커스텀어노테이션도 존재함
	// 1. 정의 
	// 2. 사용
	// 3. 실행
	
	public static void main(String[] args) {
		MyHello mh = new MyHello();
		try {
			Method method = mh.getClass().getDeclaredMethod("hello"); //표기한 메서드의 정보를 가져와라.
			
			if(method.isAnnotationPresent(_22_Count100.class)){//어노테이션이 적용되어있는 메서드냐?
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
