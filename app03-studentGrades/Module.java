
/**
 * Write a description of class Modue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
   private String title;
   private String code;
   
   private int mark;
   
   
    private int credits;

    /**
     * Constructor for objects of class Modue
     */
    public Module(String title,String code)
  
    {
        this.title = title;
        this.code = code;    
    }
    
    public void awardMark(int mark)
    
   { 
       this.mark = mark;
        
   }
   
   public void calculateCredits()
   
   {
   
    
       
       if(mark > 39)
       {
         
         credits =15;
      
       }
       else
       {
        
         credits= 0;
         
       }
        
    }
    
    public int getCredits()
    
    {
        return credits;
        
    }

   public int getMark()
   
   {
      return mark; 
   }
    public void printModule()
   {
    
    System.out.println("Module Name: " + title + " , Module Code: " + code + ", Mark:" + mark + "%");
        
   }
    
}
