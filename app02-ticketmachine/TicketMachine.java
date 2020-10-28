/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Albert
 */
public class TicketMachine
{
    private static final Ticket AYLESBURY_T = new Ticket("Aylesbury", 220);
    private static final Ticket AMERSHAM_T  = new Ticket("Amersham", 300);
    private static final Ticket HIGHWYCOMBE_T = new Ticket("High Wycombe",330);
    
    private Ticket issuedTicket;
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        
        if(amount == 10)
        {
            balance = balance + amount;
        }
        
        else if(amount == 20)
        { 
            balance = balance + amount;
        }   
             
        else if(amount == 100) 
    {  
        balance = balance + amount;
    }
    
       else if(amount == 200)
    { balance = balance + amount;
    }          
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
        System.out.println("amount entered " + amount );
        System.out.println( "current balance " + balance);
    }
    
    public void selectAylesbury()
    {
        issuedTicket = AYLESBURY_T;
    }
    public void selectAmersham()
    {
        issuedTicket = AMERSHAM_T;
    }
    public void selectHighWycombe()
    {
        issuedTicket = HIGHWYCOMBE_T;
    }
    

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= issuedTicket.getPrice()) 
        {
            // Simulate the printing of a ticket.
            issuedTicket.printTicket();
            // Update the total collected with the price.
            // Reduce the balance by the price.
            balance = balance - issuedTicket.getPrice();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (issuedTicket.getPrice() - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
