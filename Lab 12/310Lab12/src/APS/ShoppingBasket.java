package APS;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

public class ShoppingBasket {
    private LocalDate date;
    private boolean checkedOut;
    private boolean cancelled;
    private int basketID;

    private Client client;
    private List<Item> items = new ArrayList<>();

    public ShoppingBasket(LocalDate date, int basketID, Client client) {
        this.date = date;
        this.basketID = basketID;
        this.client = client;
    }

    public void addItem(Item item) { items.add(item); }

//	@Override
//	public String toString() {
//		return "ShoppingBasket [date=" + date.getYear() + ", checkedOut=" + checkedOut + ", cancelled=" + cancelled
//				+ ", basketID=" + basketID 
//				+ ", client=" + client 
//				+ ", items=" + items + "]";
//	}

    // Getters and Setters

}
