package Ch03TypeChange;

public class C03TypeChange {

	public static void main(String[] args) {
		int num1 = 129; 
		int num2 = 130;
		byte ch1 = (byte)num1;
		byte ch2 = (byte)num2;
		System.out.println(ch1);
		System.out.println(ch2);
		//부호비트가 1이 돼서 음수가 됨 -> -128+1(10000001) / -128+2(10000010)
		

	}

}
