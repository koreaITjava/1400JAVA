package Ch13Static;

import java.util.Scanner;

public class C03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======시험 시작=======");
		System.out.print("과목코드 입력 : ");
		int code = sc.nextInt();
		
		switch(code) 
		{
		case C03Define.ENG :
			break;
		case C03Define.MAT :
			System.out.print("반지름 : ");
			int r = sc.nextInt();
			System.out.println("원의 넓이 : "+(r*r*C03Define.PI));
			break;
		case C03Define.KOR :
			break;
		}
		System.out.println(C03Define.END_STRING);

	}

}
