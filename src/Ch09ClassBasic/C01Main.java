package Ch09ClassBasic;

public class C01Main {

	public static void main(String[] args) {

		C01Person hong = new C01Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.7f;
		hong.weight = 80.7;
		System.out.printf("%s %d %f %f\n", hong.name,hong.age,hong.height,hong.weight);

	}

}
