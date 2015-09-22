/**
 * @(#)Class.java
 *
 *
 * @Jake Heald 
 * @version 1.00 2014/1/31
 */


public class Classes {


	private String cname;
	private int[] grade;
	private double weight;
	private int period;
	private static final int exempted = -1;
	
   /**
	*defualt constructer constructs the default values of the Class of null name, period of 0, grade list of 8 spots, and weight of 4.0.
	*/
    
    public Classes()
    {
	    cname = null;
	    period = 0;
	    weight = 4.0;
	    grade = new int[8];
    }
	
	
	/**
	 *overloaded constructor constructs a new Class
	 *@param cname name of the Class
	 *@param grade grades of six six weeks and final exams of Class
	 *@param weight the weight of the Class
	 */
	
    public Classes(String className, int classPeriod, double classWeight, int[] classGrade)
    {
	    cname = className;
	    period = classPeriod;
	    weight = classWeight;
	    grade = classGrade;
    }
    
    /**
     *gets the name of the class
     *@return returns the name of the class
     */
     
    public String getCName()
    {
    	return cname;
    }
	
	/**
	 *gets the six weeks grades and exam grade of semester one and two
	 *@param index index of the grade being returned
	 *@return returns the six weeks grades and exam grade of semester one and two
	 */
	
	public int[] getGrade()
	{
		return grade;
	}
	
	/**
     *gets the period of the class
     *@return returns the period of the class
     */
     
     public int getPeriod()
     {
     	return period;
     }
	 
	 /**
	  *gets the weight of the class
	  *@return returns the weight of the class
	  */
	 
	 public double getWeight()
	 {
	 	return weight;
	 }
	 	
	/**
	 *changes a grade in the class
	 *@param index the position the grade being replaced was and were the new grade will be
	 *@param numberGrade the new grade going in at the index
	 */
	
	public void changeGrade(int index, int numberGrade)
	{
		grade[index] = numberGrade;
	}
	
	/**
	 *converts the object into the string of name period weight
	 *@return returns the name period and weight of the Class
	 */
	
	public String toString()
	{
		return cname + "  " + period +"  "+ weight;
	}
	
	/** 
	 *compares the periods of the classes
	 *@param c compares the periods of the classes
	 */
	 
	public boolean equals(Object c)
	{
		Classes other = (Classes) c;
		return this.cname.equals(other.getCName());
	}
	
	/**
	 *compares the names of the Classes objects
	 *@param o compares the names of the classes
	 */
	
	public int compareTo(Object o)
	{
		Classes other = (Classes) o;
		if(this.getPeriod() == other.getPeriod())
			return this.getCName().compareTo(other.getCName());
		else
			return this.getPeriod() - other.getPeriod();
	}
	
	/**
	 *calculates the grade average of semester one for one class
	 */
 	
	public int getGradeAverageSemOne()
	{
		int counter = 0;
		double average = 0.0;
		int total=0;
		for(int x = 0; x < 4; x++)
		{
			if(100 >= grade[x] && grade[x] > exempted)
					{		
						total += grade[x];
						counter++;
				 	}
				 else if ( 100 < grade[x])
				 	{
				 		total += 100;
				 		counter++;
					}
		}
		average = total/counter;
		average = Math.min(average, 100.0);
		return (int)Math.round(average);
	}
	/**
	 *calculates the grade average of semester two for one class
	 */
	
	public int getGradeAverageSemTwo()
	{		 	
		int counter = 0;
		double average = 0;
		int total=0;
				for(int x = 4; x < 8; x++)
				{
					if(100 >= grade[x] && grade[x] > exempted)
					{
						 	total += grade[x];
						 	counter++;
					}
					else if ( 100 < grade[x])
				 	{
				 		total += 100;
				 		counter++;
					}
				}
			average = total/counter;
			average = Math.min(average, 100.0);
			return (int)Math.round(average);
	} 

	/**
	 *calculates the GPA of the class for semester one
	 */

