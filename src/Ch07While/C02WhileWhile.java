package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단 출력(2~9단)
		
//		int dan=2,i=1,k;
//		while(dan<=9) {
//			while(i<=9) {
//				k=dan*i;
//				System.out.printf("%d x %d = %d\n", dan,i,k);
//				i++;
//			}
//			System.out.print("\n");
//			i=1; //초기화★★★★★
//			dan++;
//		}
		
		
		//문제
		//2 x 9 =18
		//2 x 8 =16
		//2 x 1 = 2
		
		//3 x 9 = 27
		//3 x 8 = 24
		//..
		//9 x 1 = 9
		
//		int dan=2,i=9,k;
//		while(dan<=9) {
//			while(i>=1) {
//				k=dan*i;
//				System.out.printf("%d x %d = %d\n", dan,i,k);
//				i--;
//			}
//			System.out.print("\n");
//			i=9; //초기화★★★★★
//			dan++;
//		}
		
		
		//문제
		//9 x 9 = 81
		//9 x 8 = 72
		//
		//2 x 1 = 2
		
//		int dan=9,i=9,k;
//		while(dan>=2) {
//			while(i>=1) {
//				k=dan*i;
//				System.out.printf("%d x %d = %d\n", dan,i,k);
//				i--;
//			}
//			System.out.print("\n");
//			i=9; //초기화★★★★★
//			dan--;
//		}
		
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
		
		int i = 0, j;
		while(i<4) {
			j=0;
			while(j<5) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		//*
		//**
		//***
		//****
				
//		int i = 1, j;
//		while(i<5) {
//			j=0;
//			while(j<i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//****
		//***
		//**
		//*
		
//		int i = 1, j;
//		while(i<5) {
//			j=0;
//			while(j<5-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//   *
		//  ***
		// *****
		//*******
		
	}

}
