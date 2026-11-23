package performance;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/** Task 2: the JMeter wrapper. JMeter creates one object per simulated user. */
public class PrimeCalculatorJMeter implements JavaSamplerClient {

    private PrimeCalculator calc;

    @Override
    public void setupTest(JavaSamplerContext context) {
        calc = new PrimeCalculator();
    }

    @Override
    public SampleResult runTest(JavaSamplerContext context) {
        SampleResult result = new SampleResult();
        result.sampleStart();   // Start timing

        boolean isPrime = calc.isPrime(9973);   // Check your understanding: try 1000003

        result.sampleEnd();     // End timing
        result.setSuccessful(true);
        result.setResponseMessage("isPrime = " + isPrime);
        return result;
    }

    @Override
    public void teardownTest(JavaSamplerContext context) { }

    @Override
    public Arguments getDefaultParameters() {
        return new Arguments();
    }
}