	public double getGPAAverageSemOne()
	{
		double GPASemOne = 0.0;
		if(weight == 5.0)
			switch(getGradeAverageSemOne())
			{
			case 100:
			case 99:
			case 98:
			case 97:
			GPASemOne = 5.0;
			break;
			
			case 96:
			case 95:
			case 94:
			case 93:
			GPASemOne = 4.8;
			break;
			
			case 92:
			case 91:
			case 90:
			GPASemOne = 4.6;
			break;
			
			case 89:
			case 88:
			case 87:
			GPASemOne = 4.4;
			break;
			
			case 86:
			case 85:
			case 84:
			case 83:
			GPASemOne = 4.2;
			break;
			
			case 82:
			case 81:
			case 80:
			GPASemOne = 4.0;
			break;
			
			case 79:
			case 78:
			case 77:
			GPASemOne = 3.8;
			break;
			
			case 76:
			case 75:
			case 74:
			case 73:
			GPASemOne = 3.6;
			break;
			
			case 72:
			case 71:
			GPASemOne = 3.4;
			break;
			
			case 70:
			GPASemOne = 3.0;
			break;
			default:
			GPASemOne = 0.0;
			break;
			}
		else if(weight == 4.5)
			switch(getGradeAverageSemOne())
			{
			case 100:
			case 99:
			case 98:
			case 97:
			GPASemOne = 4.5;
			break;
			
			case 96:
			case 95:
			case 94:
			case 93:
			GPASemOne = 4.3;
			break;
			
			case 92:
			case 91:
			case 90:
			GPASemOne = 4.1;
			break;
			
			case 89:
			case 88:
			case 87:
			GPASemOne = 3.9;
			break;
			
			case 86:
			case 85:
			case 84:
			case 83:
			GPASemOne = 3.7;
			break;
			
			case 82:
			case 81:
			case 80:
			GPASemOne = 3.5;
			break;
			
			case 79:
			case 78:
			case 77:
			GPASemOne = 3.3;
			break;
			
			case 76:
			case 75:
			case 74:
			case 73:
			GPASemOne = 3.1;
			break;
			
			case 72:
			case 71:
			GPASemOne = 2.9;
			break;
			
			case 70:
			GPASemOne = 3.0;
			break;
			default:
			GPASemOne = 0.0;
			break;
			}
		else
			switch(getGradeAverageSemOne())
			{
			case 100:
			case 99:
			case 98:
			case 97:
			GPASemOne = 4.0;
			break;
			
			case 96:
			case 95:
			case 94:
			case 93:
			GPASemOne = 3.8;
			break;
			
			case 92:
			case 91:
			case 90:
			GPASemOne = 3.6;
			break;
			
			case 89:
			case 88:
			case 87:
			GPASemOne = 3.4;
			break;
			
			case 86:
			case 85:
			case 84:
			case 83:
			GPASemOne = 3.2;
			break;
			
			case 82:
			case 81:
			case 80:
			GPASemOne = 3.0;
			break;
			
			case 79:
			case 78:
			case 77:
			GPASemOne = 2.8;
			break;
			
			case 76:
			case 75:
			case 74:
			case 73:
			GPASemOne = 2.6;
			break;
			
			case 72:
			case 71:
			GPASemOne = 2.4;
			break;
			
			case 70:
			GPASemOne = 2.0;
			break;
			default:
			GPASemOne = 0.0;
			break;
			}
		return GPASemOne;
	}
	/**
	 *calculates the GPA of the class for semester one
	 */

	public double getGPAAverageSemTwo()
	{
		double GPASemTwo = 0.0;
		if(weight == 5.0)
			switch(getGradeAverageSemTwo())
			{
			case 100:
			case 99:
			case 98:
			case 97:
			GPASemTwo = 5.0;
			break;
			
			case 96:
			case 95:
			case 94:
			case 93:
			GPASemTwo = 4.8;
			break;
			
			case 92:
			case 91:
			case 90:
			GPASemTwo = 4.6;
			break;
			
			case 89:
			case 88:
			case 87:
			GPASemTwo = 4.4;
			break;
			
			case 86:
			case 85:
			case 84:
			case 83:
			GPASemTwo = 4.2;
			break;
			
			case 82:
			case 81:
			case 80:
			GPASemTwo = 4.0;
			break;
			
			case 79:
			case 78:
			case 77:
			GPASemTwo = 3.8;
			break;
			
			case 76:
			case 75:
			case 74:
			case 73:
			GPASemTwo = 3.6;
			break;
			
			case 72:
			case 71:
			GPASemTwo = 3.4;
			break;
			
			case 70:
			GPASemTwo = 3.0;
			break;
			default:
			GPASemTwo = 0.0;
			break;
			}
		else if(weight == 4.5)
			switch(getGradeAverageSemTwo())
			{
			case 100:
			case 99:
			case 98:
			case 97:
			GPASemTwo = 4.5;
			break;
			
			case 96:
			case 95:
			case 94:
			case 93:
			GPASemTwo = 4.3;
			break;
			
			case 92:
			case 91:
			case 90:
			GPASemTwo = 4.1;
			break;
			
			case 89:
			case 88:
			case 87:
			GPASemTwo = 3.9;
			break;
			
			case 86:
			case 85:
			case 84:
			case 83:
			GPASemTwo = 3.7;
			break;
			
			case 82:
			case 81:
			case 80:
			GPASemTwo = 3.5;
			break;
			
			case 79:
			case 78:
			case 77:
			GPASemTwo = 3.3;
			break;
			
			case 76:
			case 75:
			case 74:
			case 73:
			GPASemTwo = 3.1;
			break;
			
			case 72:
			case 71:
			GPASemTwo = 2.9;
			break;
			
			case 70:
			GPASemTwo = 3.0;
			break;
			default:
			GPASemTwo = 0.0;
			break;
			}
		else
			switch(getGradeAverageSemTwo())
			{
			case 100:
			case 99:
			case 98:
			case 97:
			GPASemTwo = 4.0;
			break;
			
			case 96:
			case 95:
			case 94:
			case 93:
			GPASemTwo = 3.8;
			break;
			
			case 92:
			case 91:
			case 90:
			GPASemTwo = 3.6;
			break;
			
			case 89:
			case 88:
			case 87:
			GPASemTwo = 3.4;
			break;
			
			case 86:
			case 85:
			case 84:
			case 83:
			GPASemTwo = 3.2;
			break;
			
			case 82:
			case 81:
			case 80:
			GPASemTwo = 3.0;
			break;
			
			case 79:
			case 78:
			case 77:
			GPASemTwo = 2.8;
			break;
			
			case 76:
			case 75:
			case 74:
			case 73:
			GPASemTwo = 2.6;
			break;
			
			case 72:
			case 71:
			GPASemTwo = 2.4;
			break;
			
			case 70:
			GPASemTwo = 2.0;
			break;
			default:
			GPASemTwo = 0.0;
			break;
			}
		return GPASemTwo;
	}









}
