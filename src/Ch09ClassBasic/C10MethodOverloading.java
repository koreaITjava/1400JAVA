package Ch09ClassBasic;
//함수 오버로딩
//함수의 이름을 동일하게 두고 함수의 매개변수를 다양하게 둘 수 있도록 허용한 문법

class Calc
{
	int sum(int x, int y)
	{
		System.out.println("SUM(x,y) 호출!");
		return x+y;
	}
	int sum(int x, int y,int z)
	{
		System.out.println("SUM(x,y,z) 호출!");
		return x+y+z;
	}
	int sum(String str1, String str2) {
		System.out.println(str1+str2);
		return 0;
	}
}

public class C10MethodOverloading {

	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10,20, 30));
		obj.sum("안녕", "하세요잇");

	}

}
