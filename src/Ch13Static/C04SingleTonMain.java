package Ch13Static;

//디자인패턴
//프로그램 제작시 사전에 발견되었던 문제들을 해결하여 정형화 시켜놓은 작업패턴

//디자인 패턴 종류
// 생성 패턴
// - 객체 생성과 관련된 코드 패턴
// - 추상팩토리, 빌더, 팩토리메서드, 프로토타입, 싱글톤패턴 등이 있다.
// 구조 패턴
// - 기존의 클래스나 객체를 조합해 더 큰 구조를 만드는 코드 패턴
// 행위 패턴
// - 객체나 클래스 사이의 알고리즘이나 책임 분배에 관련도니 패턴

class Company{
	//싱글톤 패턴 코드 시작
	private static Company instance;
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	private Company() {}
	//싱글톤 패턴 코드 끝
	int x;
	int y;
	
}

public class C04SingleTonMain {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		System.out.println("com1 : "+com1);
		System.out.println("com2 : "+com2);
		System.out.println("com1 == com2 ? "+(com1==com2));
		
		com1.x=100;
		com1.y=200;
		System.out.println("x : "+com2.x+" y : "+com2.y);

	}

}
