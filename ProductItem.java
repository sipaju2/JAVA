public class ProductItem{
    public String name;
    public double price;
    public int quantity;
    
    public ProductItem(){
        this.name="";
        this.price=.00;
        this.quantity=0;
    }

    public ProductItem(String name, double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    double totalPrice(){
        return this.price;
    }

    public static void main(String[] args) {
        ProductItem item = new ProductItem();

        item.name="Peter";
        item.price=100.00;
        item.quantity=10;
    
       System.out.println(item.totalPrice());
        
    }
}