package Ch10ClassBasic;

//접근한정자
//public : 모든 클래스에서 접근 가능
//protected : 동일 패키지에 속한 클래스 or 상속과게에서 하위클래스에서만 접근가능
//default : 동일 패키지에 속한 클래스에서만 사용가능 (기본 한정자)
//private : 현재 클래스에서만 접근가능

class C01Person
{
	public String name;
	private int age;
	private float weight;
	private double height;
	
	//생성자
	public C01Person(String name, int age, float weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	//Getter(가져오기) and Setter(저장하기)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	//toString() 재정의
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
}

public class C01InfoHide {

	public static void main(String[] args) {
//		C01Person kim = new C01Person();
//		kim.name = "김상중";
//		//kim.age = 11; //private형태라 넣을 수 없음
//		kim.setAge(55);
//		System.out.println("age = "+kim.getAge());
//		kim.setweight(70);
//		System.out.println("weight = "+kim.getweight());
//		kim.setHeight(180);
//		System.out.println("height = "+kim.getHeight());
		
		C01Person tmp = new C01Person("홍길동",55,56.8f,177.5);
		System.out.println(tmp.toString());
		
	}

}
