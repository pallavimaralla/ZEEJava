package demo;

public class PrintArray {
	public static void main(String[] args) {
		int arr[] = new int[11];
		for(int i=1; i<=10; i++) {
			arr[i] = i * 10;
			System.out.println(arr[i]);
		}
	}

}
