package Ch13Static;

import java.util.Scanner;

class FruitStore
{
	static String list[]= {"사과","바나나","오렌지","자두"};
}

public class C02StaticMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일명 입력 : ");
		String str = sc.next();
		for(String f :FruitStore.list) {
			if(f.equals(str)) {
				System.out.println("해당 과일이 존재합니다.");
				break;
			}
			else {
				System.out.println("해당 과일이 존재하지 않습니다.");
				break;
			}
		}
		System.out.println("종료합니다.");

	}

}
