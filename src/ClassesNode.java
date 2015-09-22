/**
 * @(#)ClassesNode.java
 *
 *
 * @author 
 * @version 1.00 2015/3/16
 */


public class ClassesNode {

    private Classes data;
    private ClassesNode next;
    private ClassesNode prev;
    
   /**
    *default constructor constructs a new ClassesNode with a Classes object of null, a next node of null, and a prev node of null
    */
    
    public ClassesNode() 
    {
    data = null;
    next = null;
    prev = null;
    }
    
    /**
    *overload constructor constructs a new ClassesNode with a Classes object of null, a next node of null, and a prev node of null
    *@parem c sets the data of the ClassNode of c
    *@parem n sets the next node of the ClassNode of n
    *@parem p sets the prev node of the ClassNode of p
    */
    
    public ClassesNode(Classes c, ClassesNode n, ClassesNode p)
    {
    data = c;
    next = n;
    prev = p;
    }
    
   /**
	*gets the Classes object of the ClassesNode
	*@returns the Classes object
	*/
    
    public Classes getData()
    {
    	return data;
    }
    
   /**
	*sets the Classes object of ClassesNode
	*@param c sets the Classes object of the ClassesNode 
	*/
    
    public void setData(Classes c)
    {
    	data = c;
    }
    
    /**
	 *gets the prev ClassesNode that the ClassesNode object is pointing to
	 *@returns the prev ClassesNode node
	 */
	 
	 public ClassesNode getPrev()
	 {
	 	return prev;
	 }
	 
	/**
	 *gets the next ClassesNode that the ClassesNode object is pointing to
	 *@returns the next ClassesNode node
	 */
	 
	 public ClassesNode getNext()
	 {
	 	return next;
	 }
    
    /**
	 *sets the prev ClassesNode node that the ClassesNode object is pointing to
	 *@param p sets the prev ClassesNode node
	 */
	 
     public void setPrev(ClassesNode p)
     {
     	prev = p;
     }
     
    /**
	 *sets the next ClassesNode node that the ClassesNode object is pointing to
	 *@param n sets the next ClassesNode node
	 */
	 
     public void setNext(ClassesNode n)
     {
     	next = n;
     }
     
    /**
	 *converts the Classesnode object into the string of name period weight
	 *@return returns the Classesnode in a string form
	 */
     
     public String toString()
     {
     	return data.toString();
     }
     
    
    
    
    
}