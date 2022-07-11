package Ch02Su;

public class C09자료형정리 {

	public static void main(String[] args) {
		
		//----------------------------------------
		//1. 정수
		//----------------------------------------
		//int : 4byte 정수 (음수저장ㅇ)
		//어떤 진수던 간에 2진수로 저장된다
		int var1 = 0b1111;	//2진수
		int var2 = 0206;	//8진수
		int var3 = 345;		//10진수
		int var4 = 0xb3;	//16진수
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		
		//byte : 1byte 정수 (음수저장ㅇ)
		byte var5=127; 	//가능
//		byte var6=128; 	//불가능 (byte)128로 하면 -128됨
//		byte var7=(-129); //불가능 (byte)(-129)하면 127됨
		System.out.println("var5 : "+var5);
//		System.out.println("var6 : "+var6);
//		System.out.println("var7 : "+var7);
		
		//short : 2byte 정수(음수지원ㅇ)
		//char : 2byte 정수(음수지원x - 1문자 저장용도)
		//short : -32768 ~ +32767
		//char : 0~65535
		
//		char ndata1 = 60000;
//		short ndata2 = ndata1;
		
		//long : 8byte 정수(음수지원 o)
		//리터럴 접미사 : l,L
		
		//----------------------------------------
		//2. 실수
		//----------------------------------------
		//double : 8byte 실수, default자료형
		//소수점 유효범위 약.. 14-18(참고키워드 : 단정밀도, 배정밀도)
		
		//float : 4byte 실수
		//소수점 유효범위 약 6-7자리까지는 정확
		//리터럴 접미사 : f,F
		
		//지수형
		double num1 = 3e6; //3*10^6
		System.out.println(num1);
		double num2 = 3e-2;
		System.out.println(num2);
		
		//----------------------------------------
		//3. 단일문자
		//----------------------------------------
		char c1='A';
		char c2='B';
		System.out.printf("%d %c", (int)c1,c1);
		
		//----------------------------------------
		//4. 문자열(클래스 자료형 : String)
		//----------------------------------------
		//클래스 자료형으로 만든 변수 : 참조변수
		//Data의 위치값(주소값, 참조값)을 저장
		//Data의 처리는 위치값을 이용해서 해당 위치로 접근하여 확인 변경 처리
		String name="홍길동";
		String job="프로그래머";
		System.out.println(name+","+job);
		
		//----------------------------------------
		//5. boolean형(true/false저장)
		//----------------------------------------
		boolean flag1 = true;
		boolean flag2 = false;
		
		
	
	}

}
