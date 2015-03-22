package main;
public class P2_EvenFibonacci {
	public static void main(String[] args) {
		long first = 1;
		long second = 2;
		long holder = 0;
		long sum = 2;
		
		System.out.println(first);
		System.out.println(second);
		while( holder < 4000000) {
			holder = first + second;
			first = second;
			second = holder;
			if(holder % 2 == 0)
				sum += second;
			System.out.println(second);
		}
		System.out.println("The Sum is: " + sum);
	}
}
