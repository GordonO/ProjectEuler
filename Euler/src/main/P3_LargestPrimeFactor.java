package main;
import java.util.ArrayList;

public class P3_LargestPrimeFactor {
	
	static boolean flag = true;
	static int number = 10;
	static int largestPrime;
	static ArrayList<Integer> prime = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// 13195 are 5, 7, 13 and 29
		refactor(number);
		
	}

	static public void refactor( int num) {
		while(flag = true){
			if(num % 2 == 0){
				prime.add(0, 2);
			}
			else if(num % 3 == 0){
				prime.add(3);
			}
			else if(num % 5 == 0){
				prime.add(5);
			}
			
		}
		int i = 0;
		while( !prime.isEmpty() ){
			System.out.println( prime.indexOf(i) );
			++i;
		}
	}

}
