package Ch15Updowncasting;

class Person{
	String name;
}

class Employee extends Person{
	String dept;
}

class PartTimer extends Employee{
	String hourlyPay;


	//toString()재정의
	@Override
	public String toString() {
		return "PartTimer [hourlyPay=" + hourlyPay + ", dept=" + dept + ", name=" + name + "]";
	}
	
	
	
}

class Regular extends Employee{
	String salary;


	//toString()재정의
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", dept=" + dept + ", name=" + name + "]";
	}

	
	
}

public class C02UpDowncastingMain {

	public static void ShowInfo(Person person)	//상속관계의 상위 클래스
											   	//하위객체를 연결할 수 있는 매개변수
											   	//Person person = ob1; //업캐스팅
	{
		System.out.println(person.name); 	  	//Person클래스에서 물려준 멤버(접근ㅇ)
		//System.out.println(person.dept);		//Employee클래스에서 물려준 멤버(접근x)
		
		if(person instanceof PartTimer) {
			//파트타이머로 다운캐스팅
			PartTimer down = (PartTimer)person;
			//재정의된 toString()사용
			System.out.println(down);
		}
		else if(person instanceof Regular) {
			//정규직으로 다운캐스팅
			Regular down2 = (Regular)person;
			//재정의된 toString()사용
			System.out.println(down2.toString());
		}
	}
	
	public static void main(String[] args) {
		
		PartTimer ob1 = new PartTimer();
		ob1.name = "홍길동"; ob1.dept = "인사부"; ob1.hourlyPay = "20000";
		ShowInfo(ob1);
		Regular ob2 = new Regular();
		ob2.name="김상중"; ob2.dept="총무부"; ob2.salary="4000";
		ShowInfo(ob2);
	}

}
