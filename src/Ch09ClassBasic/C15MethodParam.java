package Ch09ClassBasic;

class Simple
{
	int x;
	int y;
}

class Test
{
	void setSimpleXY(Simple ob, int x, int y) {
		ob.x=x;
		ob.y=y;
	}
}

public class C15MethodParam {

	public static void main(String[] args) {
		Test tmp = new Test();
		Simple ob1 = new Simple();
		
		tmp.setSimpleXY(ob1,100,200);
		System.out.println("ob1.x = "+ ob1.x + "ob1.y = " + ob1.y);

	}

}
