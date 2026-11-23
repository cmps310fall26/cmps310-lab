package APS;
import java.time.LocalDate;

public class App  {
public static void main(String[] args) {
            // Example: Create Client and add Basket
            Client client = new Client("John", "Doha", 123);
            LocalDate date= LocalDate.of(2025, 11, 18);
            ShoppingBasket basket = new ShoppingBasket(date, 1, client);
            client.addBasket(basket);

System.out.println(client);            
    }
}