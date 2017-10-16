import edu.rosehulman.quota.javasdk.Product;
import edu.rosehulman.quota.javasdk.QuotaService;
import edu.rosehulman.quota.javasdk.User;

public class Main {

  public static void main(String[] args) {
    QuotaService quotaService = QuotaService.getReference("key");
    Product product = quotaService.getProductById("1"); // or by name
    product.addUser(new User("1"));
  }

}
