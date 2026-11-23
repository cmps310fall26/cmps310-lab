package APS;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.time.LocalDate;
import java.util.Date;

/** Task 4: JMeter wrapper for the APS Client class (S3 in the handout). */
public class ClientPerformanceTest2 implements JavaSamplerClient {

    @Override
    public void setupTest(JavaSamplerContext context) {
        // Optional: initialize resources if needed
    }

    @Override
    public SampleResult runTest(JavaSamplerContext context) {
        SampleResult result = new SampleResult();
        result.sampleStart(); // Start timing

        try {
            // Create Client
            Client client = new Client("Fatima", "Doha", 101);
            LocalDate date = LocalDate.of(2025, 11, 18);

            // Create Shopping Basket
            ShoppingBasket basket = new ShoppingBasket(date, 1, client);
            client.addBasket(basket);

            // Create Item
            Item item = new Item(1001, "iPhone 14", "Apple");
            basket.addItem(item);

            // Create Bid
            Bid bid = new Bid(new Date(), new Date(), 500.0, client, item);
            client.addBid(bid);
            item.addBid(bid);

            // Success
            result.setSuccessful(true);
            result.setResponseMessage("Client operations executed successfully");
            result.setResponseCodeOK();

        } catch (Exception e) {
            result.setSuccessful(false);
            result.setResponseMessage("Error: " + e.getMessage());
            result.setResponseCode("500");
        } finally {
            result.sampleEnd(); // End timing
        }
        return result;
    }

    @Override
    public void teardownTest(JavaSamplerContext context) {
        // Optional: clean up resources if needed
    }

    @Override
    public Arguments getDefaultParameters() {
        return new Arguments();
    }
}
