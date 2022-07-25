package Ch13Static;


//메모리 영역 비교
//스택영역 : {}내의 지역변수공간 생성
//		   {}내에서 공간형성, {}벗어나면 공간소멸
//힙영역 : 객체 저장공간
//		  new 예약어 사용시 공간 생성, 참조변수 연결해제시 JVM의 GC에 의해서 소
//클래스영역 : 공유메모리 영역, static변수, 일반메서드, static 메서드, 생성자
//			 프로그램 시작과 동시에 형성, 프로그램 종료시 소멸

class C01Simple
{
	static int Num1 = 0;
	int num2;
	//toString 재정의 할 것
	@Override
	public String toString() {
		return "C01Simple [num1="+Num1+" num2=" + num2 + "]";
	}
	
}
public class C01StaticMain {

	public static void main(String[] args) {
		//static에 접근위해서는 클래스명.static멤버
		C01Simple.Num1 = 1010;
		
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		System.out.println("ob1 = "+ob1.toString());
		System.out.println("ob2 = "+ob2.toString());
		ob1.Num1=10;
		ob1.num2=20;
		System.out.println("ob2 = "+ob2.toString());
		ob2.Num1 = 100;
		ob2.num2 = 200;
		System.out.println("ob1 = "+ob1.toString());
	}

}
