package demo;

import java.util.Scanner;

public class Example9 {
public static void main(String[] args) {
	int count = 0;
	int[] arrInt = new int[10];
	for(int i=0; i<arrInt.length; i++) {
		arrInt[i] =(int)  (Math.random()*10);
		System.out.print(arrInt[i]+" ");
	}
	System.out.println();
	
	for(int i=0; i<arrInt.length; i++) {
		if(arrInt[i] % 2 == 0)
			count += 1;
	}
	
System.out.println(count);
}
}
