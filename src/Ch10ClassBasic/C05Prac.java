package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		//String 클래스로 문자열을 하나 입력받습니다.
		// 1. 입력받은 문자열의 길이 출력
		// 2. 문자열의 idx중에 2,3,4만 출력
		// 3. 다른 문자열 하나를 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어
		//	  있는지 여부 확인
		// 4. 다른 문자열 하나를 더 받아서 이전에 저장된 문자열에 해당 문자열이
		//	  일치하는지 여부 확인
		// 5. 저장된 문자열의 길이를 확인해서, 특정문자열 위치 idx 확인후
		//	  확인된 idx 위치에서 마지막 idx까지 잘라내기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String tmp = sc.nextLine();
		System.out.println("1. 문자열의 길이 : "+tmp.length());
		System.out.println("2. 2,3,4 idx : "+tmp.substring(2,5));
		// == System.out.printf("%c%c%c \n", tmp.charAt(2),tmp.charAt(3),tmp.charAt(4));
		System.out.println("다음 문자열을 입력하세요 : ");
		String tmp2 = sc.nextLine();
		System.out.println("3. 다음 문자열이 이전 문자열에 포함되어 있습니까? "+tmp.contains(tmp2));
		System.out.println("4. 다음 문자열이 이전 문자열과 같습니까? " + tmp.equals(tmp2));
		System.out.printf("5. 원하는 idx의 위치를 입력하세요(단, %d미만값으로 설정할 것) : \n",tmp.length());
		int i = sc.nextInt();
		System.out.println(tmp.substring(i,tmp.length()));

	}

}
