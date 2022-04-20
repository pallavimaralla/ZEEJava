package demo;

public class SumArr {
	public static void main(String[] args) {
		int sum = 0;
		int[] numArr =  {10,20,30,40,50,60,70,80,90,100};
		
		for(int i=0; i<numArr.length; i++) {
			sum += numArr[i];
		}
		
		System.out.println(sum);
	}

}
