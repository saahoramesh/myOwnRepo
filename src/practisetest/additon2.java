package practisetest;

public class additon2 {

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(double x, double y) {
		System.out.println(x + y);
	}

	public static void sum(int i, int j, int k) {
		System.out.println(i + j - k);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("xfxgdgd");
		int x = 0;
	//	additon2.sum(3, 5);
	//	additon2.sum(5.6, 7.8);
		//additon2.sum(7, 6, 8);

		int arr[][] = { { 1, 5, 9 }, { 6, 7, 8 }, { 3, -3, 4} };
		int min = arr[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] < min){
					min = arr[i][j];
				x = j;
				}
			}

			
		}
		int max = arr[0][x];
		int k=0;
		while(k<3) {
			if (arr[k][x] > max)
			{
				max = arr[k][x];
			}
			k++;
			
		}
		
		
			System.out.println(min);
			System.out.println(max);
		

	}

}
