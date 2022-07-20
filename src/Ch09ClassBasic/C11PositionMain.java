package Ch09ClassBasic;

class Position
{
	int xpos;
	int ypos;
	//디폴트생성자 호출시 기본값은 xpos, ypos 각각 100씩 설정
	Position(){
		xpos = 100;
		ypos = 100;
	}
	
	void setposXY(int x) {
		this.xpos=x; //this : 만들어진 개체
		this.ypos=0;
	}
	
	void setposXY(int x, int y) {
		this.xpos=x;
		this.ypos=y;
	}
	
	void showInfo() {
		System.out.printf("%d, %d", this.xpos, this.ypos);
	}
}

public class C11PositionMain {

	public static void main(String[] args) {
		Position obj = new Position();
		obj.setposXY(10); //멤버 xpos에 값이 저장, ypos는 0 저장
		obj.setposXY(10,20); //멤버 xpos, xpos에 각각 값 저장
		obj.showInfo(); //xpos, ypos가 콘솔화면에 출력
	}

}
