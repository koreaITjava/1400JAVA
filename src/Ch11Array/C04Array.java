package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {

		//1. 행, 열의 크기를 키보드로 받습니다.
		//2. 행, 열안에 각각의 위치에 값을 입력합니다.
		//3. 각 행의 값의 총합을 따로 출력합니다.
		//4. 각 열의 값의 총합을 따로 출력합니다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("행과 열의 크기를 입력하시오 : ");
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		int [][] arr = new int [row][col];
//	
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf("arr[%d][%d] = ",i,j);
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		//각행의 총합 출력
//		int rowsum[] = new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				rowsum[i] += arr[i][j];
//			}
//			
//		}
//		
//		//각열의 총합 출력
//		int colsum[] = new int [arr[0].length];
//		for(int j=0;j<arr[j].length;j++) {
//			for(int i=0;i<arr.length;i++) {
//				colsum[j] += arr[i][j];
//			}
//			
//		}
//		for(int i =0;i<rowsum.length;i++) {
//			System.out.printf("%d 행의 합 : %d\n",i,rowsum[i]);
//			
//		}
//		for(int j =0;j<colsum.length;j++) {
//		System.out.printf("%d 열의 합 : %d\n",j,colsum[j]);
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행,열 입력 : " );
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] arr = new int[row][col];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("arr[%d][%d]=",i,j);
				arr[i][j]=sc.nextInt();
			}
		}
		
		int rowsum[] = new int[arr.length];
		//각행의 총합 출력
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) {
			  rowsum[i]+=arr[i][j];
			}
		}
		//각열의 총합 출력
		int colsum[] = new int[arr[0].length];
		
		for(int j=0;j<arr[j].length;j++)
		{
			for(int i=0;i<arr.length;i++) {
				colsum[j]+=arr[i][j];
			}
		}
		
		for(int i=0;i<rowsum.length;i++) {
			System.out.printf("%d 행의 총합 : %d\n",i,rowsum[i]);	
		}
		for(int i=0;i<colsum.length;i++) {
			System.out.printf("%d 열의 총합 : %d\n",i,colsum[i]);	
		}
	}

}
