package Ch04Scanner;

import java.util.Scanner;

public class C05연습 {

	public static void main(String[] args) {
		//이름을 입력하세요 : 홍길동
		//홍길동님의 나이를 입력하세요 : 34
		//홍길동님의 주소를 입력하세요 : 대구광역시 달서구 ~~0동
		
		//[PROFILE]
		//이름 : 홍길동
		//나이 : 34세
		//주소 : 대구광역시 달서구 ~~0동
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.print(str+"님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print(str+"님의 주소를 입력하세요 : ");
		sc.nextLine();
		String ad = sc.nextLine();
		System.out.println("");
		System.out.println("[PROFILE]");
		System.out.println("이름 : "+str);
		System.out.println("나이 : "+age+"세");
		System.out.println("주소 : "+ad);
		
		
		//문제 1번
		
		System.out.print("첫번째 수 : ");
		String strNum1= sc.nextLine();
		System.out.print("두번째 수 : ");
		String strNum2=sc.nextLine();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);

		
		//문제 2번
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 6자리 : ");
		int num = sc.nextInt();
		System.out.print("3. 전화번호 : ");
		sc.nextLine();
		String ph = sc.nextLine();
		System.out.println("");
		System.out.println("[입력한 내용]");
		System.out.println("이름 : "+name);
		System.out.println("주민번호 : "+num);
		System.out.println("PH : "+ph);
		
		sc.close();
	}

}
