package aopEx01;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	public void method01() {
		//System.out.println("method1시작 !!");
		System.out.println("본문 영역");
		//System.out.println("method 종료");
	}
	
	public void method02() {
		//System.out.println("method2시작 !!");
		System.out.println("본문 영역");
		//System.out.println("method 종료");
	}
	
	public void method03() {
		//System.out.println("method3시작 !!");
		System.out.println("본문 영역");
	//	System.out.println("method 종료");
	}

}


