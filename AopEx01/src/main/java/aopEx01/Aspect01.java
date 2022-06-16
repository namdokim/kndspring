package aopEx01;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//공통 모듈을 가지고 있을 클래스


/*
 * 	1.Aspect : 공통 관심사들로 이루어진 모듈의 집합
 * 	ex) 로그에 관련된 모듈들을 모아둔 클래스
 *  ex) 보안에 관련된 모듈들을 모아둔 클래스
 * 	
 * 	2. Target : Ascpect이 적용될 돗(클래스 또는 메소드)
 * 	3. Advice : 실제 적용될 공통 모듈 하나를 의미함
 * 	4. Joinpoint : 적용되야 되는 시점 advice가 적용되야 되는 시점
 *  5. pointcut : target이 상세화 된 것 
 * 
 */
 
public class Aspect01 {
	//메소드 지정
	//매개변수 받아오기
	public Object loggerAop01(ProceedingJoinPoint joinpoint)  throws Throwable {
		
	
		String methodName = joinpoint.getSignature().toShortString(); //핵로직을 실행하는 메소드명
		System.out.println(methodName ="시작"); //핵심로직 실행 전 공통
	try {
		Object obj = joinpoint.proceed(); //핵심로직
		
		return obj;
	}finally {
		System.out.println(methodName+"종료"); //핵심로직 실행 후 공통
		
	}
	//보이드는 따로 리턴 값이 필요없다
	//핵심 로직을 실행하는 메소드의 정보는 joinpoint 에 담겨 있다
	//핵심 로직 실행전에만 호출되는 공통 모듈 만들기 
	
	}
	public void loggerAop02(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().toShortString();
		System.out.println(methodName+"시작(before)");	
	
	
	}
	public void loggerAop03(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().toShortString();
		System.out.println(methodName+"시작(after)");	

}
}
/*
 * 프로시드 전에는 본문
 * 파이널리를 해서 본문이 실행된 후
 */

