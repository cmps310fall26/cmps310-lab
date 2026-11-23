package APS;
import java.util.Date;

public class Penalty {
    private double amount;
    private Date date;
    private String reason;
    private int penaltyNo;

    private Client client;

    public Penalty(double amount, Date date, String reason, int penaltyNo, Client client) {
        this.amount = amount;
        this.date = date;
        this.reason = reason;
        this.penaltyNo = penaltyNo;
        this.client = client;
    }

	@Override
	public String toString() {
		return "Penalty [amount=" + amount + ", date=" + date + ", reason=" + reason + ", penaltyNo=" + penaltyNo
				+ ", client=" + client + "]";
	}

    // Getters and Setters
    
}
