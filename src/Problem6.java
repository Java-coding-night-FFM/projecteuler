/*
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 */
public class Problem6 {
	public static void main(String[] args) {
		System.out.println(new Problem6().calcDifferenceOfSums(100));
	}
	
	public long calcDifferenceOfSums(long number) {
		if (number <= 1) {
			return 0L;
		}

		long sumOfSquares = 0;
		for (long i = 1; i <= number; i++) {
			long sq = i * i;
			sumOfSquares += sq;
		}

		long squareOfSums = 0;
		for (long i = 1; i <= number; i++) {
			squareOfSums += i;
		}
		squareOfSums*=squareOfSums;

		return squareOfSums-sumOfSquares;
	}
}
