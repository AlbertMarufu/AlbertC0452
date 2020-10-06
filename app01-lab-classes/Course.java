
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    public String courseName;
    
    public String courseCode;
    
    public Course(String number , String title)
    {
        courseName = title;
        courseCode = number;
        
        
    }
    
    public String toString()
    {
        return ("The course name and title is: " + courseName + " " + courseCode);
    }
    
}
