package Ch09ClassBasic;

import java.util.Scanner;

class SumCal {
	
	//멤버변수
	Scanner sc = new Scanner(System.in);
	
	//인자 ㅇ, 반환 ㅇ
	int sum1(int x, int y) {
		return x+y;
	}
	
	//인자 ㅇ, 반환 x
	void sum2(int x, int y) {
		System.out.println("void sum2(x,y) = "+ (x+y));
	}
	
	//인자 x, 반환 o
	int sum3() {
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}
	
	//인자 x, 반환 x
	void sum4() {
		
		int m = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("sum4(x,y) = " +(m+k));
	}
}

public class C06MethodTest {

	public static void main(String[] args) {
		
		//객체 생성
		SumCal obj1 = new SumCal();
		
		//함수호출
		int result = obj1.sum1(10,20);
		System.out.println("sum1(10,20) = "+result);
		
		obj1.sum2(30,40);
		
		int result2 = obj1.sum3();
		System.out.printf("sum3() = %d\n",result2);
		
		obj1.sum4();
	}

}
