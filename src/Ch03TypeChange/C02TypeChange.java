package Ch03TypeChange;

public class C02TypeChange {

	public static void main(String[] args) {
		//강제 형변환
		
		int intval = '가';
		char charval = (char)intval; //강제형변환(왼쪽 자료형으로 바꿔주기)
		System.out.println(charval);
		
		long longval = 1000;
		intval = (int)longval; //강제형변환
		System.out.println(intval);
		
		double doubleval = 3.14;
		intval = (int)doubleval; //강제형변환
		System.out.println(intval);

	}

}
