/**
 * @(#)StudentList.java
 *
 *
 * @Jake Heald
 * @version 1.00 2015/2/18
 */
import java.util.NoSuchElementException;

public class StudentList {
	
	private StudentNode first;
	private StudentNode last;
	private int size;
	
   /**
	*default constructor constructs a new StudentList class with a default size of 0, first StudentNode of null, and last StudentNode of null
	*/
    
    public StudentList() 
    {
	    size = 0;
	    first = null;
	    last = null;
    }
    
   /**
	*overloaded constructor constructs a new StudentList class with a size of 1, sets the first StudentNode of StudentList, and last StudentNode of null
	*@parem c sets the first StudentNode in the linkedlist
	*/
    
    public StudentList(Student c)
    {
	    size = 1;
	    first = new StudentNode(c, null, null);
	    last = null;
    }
    
   /**
	*gets the first StudentNode in the Student linkedlist
	*@return returns the first StudentNode in the linkedlist
	*/
    
    public StudentNode getFirst()
    {
	    if(first != null)
	    	return first;
	    return null;
    }
    
    
   /**
	*gets the last StudentNode in the Student linkedlist
	*@return returns the last StudentNode in the linkedlist
	*/
    
    public StudentNode getLast()
    {
	    StudentNode b = first;
	    if(last != null)
	    	{
	    	return last;
	    	}
	    else if(first != null)
	    {
	    	while(b.getNext() != null)
	    	{
	    		b = b.getNext();
	    	}
	    	last = b;
	    	return last;
	    }
	    return null;
    }
    
   /**
    *gets the size of the LinkedList of StudentList
    *@return returns the size of StudentList
    */
    
    public int getSize()
    {
    	return size;
    }
    
   /**
    *adds a Student object to the front of the LinkedList StudentList
    *@parem s adds Student s to the first node of StudentList
    */
    
    public void addFirst(Student s)
    {
    	StudentNode nodeS = new StudentNode(s, null, null);
    	StudentNode b = first;
    	nodeS.setNext(b);
    	b.setPrev(nodeS);
		size++;
		first = nodeS;
    }
    
   /**
    *adds a Student object to the end of the LinkedList StudentList
    *@parem s adds Student s to the last node of StudentList
    */
    
    public void addLast(Student s)
    {
    	StudentNode nodeS = new StudentNode(s, null, null);
    	StudentNode b = getLast();
    	b.setNext(nodeS);
    	nodeS.setPrev(b);
		size++;
		last = nodeS;
    }
    
   /**
    *adds a Student object into the LinkedList of StudentList based on its period and then its name
    *@parem s adds Student s to StudentList with its position based on its period and then its name
    */
    
    public void add(Student s)
    {
    	StudentNode nodeS = new StudentNode(s, null, null);
    	if(first == null)
    	{
    		first = nodeS;
    		size++;
    	}
    	else
    	{
    	StudentNode b = first;
    	StudentNode temp = null;
	    while(b != null && nodeS.getData().compareTo(b.getData()) >= 0)
	    	{
	    	//System.out.println("Compare: " + nodeS.getData().compareTo(b.getData()));
	    	System.out.println(b);
	    	b = b.getNext();
	    	}
    	if(b == null)
    		addLast(s);
    	else if(b.getPrev() == null)
    	{
    		addFirst(s);
    	}
    	else
    	{
    		temp = b.getPrev();
    		//System.out.println("temp: " + temp);
    		//System.out.println("b: " + b);
    		b.getPrev().setNext(nodeS);
    		b.setPrev(nodeS);
    		nodeS.setNext(b);
    		nodeS.setPrev(temp);
    	}
    	}
    }
	
	/**
    *removes a Student object into the LinkedList of StudentList
    *@parem s removes object Student s from StudentList
    */
	
	public boolean remove(Student s)
	{
		StudentNode nodeS = new StudentNode(s, null, null);
		StudentNode b = first;
		StudentNode temp = null;
		
		while(b != null)
	    {
		    if(nodeS.getData().equals(first.getData())) //Removing from the first node
		    {
		    	b.getNext().setPrev(null);
		    	size--;
		    	first = b.getNext();
		    	return true;
		    }
		    else if(b.getNext() == null && b.getData().equals(nodeS.getData())) //Removing from the last node
		    {
		    	b.getPrev().setNext(null);
		    	size--;
		    	last = b.getPrev();
		    	return true;
		    }
		    else if(b.getData().equals(nodeS.getData())) //Removing Regularly
		    {
		    	b.getPrev().setNext(b.getNext());
		    	b.getNext().setPrev(b.getPrev());
		    	size--;
		    	return true;
		    }
			System.out.println(b);
			b = b.getNext(); //moving to the next node
	    }
	    return false;
	}
	
   /**
    *checks to see if a Student object is in the StudentList object
    *@parem s Student object to be checked to see if it is in the Linked List of StudentList
    */
	
	public boolean findStudent(Student s)
	{
		StudentNode b = first;
		StudentNode nodeS = new StudentNode(s, null, null);
		while(b != null)
		{
			if(b.getData().equals(nodeS.getData()))
				return true;
			b = b.getNext();
		}
		return false;
	}
	
   /**
    *finds a Student object that is in the StudentList object
    *@parem s Student object to be found in the Linked List of StudentList
    */
	
	public Student getStudent(Student s)
	{
		StudentNode b = first;
		StudentNode nodeS = new StudentNode(s, null, null);
		while(b != null)
		{
			if(b.getData().equals(nodeS.getData()))
				return b.getData();
			b = b.getNext();
		}
		return null;
	}
		
   /**
	*converts the linked list of StudentNode objects into list of Strings
	*@return returns the Student object's name
	*/
	
	public String toString()
	{
		StudentNode b = first;
		String s = "[ ";
		while(b != null)
		{
			if(b.getNext() != null)
				s += b.toString() + ", ";
			else
				s += b.toString() + "]";
			b = b.getNext();
		}
		return s;
	}
}