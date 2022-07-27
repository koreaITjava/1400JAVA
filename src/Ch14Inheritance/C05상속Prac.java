package Ch14Inheritance;

class TV{
	private int size; //필드, 속성
	public TV(int size) {this.size=size;} //생성자
	protected int getSize() {return size;} //Getter함수
}

class ColorTV extends TV{
	int color;
	ColorTV(int size, int color){
		super(size);
		this.color=color;
	}
	public void printProperty(){
		
		System.out.printf("%d인치 %d컬러\n", getSize(), color);
	}
}

class IPTV extends ColorTV{
	String ad;
	IPTV(String ad, int size, int color){
		super(size,color);
		this.ad=ad;
	}
	public void printProperty() {
		System.out.printf("\"%s\" 주소에 %d인치, %d컬러",ad, getSize(), color);
	}
}

public class C05상속Prac {

	public static void main(String[] args) {
		//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		//->출력결과
		//32인치 1024컬러
		
		//[2번] 다음 main() 메소드와 실행 결과를 참고하여 ColorTV를 상속받는 IPTV 클래스를 작성하라.
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
		//->나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
		
	}

}
