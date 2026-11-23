package perf;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import controller.SubmitJobController;
import model.Document;
import model.PrintJobRepository;
import model.PrintingOptions;
import model.User;

/** Task 3 (S2): JMeter sampler for UC001 Submit print job. */
public class PrintShopJMeter implements JavaSamplerClient {

    private SubmitJobController controller;

    @Override
    public void setupTest(JavaSamplerContext context) {
        int delay = context.getIntParameter("pasDelayMs", 20);
        // one controller and one repository per simulated user
        controller = new SubmitJobController(new SlowPAS(delay), new PrintJobRepository());
    }

    @Override
    public SampleResult runTest(JavaSamplerContext context) {
        SampleResult result = new SampleResult();
        result.sampleStart();   // Start timing
        try {
            String userId = context.getParameter("userId", "S1001");
            int pages = context.getIntParameter("pages", 10);

            User user = new User(userId, "Test User");   // Lab 10 User has (userId, name)
            Document document = new Document("Lab12.pdf", pages);
            PrintingOptions options = new PrintingOptions(2, false, false);   // 2 copies, b/w, single-sided

            boolean accepted = controller.submitJob(user, document, options);

            // A rejected job (alternative flow 5.a) is a correct answer, not a failed sample
            result.setSuccessful(true);
            result.setResponseCodeOK();
            result.setResponseMessage(accepted ? "Job accepted and queued"
                                               : "Job rejected: insufficient credit");
        } catch (Exception e) {
            result.setSuccessful(false);
            result.setResponseCode("500");
            result.setResponseMessage("Error: " + e.getMessage());
        } finally {
            result.sampleEnd();  // End timing
        }
        return result;
    }

    @Override
    public void teardownTest(JavaSamplerContext context) { }

    @Override
    public Arguments getDefaultParameters() {
        Arguments args = new Arguments();
        args.addArgument("userId", "S1001");
        args.addArgument("pages", "10");
        args.addArgument("pasDelayMs", "20");
        return args;
    }
}
