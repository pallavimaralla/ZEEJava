package demo;
import java.util.Scanner;

public class PrsentEle {
	public static void main(String[] args) {
		
	
		int num;
		int[] arrNum = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0; i<arrNum.length; i++)
			arrNum[i] = sc.nextInt();
		
		System.out.println("Enter the number to be checked");
		num = sc.nextInt();	
		
		for(int i=0; i<arrNum.length; i++) {
			if(arrNum[i] == num)
				System.out.println("Number found" +arrNum[i]);
		}
		System.out.println("Number not found");		
	}

}
