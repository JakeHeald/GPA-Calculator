/**moved all stuff
 * @(#)Years.java
 *
 *
 * @author 
 * @version 1.00 2014/2/11
 */
import java.util.ArrayList;

public class Years {

private String yname;
private ClassesList schedule;

    /**
     *Overloaded constructer constructs a new year
     *@param yearName name of the year
     *@param yearOfClasses Lined list for classes in that year
     */
    
    public Years(String yearName,  ClassesList yearOfClasses)
    {
    yname = yearName;
    schedule = yearOfClasses;
    }
    
    /**
     *constructs the Years class with a null for its name and an empty array list of classes
     */
     
    public Years()
    {
    yname = "Null";
    schedule = new ClassesList();
    }

	/**
	 *gets the name of the Year
	 *@return returns the name of the year
	 */
	 
	 public String getYName()
	 {
	 return yname;
	 }
	
   /**
	*gets the Classes of the student
	*@return returns the ClassesList object of the student
	*/
    
    public ClassesList getClasses()
    {
    	return schedule;
    }
	
	 /**
	  *calculates the total GPA for all Classes in the schedule for the entire year
	  *@param ASchedule Schedule that is having its total GPA for that year being calculated
	  *@return returns the total GPA for all the classes in the schedule for the entire year
	  */
	  
	  public double getScheduleTotalGPA()
	  {
	  double totalGPA = 0.0;
	  totalGPA+= (getScheduleTotalGPAForSemOne() + getScheduleTotalGPAForSemTwo())/2;
	  return totalGPA;
	  }
	
	/**
	 *convets the Years class into a string
	 *@return returns the name of the year with all of its classes
	 */
	
	public String toString()
	{
	return yname + " Year:\n" + schedule.toString();
	}
	
	/**
	 *compares the names of the years
	 *@param y compares the other's name to the name of other Years
	 */
	 
	public boolean equals(Object y)
	{
	Years other = (Years) y;
	return this.yname.equals(other.getYName());
	}
	
	/**
	 *compares the names of the Years
	 *@param o compares the names of the Years
	 */
	
	public int compareTo(Object o)
	{
		Years other = (Years) o;
		return this.getYName().compareTo(other.getYName());
	}
	
	
	/**
	  *calculates the total GPA for all the classes in the schedule for the first semester
	  *@return returns the total GPA for all the Classes the schedule for the first semester
	  */
	  
	  public double getScheduleTotalGPAForSemOne()
	  {
	  ClassesNode b = schedule.getFirst();
	  double totalGPA = 0.0;
	  while(b.getNext() != null)
	  	{
	  	totalGPA += b.getData().getGPAAverageSemOne();
	  	b = b.getNext();
	  	}
	  totalGPA = totalGPA / schedule.getSize();
	  return totalGPA;
	  }
	
	 /**
	  *calculates the total GPA for all Classes in the schedule for the second semester
	  *@return returns the total GPA for all the classes in the schedule for the second semester
	  */
	  
	  public double getScheduleTotalGPAForSemTwo()
	  {
	  ClassesNode b = schedule.getFirst();
	  double totalGPA = 0.0;
	  while(b.getNext() != null)
	  	{
	  	totalGPA += b.getData().getGPAAverageSemTwo();
	  	b = b.getNext();
	  	}
	  totalGPA = totalGPA / schedule.getSize();
	  return totalGPA;
	  }
	
	
	
	
}