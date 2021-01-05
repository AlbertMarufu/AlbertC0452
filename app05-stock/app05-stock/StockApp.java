

/**
 * This app provides a user interface to the stock manager so that users can add, edit, print and remove stock products
 * @author Albert Marufu
 * @version 0.1
 */
public class StockApp
{
    /* Use to get user input*/
    
    public static final String ADD = "add";
    public static final String PRINT = "print";
    public static final String SEARCH = "search";
    public static final String REMOVE = "remove";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String SEARCH_NAME = "searchname";
    public static final String LOW_STOCK = "lowstock";
    public static final String RESTOCK = "restock";
    public static final String PRINT_ALL = "printall";
    public static final String QUIT = "quit";
    private InputReader input =  new  InputReader();
    private StockManager manager =  new  StockManager();
    private StockDemo demo = new StockDemo(manager);

    /**
     * 
     */
    public void run()
    {
        printHeading();
        getMenuChoice();
    }

    /**
     * 
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        while ( ! finished) {
            printHeading();
            printMenuChoices();
            String choice = input.getInput();
            if(choice.toLowerCase().equals(QUIT))
            {
                finished = true;
            }
            else
                executeMenu(choice);
            
        }
    }
    
    private void executeMenu(String choice)
    {
        if(choice.toLowerCase().equals(ADD))
        {
            System.out.println("Please enter ID");
            
            String stringId = input.getInput();
            int id = Integer.parseInt(stringId);
            
            System.out.println("Please enter name");
            String name = input.getInput();
            
            while(name.isBlank())
            {
                System.out.println("Name cannot be blank!");
                
                name = input.getInput();
            }
            
            manager.addProduct(new Product(id, name));
                
        }
        else if(choice.toLowerCase().equals(PRINT_ALL))
        {
            manager.printAllProducts();
            
        }
        else if(choice.toLowerCase().equals(REMOVE))
        {
            System.out.println("Please enter ID");
            
            String stringId = input.getInput();
            int id = Integer.parseInt(stringId);
            
            manager.deleteProduct(id);
            
        }
        else if(choice.toLowerCase().equals(PRINT))
        {
            System.out.println("Please enter ID");
            
            String stringId = input.getInput();
            int id = Integer.parseInt(stringId);
            
            manager.printProduct(id);
            
        }
        else if(choice.toLowerCase().equals(SEARCH))
        {
            System.out.println("Please enter ID");
            
            String stringId = input.getInput();
            int id = Integer.parseInt(stringId);
            
            Product product = manager.findProduct(id);
            if (product != null)
                System.out.println(product.toString());
            
        }
        else if(choice.toLowerCase().equals(SEARCH_NAME))
        {
            System.out.println("Please enter name");
            
            String name = input.getInput();
                        
            manager.searchProductName(name);
            
        }
        else if(choice.toLowerCase().equals(DELIVER))
        {
            System.out.println("Please enter ID");
            
            String stringId = input.getInput();
            int id = Integer.parseInt(stringId);
            
            System.out.println("Please enter amount");
            
            String stringAmount = input.getInput();
            int amount = Integer.parseInt(stringAmount);
            
            manager.delivery(id, amount);
            
        }
        else if(choice.toLowerCase().equals(SELL))
        {
            System.out.println("Please enter ID");
            
            String stringId = input.getInput();
            int id = Integer.parseInt(stringId);
            
            System.out.println("Please enter amount");
            
            String stringAmount = input.getInput();
            int amount = Integer.parseInt(stringAmount);
            
            manager.sellProducts(id, amount);
            
        }
        else if(choice.toLowerCase().equals(LOW_STOCK))
        {
            manager.printStocklevelsLow();
            
        }
        else if(choice.toLowerCase().equals(RESTOCK))
        {
            manager.restock();
            
        }
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println(" Add: Add a new product");
        System.out.println(" Remove: Remove an old product");
        System.out.println(" PrintAll: Print all products");
        System.out.println(" Print: Print one product");
        System.out.println(" Deliver: deliver products");
        System.out.println(" Sell: sell products");
        System.out.println(" lowstock: Print a list of products with low stock");
        System.out.println(" restock: Deliver a minimum quantity of products");
        System.out.println(" Quit: Quit the program");
        System.out.println();
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println(" App05: by Albert Marufu");
        System.out.println("******************************");
    }
}
