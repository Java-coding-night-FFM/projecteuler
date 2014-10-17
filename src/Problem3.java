

public class Problem3 {
	public static void main(String[] args) {
		System.out
				.println(new Problem3().findBiggestPrimeFactor(600851475143L));
	}

	public long findBiggestPrimeFactor(long number) {
		long prime = 2;

		if (number <= 2) {
			return number;
		}

		while (number > prime) {
			if (number % prime == 0)
				number /= prime;
			else
				prime = findNextPrime(prime);
		}

		return prime;
	}

	private long findNextPrime(long prime) {
		long candidate = prime + 1;

		while (!isPrime(candidate)) {
			candidate++;
		}

		return candidate;
	}

	private boolean isPrime(long candidate) {
		for (long i = 2; i < candidate; i++) {
			if (candidate % i == 0) {
				return false;
			}
		}
		return true;
	}
}
