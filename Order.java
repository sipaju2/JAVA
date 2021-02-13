import java.util.ArrayList;

public class Order extends ProductItem {
    private double sum;
    
 public Order(){
     super();
 }
    @Override
    double totalPrice() {
      
        for(int i=0; i<items.length; i++){
            System.out.println(totalPrice());
            sum+=totalPrice();
        }
        return sum;
    }
    public static void main(String[] args) {
        ProductItem[] myItem;
        ArrayList<ProductItem> items = new ArrayList<ProductItem>();
        myItem.name="peter";
        myItem.price=10.00;
        myItem.quantity=5;

        myItem.name="sam";
        myItem.price=5.00;
        myItem.quantity=2;
        
    
       System.out.println(items);
    }

    
}
