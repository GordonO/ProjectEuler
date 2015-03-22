package main;

public class P1_Mulit3And5 {

	private static int total = 1000;
	private static int sum = 0;
	private static boolean three = true, five = true;

	public void multipleOf3And5() {
		final int THREE = 3;
		final int FIVE = 5;
		three = true;
		five = true;
		int count = 1;
		int fiveSum = 0, threeSum = 0;

		while (three || five) {
			threeSum = mulitplyByThree(THREE, count, threeSum);
			fiveSum = mulitplyByFive(FIVE, count, fiveSum);
			count++;
		}
		sum = threeSum + fiveSum;
		System.out.println("The sum is: " + sum);
	}

	public int mulitplyByFive(final int FIVE, int count, int fiveSum) {
		if (FIVE * count < getTotal()) {
			fiveSum = fiveSum + (FIVE * count);
		} else
			five = false;
		return fiveSum;
	}

	public int mulitplyByThree(final int THREE, int count, int threeSum) {
		if (THREE * count < getTotal()) {
			if ((THREE * count) % 15 == 0) {
			} else
				threeSum = threeSum + (THREE * count);
		} else
			three = false;
		return threeSum;
	}

	public void setTotal(int t) {
		total = t;
	}

	public int getTotal() {
		return total;
	}

	public int getTSum() {
		return sum;
	}
}
