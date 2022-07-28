package Ch16AbstractMain;

//추상클래스
//추상메서드를 하나 이상 포함하고 있는 클래스
//추상클래스 자체로 객체 생성이 불가능하다(추상메서드가 그 이유)
//상속관계의 하위클래스는 미완성된 함수(추상메서드)를 반드시 재정의 해야지만 객체 생성이 가능하다
//일반적으로 추상 클래스는 참조변수로써 Upcasting용으로 사용된다

//추상클래스 사용 이유
//1. 규격의 동일성(ex. 함수명의 통일)
//2. 기획되지 않은 로직은 후 순위로 미뤄서 처리

//일반 클래스 상속관계
class Par1{
	void func() {} //일반 메서드
}

class Son1 extends Par1{
	void func() {System.out.println("Son1에서 재정의한 func()");};
}

//추상클래스 상속관계
abstract class Par2{
	abstract void func(); //추상 메서드 {} 생략
}

class Son2 extends Par2{
	void func() {System.out.println("Son2에서 재정의한 func()");};
}
	
public class C01Main {

	public static void main(String[] args) {
		//일반클래스
		Par1 ob1 = new Par1(); 	//상위클래스로 객체 생성가능
		Son1 ob2 = new Son1();	//하위클래스로 객체 생성 가능
		ob1 = ob2;				//Upcasting
		ob1.func();				//재정의된 함수 접근 가능
		
		//추상클래스
		//Par2 ob3 = new Par2(); 	//상위클래스로 객체 생성불가능
		Par2 ob3 = null;
		Son2 ob4 = new Son2();	//하위클래스로 객체 생성 가능(단, 추상메서드 강제 재정의 해야 가능)
		ob3 = ob4;				//Upcasting 가능
		ob3.func();				//재정의된 함수 접근 가능
	}

}
