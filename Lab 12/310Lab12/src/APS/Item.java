package APS;
import java.util.ArrayList;
import java.util.List;

public class Item {
    private int itemID;
    private String model;
    private String make;
    private String country;
    private String capacity;
    private String color;
    private boolean sold;
    private String image;

    private Catalog catalog;
    private List<Bid> bids = new ArrayList<>();

    public Item(int itemID, String model, String make) {
        this.itemID = itemID;
        this.model = model;
        this.make = make;
    }

    public void addBid(Bid bid) { bids.add(bid); }

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", model=" + model + ", make=" + make + ", country=" + country + ", capacity="
				+ capacity + ", color=" + color + ", sold=" + sold + ", image=" + image + ", catalog=" + catalog
				+ ", bids=" + bids + "]";
	}

    // Getters and Setters

}
