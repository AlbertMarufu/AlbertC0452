import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Albert 
 * @version 10/11/20
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    private Product product;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    public void printStocklevelsLow()
    {
        for(Product product : stock)
        {

            if(product.getQuantity() <=5)
            {
                System.out.println(product.toString());
            } 
            
        }
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */

    public void addProduct(Product item)
    {
        Product product = findProduct(item.getID());
        if(product != null)
        {
            System.out.println("Product already exists");
        }
        else
        {
            stock.add(item);
            
            System.out.println(item.toString());
        }
    }
    
    public void sellProducts(int id, int amount)
    {
        Product product = findProduct(id);
        if(product == null)
        {
            System.out.println("Product does not exist");
        }
        else
        {
            product.sell(amount);
            
            System.out.println("Product sold " + product.getName() +
                    " Amount: " + amount);
        }
    }
    
    public void restock()
    {
        int low = 5;
        
        for(Product product : stock)
        {
            
            if(product.getQuantity() <= low)
            {
                product.increaseQuantity(low);
                
                System.out.println("Re-stocked: " + product.toString());
            }
            
        }
    }

    public void deleteProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            System.out.println("Product removed: " + product.toString());
            
            stock.remove(product);
        }
        else
            System.out.println("Product not found!");
    }

    public void stockChangeName(int id, String replacementName)
    {
        Product product = findProduct(id);
        
            if (product != null) 
            {
                product.changeName(replacementName);
            }
            else
                System.out.println("Product not found!");
        
    }
    
    public void searchProductName(String name)
    
    {
       if (product.getName().toLowerCase().contains(name.toLowerCase()))
       {
           System.out.println(product.toString());
       }
       
    } 

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
       if(product !=null)
       {
           product.increaseQuantity(amount);
      
       }
       else
           System.out.println("Product not found!");
    }


    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    
    
 
    {
        for (Product product: stock)
        {
            if (product.id == id) 
            {
                return product;
                
            }
           
        }
         return null;
    }
   
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public void numberInStock(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            System.out.println(product.getQuantity());
        }
        else
            System.out.println("Product not found!");
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            System.out.println(product.toString());
        }
        else
            System.out.println("Product not found!");
    }

    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Albert's Stock List");
        System.out.println("====================");
        System.out.println();

        for(Product product : stock)
        {
            System.out.println(product.toString());
        }

        System.out.println();
    }
}
 