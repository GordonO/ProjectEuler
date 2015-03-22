package main;

public class P5_SmallestMultiple {

	private static int dividend = 0;
	private static boolean allDivideEvenly;

	public boolean isDividedByEvenly(int divisor) {
		if (dividend % divisor == 0)
			return true;
		else
			return false;
	}

	public int smallestMultiple(int highestDivisor) {
		setDividend(highestDivisor);
		allDivideEvenly = false;

		while (!allDivideEvenly) {
			checkAllDivideEvenly(highestDivisor);
			if (!allDivideEvenly)
				dividend++;
		}
		System.out.println(dividend);
		return dividend;
	}

	public void checkAllDivideEvenly(int highestDivisor) {
		for (int divisor = 2; divisor < highestDivisor; divisor++) {
			if (isDividedByEvenly(divisor)) {
				allDivideEvenly = true;
			} else {
				allDivideEvenly = false;
				break;
			}
		}
	}

	public void setDividend(int dividend) {
		P5_SmallestMultiple.dividend = dividend;
	}
}
