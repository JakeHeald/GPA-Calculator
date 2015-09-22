/**
 * @(#)YearsList.java
 *
 *
 * @author 
 * @version 1.00 2015/3/16
 */


public class YearsList {

    private YearsNode first;
	private YearsNode last;
	private int size;
	
   /**
	*default constructor constructs a new YearsList class with a default size of 0, first YearsNode of null, and last YearsNode of null
	*/
    
    public YearsList() 
    {
	    size = 0;
	    first = null;
	    last = null;
    }
    
   /**
	*overloaded constructor constructs a new YearsList class with a size of 1, sets the first YearsNode of YearsList, and last YearsNode of null
	*@parem c sets the first YearsNode in the linkedlist
	*/
    
    public YearsList(Years c)
    {
	    size = 1;
	    first = new YearsNode(c, null, null);
	    last = null;
    }
    
   /**
	*gets the first YearsNode in the Years linkedlist
	*@return returns the first YearsNode in the linkedlist
	*/
    
    public YearsNode getFirst()
    {
	    if(first != null)
	    	return first;
	    return null;
    }
    
    
   /**
	*gets the last YearsNode in the Years linkedlist
	*@return returns the last YearsNode in the linkedlist
	*/
    
    public YearsNode getLast()
    {
	    YearsNode b = first;
	    if(last != null)
	    	{
	    	System.out.println("AddingLast1: " + b);
	    	return last;
	    	}
	    else if(first != null)
	    {
	    	while(b.getNext() != null)
	    	{
	    		System.out.println("AddingLast2: " + b);
	    		b = b.getNext();
	    	}
	    	last = b;
	    	return last;
	    }
	    return null;
    }
    
   /**
    *gets the size of the LinkedList of YearsList
    *@return returns the size of YearsList
    */
    
    public int getSize()
    {
    	return size;
    }
    
   /**
    *adds a Years object to the front of the LinkedList YearsList
    *@parem s adds Years s to the first node of YearsList
    */
    
    public void addFirst(Years s)
    {
    	YearsNode nodeS = new YearsNode(s, null, null);
    	YearsNode b = first;
    	nodeS.setNext(b);
    	b.setPrev(nodeS);
		size++;
		first = nodeS;
    }
    
   /**
    *adds a Years object to the end of the LinkedList YearsList
    *@parem s adds Years s to the last node of YearsList
    */
    
    public void addLast(Years s)
    {
    	YearsNode nodeS = new YearsNode(s, null, null);
    	YearsNode b = getLast();
    	b.setNext(nodeS);
    	nodeS.setPrev(b);
		size++;
		last = nodeS;
    }
    
   /**
    *adds a Years object into the LinkedList of YearsList based on its name
    *@parem s adds Years s to YearsList with its position based on its name
    */
    
    public void add(Years s)
    {
    	YearsNode nodeS = new YearsNode(s, null, null);
    	if(first == null)
    	{
    		first = nodeS;
    		size++;
    	}
    	else
    	{
    	YearsNode b = first;
    	YearsNode temp = null;
	    while(b != null && nodeS.getData().compareTo(b.getData()) >= 0)
	    	{
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
    		System.out.println("temp: " + temp);
    		System.out.println("b: " + b);
    		b.getPrev().setNext(nodeS);
    		b.setPrev(nodeS);
    		nodeS.setNext(b);
    		nodeS.setPrev(temp);
    	}
    	}
    }
	
	/**
    *removes a Years object into the LinkedList of YearsList
    *@parem s removes object Years s from YearsList
    */
	
	public boolean remove(Years s)
	{
		YearsNode nodeS = new YearsNode(s, null, null);
		YearsNode b = first;
		YearsNode temp = null;
		
		while(b != null)
	    {
		    if(nodeS.getData().equals(first.getData())) //Removing from the first node
		    {
		    	if(first.getNext() == null)
		    		first = null;
		    	else
		    	{
		    		b.getNext().setPrev(null);
		    		first = b.getNext();
		    	}
		    	size--;
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
    *checks to see if a Years object is in the YearsList object
    *@parem y Years object to be checked to see if it is in the Linked List of YearsList
    */
    
	public boolean findYears(Years y)
	{
		YearsNode b = first;
		YearsNode nodeY = new YearsNode(y, null, null);
		while(b != null)
		{
			if(b.getData().equals(nodeY.getData()))
				return true;
			b = b.getNext();
		}
		return false;
	}
	
   /**
    *finds a Years object that is in the YearsList object
    *@parem y Years object to be found in the Linked List of YearsList
    */
	
	public Years getYears(Years y)
	{
		YearsNode b = first;
		YearsNode nodeY = new YearsNode(y, null, null);
		while(b != null)
		{
			if(b.getData().equals(nodeY.getData()))
				return b.getData();
			b = b.getNext();
		}
		return null;
	}
	
   /**
	*converts the linked list of YearsNode objects into list of Strings
	*@return returns the Years object's name
	*/
	
	public String toString()
	{
		YearsNode b = first;
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