package APS;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String address;
    private int registrationNo;

    private List<ShoppingBasket> baskets = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();
    private List<Penalty> penalties = new ArrayList<>();
    private List<Bid> bids = new ArrayList<>();

    public Client(String name, String address, int registrationNo) {
        this.name = name;
        this.address = address;
        this.registrationNo = registrationNo;
    }

    public void addBasket(ShoppingBasket basket) { baskets.add(basket); }
    public void addInvoice(Invoice invoice) { invoices.add(invoice); }
    public void addPenalty(Penalty penalty) { penalties.add(penalty); }
    public void addBid(Bid bid) { bids.add(bid); }

	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", registrationNo=" + registrationNo + ", baskets="
				+ baskets + 
				", invoices=" + invoices + ", penalties=" + penalties + ", bids=" + bids + "]";
	}

    // Getters and Setters

}
