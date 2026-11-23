package APS;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalog {
    private int issueNo;
    private String name;
    private Date date;

    private List<Item> items = new ArrayList<>();

    public Catalog(int issueNo, String name, Date date) {
        this.issueNo = issueNo;
        this.name = name;
        this.date = date;
    }

    public void addItem(Item item) { items.add(item); }

	@Override
	public String toString() {
		return "Catalog [issueNo=" + issueNo + ", name=" + name + ", date=" + date + ", items=" + items + "]";
	}

    // Getters and Setters
    
}
