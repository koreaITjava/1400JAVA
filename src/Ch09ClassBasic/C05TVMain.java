package Ch09ClassBasic;

class TV
{
	//속성
	String coporation;
	public int year;
	public int inch;
	
	//기능
	public void showInfo() {
		System.out.printf("회사 : %s, 년도 : %d, 인치 : %d", coporation, year, inch);
	}
}

public class C05TVMain {

	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.coporation = "LG";
		myTV.year = 2022;
		myTV.inch = 32;
		myTV.showInfo(); //함수 호출시 "LG 2022 32"가 출력되어야합니다.

	}

}
