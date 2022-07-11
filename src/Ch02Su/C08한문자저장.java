package Ch02Su;

public class C08한문자저장 {

	public static void main(String[] args) {
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');
		

		System.out.printf("%x\n",(int)'가');
		System.out.printf("%x\n",(int)'나');
		
		System.out.println('\ub090'); //유니코드
		System.out.println('\ub0b1'); //유니코드
		System.out.println('\uac00'); //유니코드
		System.out.println('\ub098'); //유니코드
		
		System.out.println((char)65);
	}

}
