package Ch11Array;

public class C03Array {

	public static void main(String[] args) {

		int [][] arr = new int [2][3]; //2행 3열 배열
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println("행의 길이 : "+arr.length);
		System.out.println("0번 행의 열 길이 : "+arr[0].length);
		System.out.println("1번 행의 열 길이 : "+arr[1].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
