import java.util.*;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author David J. Barnes and Michael Kolling
 * @version 28.10/2020
 * 
 * Modified by Albert
 */
public class Course
{

    private String codeNo;
    private String title;
    private ArrayList<Module> modules;
    private String finalGrades;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
   
    
    {
       
        this.codeNo = codeNo;
        this.title = title;
        
        modules = new ArrayList<Module>();
    }

   
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
        
        System.out.println("Modules"); 
        
        for(Module module: modules)
    {    
      module.printModule();
      
     
      
     
    
    }
    
}
    
    public void addModule(Module newModule)
    {
        modules.add(newModule);
    }
    
    public void calculateMark()
       
    {
     
     int finalMarks=0;
     finalGrades = null;
     
     
     for(Module module : modules)
   
    {
         
     finalMarks=finalMarks+module.getMark();    
     
    } 
     finalMarks = finalMarks/modules.size(); 

    System.out.println("Your final marks: " + finalMarks);
    
    if(finalMarks>= 0 && finalMarks < 40)
    
    {
      
        finalGrades="F";
      
    }
    
    else if (finalMarks>39 && finalMarks <50)
    
    {
        finalGrades="D";
        
    }
        
    else if (finalMarks > 49 && finalMarks < 60)
    
    {
        finalGrades="C";
    }
    
    else if (finalMarks > 59 && finalMarks < 70)
    
    {
        finalGrades = "B";
        
    }
       
    else if (finalMarks > 69 && finalMarks <100)
    
    { 
        finalGrades="A";
        
    }
    else
    {
        System.out.println("Final Marks must be a positive number smaller than 100");
        
    }
    
         
    System.out.println("Final Grades are: "+ finalGrades);
         
    
           
}

}