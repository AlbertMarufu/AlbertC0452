/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Albert 
 * @version 14.11.2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(70, "Stamps"));
        manager.addProduct(new Product(80, "Samsung Television"));
        manager.addProduct(new Product(10, "Busses"));
        manager.addProduct(new Product(104, "Typewriter"));
        manager.addProduct(new Product(50, "Ballpoint"));
        manager.addProduct(new Product(30, "Lightbulbs"));
        manager.addProduct(new Product(29, "Balloons"));
        manager.addProduct(new Product(100, "HP Printer"));
        manager.addProduct(new Product(90, "Monitor"));
        manager.addProduct(new Product(20, "Toy gun"));
        
        demoDeliverProduct();
        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    
    {
        // Show details of all of the products before delivery.
        manager.printAllProducts();
                
        // Take delivery of 5 items of one of the products.
        manager.delivery(70, 10);
        manager.delivery(80, 30);
        manager.delivery(10, 20);
        manager.delivery(104, 15);
        manager.delivery(50, 30);
        manager.delivery(30, 60);
        manager.delivery(29, 40);
        manager.delivery(100, 50);
        manager.delivery(90, 70);
        manager.delivery(20, 35);
       
        // Show the list of all products after delivery
        manager.printAllProducts();
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demoSellProduct(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            manager.printProduct(id);
            product.sellOne();
            manager.printProduct(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }
}
