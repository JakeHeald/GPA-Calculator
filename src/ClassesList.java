/**
 * @(#)ClassesList.java
 *
 *
 * @Jake Heald
 * @version 1.00 2015/2/18
 */
import java.util.NoSuchElementException;

public class ClassesList {
	
	private ClassesNode first;
	private ClassesNode last;
	private int size;
	
   /**
	*default constructor constructs a new ClassesList class with a default size of 0, first ClassesNode of null, and last ClassesNode of null
	*/
    
    public ClassesList() 
    {
	    size = 0;
	    first = null;
	    last = null;
    }
    
   /**
	*overloaded constructor constructs a new ClassesList class with a size of 1, sets the first ClassesNode of ClassesList, and last ClassesNode of null
	*@parem c sets the first ClassesNode in the linkedlist
	*/
    
    public ClassesList(Classes c)
    {
	    size = 1;
	    first = new ClassesNode(c, null, null);
	    last = null;
    }
    
   /**
	*gets the first ClassesNode in the Classes linkedlist
	*@return returns the first ClassesNode in the linkedlist
	*/
    
    public ClassesNode getFirst()
    {
	    if(first != null)
	    	return first;
	    return null;
    }
    
    
    
   /**
	*gets the last ClassesNode in the Classes linkedlist
	*@return returns the last ClassesNode in the linkedlist
	*/
    
    public ClassesNode getLast()
    {
	    ClassesNode b = first;
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
    *gets the size of the LinkedList of ClassesList
    *@return returns the size of ClassesList
    */
    
    public int getSize()
    {
    	return size;
    }
    
   /**
    *adds a Classes object to the front of the LinkedList ClassesList
    *@parem s adds Classes s to the first node of ClassesList
    */
    
    public void addFirst(Classes s)
    {
    	ClassesNode nodeS = new ClassesNode(s, null, null);
    	ClassesNode b = first;
    	nodeS.setNext(b);
    	b.setPrev(nodeS);
		size++;
		first = nodeS;
    }
    
   /**
    *adds a Classes object to the end of the LinkedList ClassesList
    *@parem s adds Classes s to the last node of ClassesList
    */
    
    public void addLast(Classes s)
    {
    	ClassesNode nodeS = new ClassesNode(s, null, null);
    	ClassesNode b = getLast();
    	b.setNext(nodeS);
    	nodeS.setPrev(b);
		size++;
		last = nodeS;
    }
    
   /**
    *adds a Classes object into the LinkedList of ClassesList based on its period and then its name
    *@parem s adds Classes s to ClassesList with its position based on its period and then its name
    */
    
    public void add(Classes s)
    {
    	ClassesNode nodeS = new ClassesNode(s, null, null);
    	if(first == null)
    	{
    		first = nodeS;
    		size++;
    	}
    	else
    	{
    	ClassesNode b = first;
    	ClassesNode temp = null;
	    while(b != null && nodeS.getData().compareTo(b.getData()) >= 0)
	    	{
	    	System.out.println("Compare: " + nodeS.getData().compareTo(b.getData()));
	    	System.out.println(b);
	    	b = b.getNext();
	    	}
    	if(b == null)
    		addLast(s);
    	else if(b.getPrev() == null)
    	{
    		addFirst(s);
    		System.out.println("failure???");
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
    *removes a Classes object into the LinkedList of ClassesList
    *@parem s removes object Classes s from ClassesList
    */
	
	public boolean remove(Classes s)
	{
		ClassesNode nodeS = new ClassesNode(s, null, null);
		ClassesNode b = first;
		ClassesNode temp = null;
		
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
    *checks to see if a Classes object is in the ClassesList object
    *@parem c Classes object to be checked to see if it is in the Linked List of ClassesList
    */
	
	public boolean findClasses(Classes c)
	{
		ClassesNode b = first;
		ClassesNode nodeC = new ClassesNode(c, null, null);
		while(b != null)
		{
			System.out.println(b);
			if(b.getData().equals(nodeC.getData()))
				return true;
			b = b.getNext();
		}
		return false;
	}
	
	/**
    *finds a Classes object that is in the ClassesList object
    *@parem c Classes object to be found in the Linked List of ClassesList
    */
	
	public Classes getClasses(Classes c)
	{
		ClassesNode b = first;
		ClassesNode nodeC = new ClassesNode(c, null, null);
		while(b != null)
		{
			if(b.getData().equals(nodeC.getData()))
				return b.getData();
			b = b.getNext();
		}
		return null;
	}
	
	/**
	*converts the linked list of ClassesNode objects into list of Strings
	*@return returns the Classes object's name, period, and weight
	*/
	
	public String toString()
	{
		ClassesNode b = first;
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