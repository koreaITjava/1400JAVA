package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//기본
		//탈출용 변수 지정
		//탈출용 조건식
		//조건식이 false가 되도록하는 연산식
		
//		int i=1; //1. 탈출용 변수
//		while(i<=10) //2. 탈출용 조건식
//		{
//			System.out.println("Hello World!");
//			i++; //3. 조건식이 거짓이 되기 위한 연산식
//		}
		
		
		//02 1부터 10까지 합 구하기
//		int i=1;
//		int sum=0; //누적합 저장용
//		while(i<=10)
//		{
//			System.out.println("i="+i);
//			sum+=i; //증가되는 i값을 기존의 sum과 합하여 누적
//			i++;
//		}
//		System.out.println("while벗어남 i="+i);
//		System.out.println("1부터 10까지의 합 : "+sum);
		
		
		//문제
		//정수값 하나(n)를 입력받아
		//1부터 n까지의 합을 구합니다.
		
//		System.out.print("정수값을 입력하시오: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=0, sum=0; 
//		
//		while(i<=n) {
//			sum+=i;
//			i++;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d",n,sum);
		
		
//		//문제
//		//정수값 두개(n,m)를 입력받아
//		//n부터 m까지의 합을 구합니다.
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수를 입력하세요 : ");
//		int n = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요 : ");
//		int m = sc.nextInt();
//		
//		//swap
//		if(n>m) 
//		{
//			int tmp =n;
//			n = m;
//			m = tmp;
//		}
//		
//		int sum=0;
//		int k = n;
//		while(n<=m) {
//			sum += n;
//			n++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d",k,m,sum);
		
		
		//2단 구구단
//		int i=1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",2,i,2*i);
//			i++;
//		}
		
//		//2단 역순
//		//2 x 9 = 18
//		//2 x 8 = 16
//		//..
//		//2 x 1 = 2
//		int i = 9;
//		while (i>=1) {
//			System.out.printf("%d x %d = %d\n",2,i,2*i);
//			i--;
//		}
		
		
//		//n단 역순
//		//정수값 하나 받아서
//		//N x 9 = ?
//		//N x 8 = ?
//		//..
//		//N x 1 = ?
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하시오 : ");
//		int n =sc.nextInt();
//		
//		int j = 9;
//		while(j>=1) {
//			System.out.printf("%d x %d = %d\n",n,j,n*j);
//			j--;
//		}
		
		
		//1부터 n까지 수중에
		//3의 배수의 합만 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int n =sc.nextInt();
		int i =1;
		int sum =0;
		while(i<=n) {
			if(i%3==0) {
				sum +=i;
			}
			i++;
		}
		System.out.printf("합 : %d",sum);
		
	}

}
