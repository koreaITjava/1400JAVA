package Ch15Updowncasting;


class C04Animal
{
	public void Sound() {System.out.println("소리를 냅니다");}
}

class C04Dog extends C04Animal{
	//함수재정의
	public void Sound() {System.out.println("멍멍 소리를 냅니다");}
	//확장
	public void Move() {System.out.println("이동합니다");}
}
public class C04UpCastingMain {

	public static void main(String[] args) {
		C04Animal ob = new C04Animal();
		
		C04Animal ani = new C04Dog(); //Upcasting
		ani.Sound();//가능(상위 클래스형 참조변수로 오버라이딩된 하위클래스 함수에 접근이 가능하다!!)
		//ani.Move(); //불가능(->Downcasting을 통한 접근 필요)

	}

}

//상속
//Overriding
//상속 상위메서드->하위 재정의
//
//Upcasting
//->상위 참조변수 = 하위 객체
//->상속관계의 모든 하위 객체 바인딩
//
//Downcasting
//->upcasting상태에서 확장된 하위 객체에
//->접근하기 위한 강제 형변환
//
//instanceof 상속관계 여부 확인