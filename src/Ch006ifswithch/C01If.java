package Ch006ifswithch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		//1. 단순 IF
		//if(조건식
		//{
		//	참인 경우 실행되는 코드;
		//}
		
//		int age = 7;
		
//		if(age>=8) 
//		{
//			System.out.println("취학 아동입니다.");
//		}
//		System.out.println("첫번째 IF문 벗어남");
//		
//		if(age<8) 
//		{
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("두번째 IF문 벗어남");
//		System.out.println("프로그램을 종료합니다.");
		
		
		//IF-ELSE문
		//if(조건식)
		//{
		//	참인경우 실행될 코드
		//}
		//else
		//{
		//	거짓인 경우 실행될 코드
		//}
//		if(age>=8) 
//		{
//			System.out.println("취학 아동입니다.");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		
		//문제
		//정수 하나를 받아서 짝수면 "짝수입니다."
		//홀수면 "홀수입니다."를 출력하세요
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		if(num%2==0) {
//			System.out.println("짝수입니다.");
//		}
//		else {
//			System.out.println("홀수입니다.");
//		}
//		
		//문제
		//정수 하나를 받아서 3의 배수면 "3의 배수입니다."
		//4의 배수면 "4의 배수입니다."를 출력하세요
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		if(num%3==0&&num%4==0) {
//			System.out.println("12의 배수입니다.");
//		}
//		else if(num%3==0) {
//			System.out.println("3의 배수입니다.");
//		}
//		else if(num%4==0) {
//			System.out.println("4의 배수입니다.");
//		}
//		else {
//			System.out.println("3의 배수도 4의 배수도 아닙니다.");
//		}
		
		//문제
		//두 정수를 입력받아서 큰 수를 출력하세요(if-else)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두번째 정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		if(num1>num2) 
//		{
//			System.out.print("큰수 : "+num1);
//		}
//		else
//		{
//			System.out.print("큰수 : "+num2);
//		}
		
		//문제
		//3의 배수이면서 4의 배수라면 출력
		//3의 배수가 아니면서 5의 배수라면 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		//1번 방법
//		if(num%3==0 && num%4==0) {
//			System.out.println("3의 배수이면서 4의 배수입니다.");
//		}
//		else if(num%3!=0 && num%5==0) {
//			System.out.println("3의 배수가 아니면서 5의 배수입니다.");
//		}
//		else {
//			System.out.println("조건에 맞는 수가 아닙니다.");
//		}
		
		//2번 방법
//		if(num%3==0) {
//			//3의 배수인 경우
//			if(num%4==0) {
//				System.out.println("3의 배수이면서 4의 배수입니다.");
//			}
//		}
//		else {
//			//3의 배수가 아닌 경우
//			if(num%5==0) {
//				System.out.println("3의 배수가 아니면서 5의 배수입니다.");
//			}
//		}
		
		
		//예제
		//국어, 영어, 수학 각각의 점수가 40점 이상이 되어야하고
		//총평균이 60점 이상이 되면 "합격"출력
		//그게 아니면 "불합격" 출력
		
		//국어가 40점 이하냐?	->불합격
		//영어가 40점 이하냐?	->불합격
		//수학이 40점 이하냐?	->불합격
		//평균이 60점 미만이냐?	->불합격
		//아니라면 -> 합격
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		double avg=(double)(num1+num2+num3)/3;
		//1번 방법
//		if(num1>=40 && num2>=40 && num3>=40) {
//			if(avg>=60) {
//				System.out.println("합격");
//			}
//			else {
//				System.out.println("불합격");
//			}
//		}
//		else {
//			System.out.println("불합격");
//		}
		
		//2번 방법
//		if(num1<40) {
//			System.out.println("불합격");
//		}
//		else if(num2<40) {
//			System.out.println("불합격");
//		}
//		else if(num3<40) {
//			System.out.println("불합격");
//		}
//		else if(avg<60) {
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");			
//		}

		
		//평균점수를 입력받아 그 점수가
		//90점 이상이면 'A'출력
		//80점 이상이면 'B'출력
		//70점 이상이면 'C'출력
		//60점 이상이면 'D'출력
		//60점 미만이면 'F'출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("평균을 입력하세요 : ");
//		int avg = sc.nextInt();
		
		
		
		
		
		//문제(강사와 같이 합니다.)
		//세 정수를 입력받아서 큰 수를 출력하세요(단순 IF문으로만)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두번째 정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("세번째 정수를 입력하세요 : ");
//		int num3 = sc.nextInt();
//		
//		if(num1>num2) 
//		{
//			if(num1>num3) {
//				System.out.println("큰 수 : "+num1);
//			}
//			else {
//				System.out.println("큰 수 : "+num3);
//			}
//		}
//		else if(num2>num1)
//		{
//			if(num2>num3) {
//				System.out.println("큰 수 : "+num2);
//			}
//			else {
//				System.out.println("큰 수 : "+num3);
//			}
//		}

	}

}
