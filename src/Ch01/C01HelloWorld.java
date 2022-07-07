package Ch01; //패키지명(폴더와 유사)

public class C01HelloWorld //클래스 영역 - 객체 지향 구현 단위 - 나중에 설명
{
	
	//메서드(방법, 기능) = (함수 : 데이터를 담아 처리하는 논리적 공간) : 특정 기능 처리
	//종류
	//메인		: 프로그램 실행시 최초로 실행되는 메서드
	//라이브러리	: 미리 만들어져 제공되는 메서드
	//사용자 정의	: 개발자의 필요에 의해서 만들어 사용하는 메서드

	public static void main(String[] args) //"메인"메서드 영역 - 절차지향문법 적용단위
	{	
		// TODO Auto-generated method stub
		//
		System.out.println("Hello World"); //라이브러리 메서드
		
		//System.out : 표준출력 장치(모니터)
		//println() : ()안의 내용을 전달하여 화면에 출력
		//"Hello World" : 메서드에 전달되는 인자(" "안의 문장은 '문자열'로 해석)
		// ; (세미콜론) : 해당 라인의 코드의 종료를 의미(문장의 마침표)
		
		//주석
		//단축키 : ctrl + /
		
		System.out.println("Hello World"); 
		System.out.println("Hello World"); 
		System.out.println("Hello World"); 
		System.out.println("Hello World"); 
		System.out.println("Hello World"); 
		
	}

}
