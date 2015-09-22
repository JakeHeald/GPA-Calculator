/**
 * @(#)YearsNode.java
 *
 *
 * @author 
 * @version 1.00 2015/3/17
 */


public class YearsNode {

    private Years data;
    private YearsNode next;
    private YearsNode prev;
    
   /**
    *default constructor constructs a new YearsNode with a Years object of null, a next node of null, and a prev node of null
    */
    
    public YearsNode() 
    {
    data = null;
    next = null;
    prev = null;
    }
    
    /**
    *overload constructor constructs a new YearsNode with a Years object of null, a next node of null, and a prev node of null
    *@parem c sets the data of the YearsNode of c
    *@parem n sets the next node of the YearsNode of n
    *@parem p sets the prev node of the YearsNode of p
    */
    
    public YearsNode(Years c, YearsNode n, YearsNode p)
    {
    data = c;
    next = n;
    prev = p;
    }
    
   /**
	*gets the Years object of the YearsNode
	*@returns the Years object
	*/
    
    public Years getData()
    {
    	return data;
    }
    
   /**
	*sets the Years object of YearsNode
	*@param y sets the Years object of the YearsNode 
	*/
    
    public void setData(Years y)
    {
    	data = y;
    }
    
    /**
	 *gets the prev YearsNode that the YearsNode object is pointing to
	 *@returns the prev YearsNode node
	 */
	 
	 public YearsNode getPrev()
	 {
	 	return prev;
	 }
	 
	/**
	 *gets the next YearsNode that the YearsNode object is pointing to
	 *@returns the next YearsNode node
	 */
	 
	 public YearsNode getNext()
	 {
	 	return next;
	 }
    
    /**
	 *sets the prev YearsNode node that the YearsNode object is pointing to
	 *@param p sets the prev YearsNode node
	 */
	 
     public void setPrev(YearsNode p)
     {
     	prev = p;
     }
     
    /**
	 *sets the next YearsNode node that the YearsNode object is pointing to
	 *@param n sets the next YearsNode node
	 */
	 
     public void setNext(YearsNode n)
     {
     	next = n;
     }
     
    /**
	 *converts the YearsNode object into the string of name period weight
	 *@return returns the YearsNode in a string form
	 */
     
     public String toString()
     {
     	return data.toString();
     }
    
    
    
}