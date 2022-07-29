package Ch18API;

class C03Simple
{
	int x;
	int y;
	C03Simple(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object obj) //object obj = ob2; ->upcasting
	{
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj; //ob 다운캐스팅-> x,y에 접근 가능해진다
			
			return this.x==down.x && this.y==down.y;
		}
		return false;
	};
	
}

public class C03EqualsMain {

	public static void main(String[] args) {
		
		C03Simple ob1 = new C03Simple(10,20);
		
		C03Simple ob2 = new C03Simple(10,20);
		
		C03Simple ob3 = new C03Simple(30,40);
		System.out.println(ob1.equals(ob2)); //true
		System.out.println(ob1.equals(ob3)); //false
		

	}

}
