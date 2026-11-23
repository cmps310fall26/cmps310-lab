package perf;

import java.util.HashMap;
import java.util.Map;
import model.PASGateway;

/** Task 3 (S1): stand-in for PAS in performance tests, with fixed balances and a configurable answer time. */
public class SlowPAS implements PASGateway {
    private final Map<String, Double> credit = new HashMap<>();
    private final int delayMs;   // simulated PAS answer time

    public SlowPAS(int delayMs) {
        this.delayMs = delayMs;
        credit.put("S1001", 20.00);   // sufficient credit
        credit.put("S2002", 1.00);    // insufficient credit
    }

    @Override
    public boolean checkCredit(String userId, double amount) {
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return credit.getOrDefault(userId, 0.0) >= amount;
    }
}
