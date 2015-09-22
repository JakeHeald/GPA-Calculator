/**
 * @(#)StudentNode.java
 *
 *
 * @author 
 * @version 1.00 2015/3/18
 */


public class StudentNode {

	private Student data;
    private StudentNode next;
    private StudentNode prev;
    
   /**
    *default constructor constructs a new StudentNode with a Student object of null, a next node of null, and a prev node of null
    */
    
    public StudentNode() 
    {
    data = null;
    next = null;
    prev = null;
    }
    
    /**
    *overload constructor constructs a new StudentNode with a Student object of null, a next node of null, and a prev node of null
    *@parem s sets the data of the ClassNode of c
    *@parem n sets the next node of the ClassNode of n
    *@parem p sets the prev node of the ClassNode of p
    */
    
    public StudentNode(Student s, StudentNode n, StudentNode p)
    {
    data = s;
    next = n;
    prev = p;
    }
    
   /**
	*gets the Student object of the StudentNode
	*@returns the Student object
	*/
    
    public Student getData()
    {
    	return data;
    }
    
   /**
	*sets the Student object of StudentNode
	*@param s sets the Student object of the StudentNode 
	*/
    
    public void setData(Student s)
    {
    	data = s;
    }
    
    /**
	 *gets the prev StudentNode that the StudentNode object is pointing to
	 *@returns the prev StudentNode node
	 */
	 
	 public StudentNode getPrev()
	 {
	 	return prev;
	 }
	 
	/**
	 *gets the next StudentNode that the StudentNode object is pointing to
	 *@returns the next StudentNode node
	 */
	 
	 public StudentNode getNext()
	 {
	 	return next;
	 }
    
    /**
	 *sets the prev StudentNode node that the StudentNode object is pointing to
	 *@param p sets the prev StudentNode node
	 */
	 
     public void setPrev(StudentNode p)
     {
     	prev = p;
     }
     
    /**
	 *sets the next StudentNode node that the StudentNode object is pointing to
	 *@param n sets the next StudentNode node
	 */
	 
     public void setNext(StudentNode n)
     {
     	next = n;
     }
     
    /**
	 *converts the Studentnode object into the string of name
	 *@return returns the Studentnode in a string form
	 */
     
     public String toString()
     {
     	return data.toString();
     }
    
    
}