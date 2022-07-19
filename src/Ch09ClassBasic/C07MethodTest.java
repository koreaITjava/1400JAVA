package Ch09ClassBasic;

class Calculator{
	int sum(int x, int y) {
		return x+y;
	}
	
	int sub(int x, int y) {
		return x-y;
	}
	
	void mul(int x, int y) {
		System.out.println("r3 = "+(x*y));
	}
	
	void div(int x, int y) {
		System.out.println("r4 = "+(x/y));
	}
}

public class C07MethodTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int r1 = cal.sum(10,20);
		System.out.println("r1 : "+r1);
		int r2 = cal.sub(50,30); //뺄셈 x-y
		System.out.println("r2 : "+r2);
		cal.mul(5,6); //곱셈->곱셈결과가 함수내의 print호출로 출력
		cal.div(10,2); //나눗셈->나눗셈결과가 함수내의 print호출로 출력
		
	}

}
