package Ch11Array;

public class C01Array {

	public static void main(String[] args) {
		
		//길이가 5인 int형 배열
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		//길이가 7인 double형 배열
		double[] arr2 = new double[7];
		
		
		float [] arr3;
		arr3 = new float[6];
		
		System.out.println("arr1's length = " + arr1. length);
		System.out.println("arr2's length = " + arr2. length);
		System.out.println("arr3's length = " + arr3. length);
		
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		//개량 for문
		//선형자료형태인 collection, array에서 사용가능
		for(int i:arr1)
		{
			System.out.println(i);
		}

	}

}
