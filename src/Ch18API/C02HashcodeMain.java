package Ch18API;

class C02Simple
{

	@Override
	public int hashCode() {
		System.out.println("해시코드 함수 호출!");
		return 1;
	}

	@Override
	public String toString() {
		return "HAHA";
	} //재정의하면 해시코드 사라짐

	
}

public class C02HashcodeMain {

	public static void main(String[] args) {

		C02Simple ob = new C02Simple();
		
		System.out.println(ob);
		//System.out.printf("%x\n",ob.hashCode());

	}

}
