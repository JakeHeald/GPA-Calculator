/**
 * @(#)Student.java
 *
 *
 * @Jake Heald
 * @version 1.00 2014/1/31
 */ 
import java.util.ArrayList;
/*Student name
 * 0 ........
 * 1 class nane, grades[], weight
 * ...
 *
 */
 //public enum Year{
 	//Freshman, Sophermore, Junior, Senior
// }
public class Student {

	private String name;
	private YearsList years;

	/**
	 *defualt constructer constructs the default values of the student of name null, year names of null, left node null, right node null, and a default YearsList.
	 */
	
    public Student()
    {
    name = null;
    years = new YearsList();
    }
	
	/**
	 *overloaded constructor constructs a new Student
	 *@param name name of the student
	 *@param studentYears list of School years of the student
	 *@param y LinkedList of school years the student has pacticipated in
	 */
	
    public Student(String studentName, YearsList y)
    {
    	name = studentName;
    	years = y;
    }
    
    
   /**
	*gets the name of the student
	*@return returns the name of the student
	*/
	
    public String getName()
    {
    	return name;
    }
    
   /**
	*gets the School Years of the student
	*@return returns the YearList object of the student
	*/
    
    public YearsList getYears()
    {
    	return years;
    }
    
   /**
	*convets the object into a string of name of the student and all the student's school years
	*@return returns the student's name with all their school years
	*/
	
    public String toString()
    {
    	return name + " has a GPA of: " + getStudentGPAAverage() + years.toString(); //arrange years in order
    }

   /**
	*checks the names of two students to see if they are equall
	*@param s is the name of the student being compated to
	*/

	public boolean equals(Object s)
	{
		Student other = (Student) s;
		return this.name.equals(other.name);
	}
	
   /**
	*compares the names of the students
	*@param o compares the names of the students
	*/
	
	public int compareTo(Object o)
	{
		Student other = (Student) o;
		return this.getName().compareTo(other.getName());
	}

   /**
	*gets the total GPA average of a student
	*@return returns the total GPA average of a student
	*/
	 
	 public double getStudentGPAAverage()
	 {
		YearsNode y = years.getFirst();
		double studentGPAAverage = 0.0;
		while(y != null)
		{
			studentGPAAverage = y.getData().getScheduleTotalGPA();
			y = y.getNext();
		}
		studentGPAAverage = studentGPAAverage / years.getSize();
		return studentGPAAverage;
	 }
}