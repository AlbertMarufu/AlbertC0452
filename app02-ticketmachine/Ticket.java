import java.util.*;

/**
 * Write a description of class Ticket here.
 *
 * @Albert Marufu (your name)
 * @26/10/20 (a version number or a date)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private String destination;
    private int price;
    private Date today;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    
    {
        // initialise instance variables
        this.destination=destination;
        this.price=price;
        today = new Date();
    }
    
    public int getPrice()
    {
        return price;
        
    }
    
    public String getDestination()
   {
       return destination;
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printTicket()
    {
        // put your code here
        System.out.println("Destination: " + destination);
        System.out.println("Price: " + price);
        System.out.println( "Date: " + today);
    
    }
}
