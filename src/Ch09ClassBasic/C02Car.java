package Ch09ClassBasic;

public class C02Car {
	//속성
	public String owner;
	public int speed;
	public int fuel;
	
	//기능
	void Accel() {
		System.out.println(owner+"님의 차의 속도를 증가합니다.");
	}
	
	void Break() {
		System.out.println(owner+"님의 차의 속도를 감소합니다.");
	}
	
	void ShowInfo() {
		System.out.printf("%s %d %d", owner, speed,fuel);
	}

}
