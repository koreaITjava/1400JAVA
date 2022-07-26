package Ch14Inheritance;

class Employee{
	public int a,t;
	public String n;
	Employee(String n, int a, int t){
		this.n=n;
		this.a=a;
		this.t=t;
	}
}

class PartTimer extends Employee{
	int w,d;
	PartTimer(String n, int a, int t, int w, int d){
		super(n,a,t);
		this.w =w;
		this.d= d;
		
		
	}
	@Override
	public String toString() {
		return "PartTimer [이름 : "+n+ ", 나이 : "+a+", 근무시간 : "+t+", 시급 : " + w + ", 계약일수 : " + d + "]";
	}
}

class Regular extends Employee{
	int s;
	String p;
	Regular(String n, int a, int t, int s, String p){
		super(n,a,t);
		this.s =s;
		this.p= p;
		
	}
	@Override
	public String toString() {
		return "Regular [이름 : "+n+ ", 나이 : "+a+", 근무시간 : "+t+" 연봉 : " + s + ", 직책 : " + p + "]";
	}
}

public class C03상속Main {

	public static void main(String[] args) {
		
							  //이름, 나이, 근무시간, 시급, 계약일수
		PartTimer hong = new PartTimer("홍길동", 55,4,20000,90);
							 //이름, 나이, 근무시간, 연봉, 직책
		Regular kim = new Regular("김상중",44,8,4800,"대리");
		
		System.out.println(hong.toString());
		System.out.println(kim.toString());
	}

}
