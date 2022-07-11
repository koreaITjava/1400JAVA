package Ch02Su;

public class C07리터럴상수 {

	public static void main(String[] args) {
		
		//상수 : 고정된 수
		//상수 종류
		//리터럴 상수 : 이름 부여 X 
		//심볼릭 상수 : 이름 부여 O (final 예약어)
		
		//정수 리터럴 기본자료형 : int
		//실수 리터럴 기본자료형 : double
		
		//리터럴 접미사
		//정수 : l,L(long)
		//실수 : f,F(float)
		
		//예제 1
//		byte num1 = (byte)129; //byte->8bit
//		long num2 = 123L;
//		double num3 = 123.456;
//		float numb4 = 123.456F;
//		
//		System.out.println(num1);
		
//		int = 0~2^31-1
//		char = 0~65535(2^16-1)
//		short = 0~232767(2^15-1)
		
		//예제 2
//		int num1 = 4000000000; //40억(범위넘어서오류뜸)
		long num2 = 4000000000L; //40억
	}

}
