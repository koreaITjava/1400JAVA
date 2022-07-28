package Ch17Interface;

interface Controller{
	void ON();
	void OFF();
}

class TV implements Controller
{

	@Override
	public void ON() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void OFF() {
		System.out.println("TV를 끕니다");
	}
	
}

class Radio implements Controller
{

	@Override
	public void ON() {
		System.out.println("라디오를 켭니다");		
	}

	@Override
	public void OFF() {
		System.out.println("라디오를 끕니다");
	}
	
}

public class C01InterfaceMain {
	public static void TurnON(Controller remocon) {
		remocon.ON();
	}
	public static void TurnOFF(Controller remocon) {
		remocon.OFF();
	}

	public static void main(String[] args) {
		TV tv = new TV();
		Radio radio = new Radio();
		
		TurnON(tv);
		TurnON(radio);
		TurnOFF(tv);
		
//		Controller remocon = null; //결합도 낮추기
//		remocon = tv;	//Upcasting
//		remocon.ON();
//		remocon.OFF();
//		
//		remocon = radio; //Upcasting
//		remocon.ON();
//		remocon.OFF();
	}

}
