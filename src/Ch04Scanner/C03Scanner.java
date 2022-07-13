package Ch04Scanner;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		//정수
//		System.out.print("정수 : ");
//		int num1 = sc.nextInt();
//		System.out.println("확인 : " + num1);
//		
//		//실수
//		System.out.print("실수 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("확인 : "+num2);
//		
//		//문자열(띄어쓰기X)
//		System.out.print("문자열(띄어쓰기X) : ");
//		String str1 = sc.next();
//		System.out.println("확인 : "+str1);
//		
		//문자열(띄어쓰기O)
		System.out.print("문자열(띄어쓰기O) : ");
		String str2 = sc.nextLine();
		System.out.println("확인 : "+str2);		
		
		sc.close();
		//주의사항
		
		
	}

}
