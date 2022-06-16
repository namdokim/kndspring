package aopEx01;

import org.springframework.stereotype.Component;

@Component
public class C {

	
	public void printC() {
		System.out.println("핵심 로직 실행중");
		int result = 10/0;
	}
	
	public void print01() {
		System.out.println("로직 실행");
	}
	
	
	/*
	 * public void print01() { System.out.println("핵심 로직 실행중!!");
	 * 
	 * C.printC();
	 * 
	 * C.print01();
	 * 
	 * }
	 */
	
}
