package APS;
import java.util.Date;

public class Bid {
    private Date date;
    private Date time;
    private double amount;
    private boolean winner;

    private Client client;
    private Item item;

    public Bid(Date date, Date time, double amount, Client client, Item item) {
        this.date = date;
        this.time = time;
        this.amount = amount;
        this.client = client;
        this.item = item;
    }

	@Override
	public String toString() {
		return "Bid [date=" + date + ", time=" + time + ", amount=" + amount + ", winner=" + winner + ", client="
				+ client + ", item=" + item + "]";
	}

    // Getters and Setters

}
