package performance;

/** Task 2: the Java class under test. */
public class PrimeCalculator {
    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
