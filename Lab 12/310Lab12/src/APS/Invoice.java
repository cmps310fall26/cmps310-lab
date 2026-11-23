package APS;
public class Invoice {
    private double amount;
    private int invoiceNo;
    private String status;

    private Client client;

    public Invoice(double amount, int invoiceNo, String status, Client client) {
        this.amount = amount;
        this.invoiceNo = invoiceNo;
        this.status = status;
        this.client = client;
    }

	@Override
	public String toString() {
		return "Invoice [amount=" + amount + ", invoiceNo=" + invoiceNo + ", status=" + status + ", client=" + client
				+ "]";
	}

    // Getters and Setters

}

