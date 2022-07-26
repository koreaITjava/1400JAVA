package Ch14Inheritance;
//오버라이딩(함수재정의)
//상속관계를 전제로하여 상위클래서의 메서드를 하위클래스에서 고쳐사용하는 문법
//메서드의 헤더부분은 그대로 두고 메서드의 본체{}를 수정한다

//vs 오버로딩
//단일 클래스내에서(상속관계전제 X) 메서드명은 그대로, 파라미터를 다양하게 허용하는 문법

class Animal{
	public void Sound() {System.out.println("소리낸다");}
}

class Dog extends Animal{
	public void Sound() {System.out.println("멍멍 소리낸다");}
}

class Cat extends Animal{
	public void Sound() {System.out.println("애옹 소리낸다");}
}

public class C04OverRiding {

	public static void main(String[] args) {
		Dog poppi = new Dog();
		poppi.Sound();
		Cat yummi = new Cat();
		yummi.Sound();

	}

}
