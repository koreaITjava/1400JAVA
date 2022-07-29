package Ch17Interface;

interface Tire
{
	void run();	//상단왼쪽
}

class KumhoTire implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러갑니다");
		
	}
	
}

class Hankook implements Tire{
	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다");
		
	}
}

class Car
{
	Tire FR;
	Tire FL;
	Tire BR;
	Tire BL;
	
	Car()
	{
		FR = new KumhoTire();
		FL = new KumhoTire();
		BR = new KumhoTire();
		BL = new KumhoTire();
	}
	void CarStart() {
		FR.run();
		FL.run();
		BR.run();
		BL.run();
	}
}

public class C02InterfaceMain {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.CarStart();
		
		mycar.FL=new Hankook();
		mycar.BR = new Hankook();
		System.out.println("-----------------------------");
		mycar.CarStart();

	}

}
