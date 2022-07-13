package Ch04Scanner;

import java.util.Scanner;
//import 단축키
//모든 import경로 설정 : ctrl + shift + o
//단일 import경로 설정 : ctrl + shift + m

public class C02Scanner {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 각각 받아
		//국영숙의 총점/평균을 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sum = kor+eng+mat;
		double avg = (double)sum/3;
		
		System.out.printf("총점 : %d 평균 : %.2f\n", sum, avg);
		
		sc.close();
	}

}
