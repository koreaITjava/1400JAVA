package Ch09ClassBasic;

public class C02Main {

	public static void main(String[] args) {
		C02Car mycar = new C02Car();
		mycar.owner = "홍길동";
		mycar.speed = 0;
		mycar.fuel = 100;
		System.out.printf("%s %d %d\n", mycar.owner,mycar.speed,mycar.fuel);
		
		mycar.Accel();
		mycar.Break();
		mycar.ShowInfo();
		
	}

}
