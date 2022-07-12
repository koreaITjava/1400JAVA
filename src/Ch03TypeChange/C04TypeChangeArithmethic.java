package Ch03TypeChange;

public class C04TypeChangeArithmethic {

	public static void main(String[] args) {
		//정수 연산식(int보다 작은 자료형(short,char,byte))
		//->int로 자동형변환
		
		byte x = 10;
		char y = 30;
		short z = 40;
		
		int result = x + y + z; 	//문제 발생! 덧셈 연산시 변수로부터 값을
									//꺼내올 때 기본적으로 int형으로 변환됨!
		System.out.println("result : "+result);
		
		//정수 연산식(int보다 큰 자료형이 포함되어 있을 때 ex.long)
		//->큰 자료형으로 자동형변환
		
		byte x2=10;
		char y2=20;
		long z2=30;
		
		long result2 = x2 + y2 + z2;
		System.out.println("result2 : "+result2);
		
		//실수연산식
		int x3 = 10;
		float y3 = 3.3f;
		double z3 = 5.5;
		double result3 = x3 + y3 + z3;
		System.out.println("result3 : "+result3);		
		
	}

}
