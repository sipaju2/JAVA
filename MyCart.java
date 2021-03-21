
/*ou are given a cart in the form of an ArrayList of ProductItem defined as follows:
Class ProductItem {
String label;
Int quantity;
Int unitPrice;
}
You are asked to return the total price by label.*/
import java.util.ArrayList;

public class MyCart {

    public static void main(String[] args) {
        ProductItems item1 = new ProductItems("tomatoes", 2, 5.0);
        ProductItems item2 = new ProductItems("oranges", 8, 2.0);
        ProductItems item3 = new ProductItems("Banana", 5, 1.0);
        ProductItems item4 = new ProductItems("pineapple", 2, 6.0);
        ProductItems item5 = new ProductItems("avocado", 8, 0.5);
        ProductItems item6 = new ProductItems("peach", 5, 5.0);
        ProductItems item7 = new ProductItems("juice", 3, 2.5);

        ArrayList<ProductItems> items = new ArrayList<ProductItems>();
         if (items.isEmpty()) {
            items.add(item4);
            items.add(item1);
            items.add(item2);
            items.add(item3);
            items.add(item5);
            items.add(item6);
            items.add(item7);
        }

        if (!items.isEmpty()) {
            for (ProductItems item : items) {
                System.out.println(item);
            }
        }
    }
}

class ProductItems {
    String label;
    int quantity;
    double unitPrice;

    ProductItems(String label, int quantity, double unitPrice) {
        this.label = label;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void SetUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public String toString() {
        return " The Total Price of " + getLabel() + " is " + getQuantity() * getUnitPrice() + "";
    }

}
