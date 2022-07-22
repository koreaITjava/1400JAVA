package Ch11Array;

import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {
		
		//1. 배열의 크기를 입력받습니다.
		//2. 크기만큼 점수를 키보드로부터 입력받아 배열에 차례대로 저장합니다.
		//3. 배열에 저장된 각 요소에 접근하여 전체 합과 평균을 출력
		//4. 배열안의 저장된 점수 중에 가장 큰 값과 가장 작은 값을 출력해봅니다.
		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int max = 0;
//		int min = 0;
//		
//		System.out.print("배열의 크기를 입력하세요: ");
//		int length = sc.nextInt();
//		int []arr1 = new int[length];
//		
//		System.out.print("점수를 입력하세요: ");
//		for(int i=0; i<length;i++) {
//			int score = sc.nextInt();
//			arr1[i] = score;
//			sum += score;
//		}
//		System.out.println("전체 합 : "+sum);
//		System.out.println("평균 : "+(double)sum/length);
//		
//		max = arr1[0];
//		min = arr1[0];
//		for(int j =1;j<length;j++) {
//		
//		if(max<arr1[j]) {
//			
//			max = arr1[j];
//		}
//		if(min>arr1[j]) {
//			
//			min = arr1[j];
//		}
//		
//	}
//		System.out.println("가장 큰 값 : "+max);
//		System.out.println("가장 작은 값 : "+min);
		
		int arr[] = {10,30,20,15,4};
		sort(arr);
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	

	}
	
	
	public static void sort(int[] ar) {
		
		//배열을 정렬합니다
		//버블/선택/삽입//기수/병합/퀵.. 아무거나 정렬 로직 사용해봅시다
		//선택 정렬 사용(왼쪽 요소부터 차례대로 정렬되는 방식)
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j = i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j]=tmp;
				}
			}
		}
	}	
}
	
	
