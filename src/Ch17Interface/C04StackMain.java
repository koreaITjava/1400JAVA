package Ch17Interface;

import java.util.Scanner;

//다음 Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라.
//
interface Stack {
   int length(); // 현재 스택에 저장된 개수 리턴
   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
   String pop(); // 스택의 톱(top)에 실수 저장
   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}
//그리고 다음 실행 사례와 같이 작동하도록 StackApp 클래스에 main() 메소드를 작성하라.
//
//총 스택 저장 공간의 크기 입력 >> 3
//문자열 입력 >> hello
//문자열 입력 >> sunny
//문자열 입력 >> smile
//문자열 입력 >> happy
//스택이 꽉 차서 푸시 불가!
//문자열 입력 >> 그만
//스택에 저장된 모든 문자열 팝 : smile sunny hello 

class StringStack implements Stack {
	   private int num; // 저장 가능한 개수
	   private int set; // 저장 인덱스
	   private String[] stack;
	   public StringStack(int num) { //배열의 크기를 전달받음
	      this.num = num;
	      this.set = 0;
	      stack = new String[num];
	   }
	   public int length() {
	      return set;
	   }
	   public int capacity() {
	      return stack.length;
	   }
	   public String pop() {
	      if(set-1 < 0)  // stack에 아무것도 넣지 않았을 떄
	         return null;
	      set--; // stack 한칸을 내려줌 (stack[set]은 빈공간을 가리키고 있으니깐)
	      String s = stack[set]; // 맨 위의 값
	      return s;
	   }
	   public boolean push(String val) {
	      if(set < num) {
	         stack[set] = val; //맨 위에 문자열을 넣어줌
	         set++; // stack 한칸을 올려줌
	         return true;
	      }
	      else
	         return false;
	   }
	}

public class C04StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("총 스택 저장 공간의 크기 입력 >> ");
	      int num = sc.nextInt();
	      StringStack stack = new StringStack(num);
	      while(true) {
	         System.out.print("문자열 입력 >> ");
	         String val = sc.next();
	         if(val.equals("그만"))
	            break;
	         if(!stack.push(val)) {
	            System.out.println("스택이 꽉 차서 푸시 불가!");
	         }
	      }
	      System.out.print("스택에 저장된 모든 문자열 팝 : ");
	      int len = stack.length();
	      for(int i=0; i<len; i++) {
	         String s = stack.pop();
	         System.out.print(s+" ");
	      }
	      sc.close();
	   }

	}


//!!절차!!
//data-저장?
//-자료형(일반/클래스)
//-변수/상수(심볼릭,리터럴)
//
//-메모리 영역
//Stack({})/Heap(객체)/Class(공유)
//
//data - 처리:?
//연산자 기호
//-산술/대입/복합/비교/논리/증감/삼항
//제어흐름문
//-if/switch/while/for


//!!객체!!
//Basic
//객체?
//객체의 구조
//-속성(멤버변수, 필드)
//-기능(멤버메서드)
//-생성자
//
//클래스
//오버로딩
//정보은닉(private, getter/setter)
//
//배열
//-일반자료형 배열
//-클래스자료형 배열
//
//this
//
//this
//static, singleton
//
//기본코드
//Scanner sc = new Scanner(System.in);
//!상속!
//상속 기본 코드
//오버라이딩
//up/downcasting
//추상클래스
//인터페이스