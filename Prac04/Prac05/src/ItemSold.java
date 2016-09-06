import java.util.Scanner;

/**
 * Created by cameronkent on 1/09/2016.
 */
public class ItemSold {

    int invoiceNo;
    String description;
    double price;

    public int getInvoiceNo() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Invoice No:");
        return user_input.nextInt();
    }
    public void setInvoiceNo(int i) {invoiceNo = i;}

    public String getDescription() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter product description:");
        return user_input.next();
    }
    public void setDescription(String d) {description = d;}

    public double getPrice () {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter item price:");
        return user_input.nextDouble();
    }
    public void setPrice(double p) {price = p;}

}
