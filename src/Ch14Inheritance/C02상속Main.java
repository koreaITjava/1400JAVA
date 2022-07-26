package Ch14Inheritance;

class Parent{
	int x;
	Parent(){System.out.println("Parent의 디폴트 생성자 호출!");}
	Parent(int x){
		this.x=x;
		System.out.println("Parent(x) 생성자 호출!");}
}

class Son extends Parent{
	int y;
	Son(){
		super(); //상위클래스의 디폴트생성자 호출(기본값)
		System.out.println("Son의 디폴트 생성자 호출!");}
	Son(int x){
		super(x); //상위클래스의 Parent(int x) 생성자 호출 -> x멤버의 초기값 설정
		this.y=0; //하위클래스 y멤버에 0으로 초기화
		System.out.println("Son(x) 생성자 호출!");}
	Son(int x,int y){
		super(x);
		this.y = y;
		System.out.println("Son(x,y) 생성자 호출!");}
}

public class C02상속Main {

	public static void main(String[] args) {
		//Son ob1 = new Son();		//Parent()->Son()생성자호출
		Son ob2 = new Son(10);		//Parent(x)->Son(x)생성자호출
		System.out.println(ob2.x+","+ob2.y);
		Son ob3 = new Son(10,20);	//Parent(x)->Son(x,y)생성자호출
		System.out.println(ob3.x+","+ob3.y);
	}

}
