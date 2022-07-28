package Ch15Updowncasting;

class Moonbanggu{
	
	static int scount = 100;	//샤프재고량
	static int pcount = 100;	//연필재고량
	
	//함수 정의
	protected void write() {};
}

class sharp extends Moonbanggu{
	sharp(){
		super.scount--;	//샤프객체 생성시 재고량 감소
	}
	protected void write() {System.out.println("샤프로 씁니다");};
}

class pencil extends Moonbanggu{
	pencil(){
		super.pcount--;		//연필객체 생성시 재고량 감소
	}
	protected void write() {System.out.println("연필로 씁니다");};
}

public class C05MoonBangguMain {
	
	public static Moonbanggu ReqMoonbanggu(String thing) {
		if(thing.equals("샤프")) {
			return new sharp();
		}
		else if(thing.equals("연필")) {
			return new pencil();
		}
		else {
			return null;
		}
	}
	public static void ShowInfo() {
		System.out.println("샤프 재고량 : "+Moonbanggu.scount);
		System.out.println("연필 재고량 : "+Moonbanggu.pcount);
	}
	public static void main(String[] args) {
		sharp ob1 = (sharp)ReqMoonbanggu("샤프"); 	//sharp ob 1 = 상위클래스 참조변수 -> 다운 캐스팅 -> 강제형변환 필요
		sharp ob2 = (sharp)ReqMoonbanggu("샤프"); 	//sharp ob 2 = 상위클래스 참조변수
		pencil ob3 = (pencil)ReqMoonbanggu("연필"); 	//sharp ob 3 = 상위클래스 참조변수
		ob1.write();
		ShowInfo();
	}

}
