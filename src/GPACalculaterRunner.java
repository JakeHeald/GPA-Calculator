/**
 * @(#)GPACalculaterRunner.java
 *
 *
 * @Jake Heald 
 * @version 1.00 3/18/2014
 */
import java.io.*; 
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GPACalculaterRunner {
     
    /**
     * Creates a new instance of <code>GPACalculaterRunner</code>.
     */
    public GPACalculaterRunner() {

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
	   
	   String menu = "1 - load Student" + "\n" + "2 - new Student user " + "\n" + "3 - Exit GPA Calculator";
	   String menu2 = "Enter in the Student's name";
	   String menu3 = "1 - Enter in a new SchoolYear" + "\n" + "2 - quit";
	   String menu4 = "Enter in a Year Name";
	   String menu5 = "Name the Class";
	   String menu6 = "What Period is the Class";
	   String menu7 = "What are the Six Weeks grades and Final Exam grades of the coarse" + "\n" + "input a -1 for an exempted Final Exam or a Six Weeks or Final Exam you have not taken yet" + "\n" + "You must fill in all 8 grades!";
	   String menu8 = "1 - Make Another Class" + "\n" + "2 - Make Another Schoolyear";
	   String menu9 = "1 - Change Student Data" +"\n" + "2 - Add a new School Year" + "\n" + "3 - Calculate Grade and GPA" + "\n" + "4 - Back";
	   String menu10 = "1 - Caculate the GPA for Semester 1" + "\n" + "2 - Calculate the GPA for Semester 2" + "\n" + "3 - Caculate the total GPA for all years" + "\n" + "4-Caculate Individual Class Grades and GPA" + "\n" + "5-Quit";
	   String menu11 = "Enter in your Name";
	   String menu12 = "1 - Manage School Years" + "\n" + "2 - Manage Schedules" + "\n" + "3 - Manage Grades" + "\n" + "4 - Back"; 
	   String menu13 = "Enter the Name of the Year you wish to Edit";
	   String menu14 = "1 - Remove this Year" + "\n" + "2 - Check this Year" + "\n" + "3 - Back"; 
	   String menu15 = "Enter in the Name of the Class you wish to Edit";
	   String menu16 = "1 - Remove this Class" + "\n" + "2 - Add another Class to this year" + "\n" +"3 - Check this Class" + "\n" + "4 - Back";
	   String menu17 = "1 - First Six Weeks" + "\n" + "2 - Second Six Weeks" + "\n" + "3 - Third Six Weeks" + "\n" + "4 - Semester One Exam" + "\n" + "5 - Fourth Six Weeks" + "\n" + "6 - Seventh Six Weeks" + "\n" + "7 - Sixith Six Weeks" + "\n" + "8 - Semester Two Exam";
	   String menu18 = "Enter In a grade to replace the original Grade";
	   String menu19 = "1 - Keep Editing Class Grades" + "2 - Stop Editing Grades";
	   String menu20 = "1 - Calculate Grade Average for a Class" +"\n" + "2 - Calculate GPA Average for a Class" + "\n" + "3 - Calculate the GPA average for all the Classes" + "\n" + "4 - Calculate the GPA average for the Student" + "\n" + "5 - Back";
	   String menu21 = "1 - Calculate Grade Average for Semester One for this class" + "\n" + "2 - Calculate Grade Average for Semester Two for this class" + "\n" + "3 - Back";
	   String menu22 = "1 - Calculate GPA Average for Semester One for this class" + "\n" + "2 - Calculate GPA Average for Semester Two for this class" + "\n" + "3 - Back";
	   String menu23 = "1 - Calculate GPA Average for Semester One for this school year's Schedule" + "\n" + "2 - Calculate GPA Average for Semester Two for this school year's Schedule" + "\n" + "3 - Back";
	   String menu24 = "Enter the Name of the Year you wish to Calculate";
	   String menu25 = "Enter in the Name of the Class you wish to Calculate";
	   String studentName;
	   String yearName;
	   String className;
	   int classPeriod;
	   double classWeight;
	   int[] classGrade;
	   int[] grade;
	   Student AStudent;
	   Years AYear;
	   Classes AClass;
	   StudentList Students;
	   YearsList SchoolYears;
	   ClassesList Schedule;
	   boolean done;
	   boolean done2;
	   boolean done3;
	   boolean done4;
	   boolean done5;
	   boolean done6;
	   boolean save2;
	   boolean works;
	   boolean loaded;
	   boolean loaded2;
	   boolean loaded4;
	   boolean change;
	   boolean change2;
	   boolean change3;
	   boolean change4;
	   boolean change5;
	   boolean change6;
	   boolean works2;
	   boolean calculated;
	   int studentsSize;
	   int yearSize;
	   int classSize;
	   
	   
	   //file reader
	   Students = new StudentList();
	   File file = new File("StudentArrayList.txt");
	   try
	   {
	   Scanner fileReader = new Scanner(file);
		
	 /*System.out.println(fileReader.nextInt()); //stuff to test file reader to see if it is reading in information properly
	   fileReader.nextLine();
	   System.out.println(fileReader.nextLine());
	   System.out.println(fileReader.nextInt());
	   fileReader.nextLine();
	   System.out.println(fileReader.nextLine());
	   System.out.println(fileReader.nextInt());
	   fileReader.nextLine();
	   System.out.println(fileReader.nextLine());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next());
	   System.out.println(fileReader.next()); */



		
	   studentsSize = fileReader.nextInt();
	   fileReader.nextLine();
	   for(int s = 0; s < studentsSize; s++)
	   {
	   studentName = fileReader.nextLine();
	   yearSize = fileReader.nextInt();
	   SchoolYears = new YearsList();
	   for(int y = 0; y < yearSize; y++)
	   {
	   fileReader.nextLine();
	   yearName = fileReader.nextLine();
	   classSize = fileReader.nextInt();
	   Schedule = new ClassesList();
	   for(int c = 0; c < classSize; c++)
	   {
	   fileReader.nextLine();
	   className = fileReader.nextLine();
	   classPeriod = fileReader.nextInt();
	   classWeight = fileReader.nextDouble();
	   grade = new int[8];
	   for(int g = 0; g < 8; g++)
	   {
	   int x =  fileReader.nextInt();
	   grade[g] = x;
	   }
	   classGrade = grade;
	   Schedule.add(new Classes(className, classPeriod, classWeight, classGrade));
	   }	
	   SchoolYears.add(new Years(yearName, Schedule));
	   }
	   Students.add(new Student(studentName, SchoolYears));
	   studentName = fileReader.nextLine();
	   } 
	   
	   }
		catch(FileNotFoundException e)
		{
		JOptionPane.showMessageDialog(null, "File Could not be Found");
		} 
		
		System.out.println(Students);
	   
	   done = false;
	   while(!done)
	   {JOptionPane optionPane = new JOptionPane();

       String inputValue = JOptionPane.showInputDialog(menu);
       int case1 = Integer.parseInt(inputValue);
       
       

       switch(case1)
       
       
       {
       case 1: //gets student and manipulates student data
       	loaded = false;
       	change = true;
		String loadName = JOptionPane.showInputDialog(null, menu11);
        AStudent = new Student();
		Student BStudent = new Student(loadName, null);
		
		if(Students.findStudent(BStudent))
		{
		loaded = true;
		System.out.println(loaded);
		AStudent = Students.getStudent(BStudent);
		}
									/*	for(Student BStudent: Students)
										{
										studentName = BStudent.getName();
										if(studentName.equalsIgnoreCase(loadName))
										{
											loaded = true; 
											AStudent = BStudent;
										} */
		
        if(loaded)
        {
        JOptionPane.showMessageDialog(null, "Welcome Back " + AStudent.getName());
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Student " + loadName + " is not registered in GPA Calculator.");
        change = false;
        }
		if(change)
		{ 
       	done4 = false;
       	while(!done4)
       	{
		String inputValueLoadedStudent = JOptionPane.showInputDialog(menu9);
        int case4 = Integer.parseInt(inputValueLoadedStudent);
        switch(case4)
        {
        case 1: //change student data
        {
        change2 = false;
        while(!change2)
        {
        String case5String = JOptionPane.showInputDialog(menu12);
        int case5 = Integer.parseInt(case5String);
        loaded2 = false;
        switch(case5)
        	{
        	case 1: //Editing Years
        	String yearNameIntput = JOptionPane.showInputDialog(menu13);
        	SchoolYears = AStudent.getYears();
        	AYear = new Years(yearNameIntput, null);
        	
        	change3 = true;
        	if(SchoolYears.findYears(AYear))
        	{
        		AYear = SchoolYears.getYears(new Years(yearNameIntput, null));
        		JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
        		loaded2 = true;
        		change3 = false;
        	}
					          /*  for (Years BYear :SchoolYears)
					        		{
					        		yearName = BYear.getYName();
					        		if(yearName.equals(yearNameIntput))
					        		{
					        		AYear = BYear;
					        		JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
					        		loaded2 = true;
					        		change3 = false;
					        		}
					        		} */
        		if(!loaded2)
        			JOptionPane.showMessageDialog(null, "School Year " + yearNameIntput + "was not found"); 
        		
        		while(!change3)
        	{
        		String manipulateYears = JOptionPane.showInputDialog(menu14);
        		int manipulateYearsCase = Integer.parseInt(manipulateYears);
        		switch(manipulateYearsCase)
        		{
        			case 1:
        			{
        			if(AStudent.getYears().remove(AYear))
        			JOptionPane.showMessageDialog(null, AYear.getYName() + " year was removed");
        			else
        			JOptionPane.showMessageDialog(null, AYear.getYName() + " year was not found and therefore can not be removed");
				//file writer	
				PrintWriter writer = new PrintWriter("StudentArrayList.txt", "UTF-8");
				writer.println(Students.getSize()); //Number of Students
				StudentNode tempA = Students.getFirst();
				while(tempA != null)
				{
				writer.println(tempA.getData().getName());
				writer.println(tempA.getData().getYears().getSize()); //Number of School Years
				YearsNode tempB = tempA.getData().getYears().getFirst();
				while(tempB != null)
				    {
				    writer.println(tempB.getData().getYName());
				    writer.println(tempB.getData().getClasses().getSize()); //Number of Classes
				    ClassesNode tempC = tempB.getData().getClasses().getFirst();
				    while(tempC != null)
				    	{
				    	writer.println(tempC.getData().getCName());
				    	writer.println(tempC.getData().getPeriod());
				    	writer.println(tempC.getData().getWeight());
				    	int[] TempAG;
				    	int TempG = 0;
				    	for(int G = 0; G < 8; G++)
				    	{
				    		TempAG = tempC.getData().getGrade();	
				    		TempG = TempAG[G];
				    		writer.print(TempG + "\t");
				    	}
				    	writer.println("");
				    	tempC = tempC.getNext();
				    	}
				    tempB = tempB.getNext();
				    }
				tempA = tempA.getNext();
				}
				writer.close();
        			}
        			break;
        			case 2:
        			{
        			JOptionPane.showMessageDialog(null, AYear.toString());
        			}
        			break;
        			default:
        				change3 = true;
        		}	
        	}
        	break;
        	case 2: //editing Classes
        	{
        	String yearNameInput = JOptionPane.showInputDialog(menu13);
        	SchoolYears = AStudent.getYears();
        	AYear = new Years(yearNameInput, null);
        	Schedule = new ClassesList();
        	change4 = true;
			if(SchoolYears.findYears(AYear))
			{
				AYear = SchoolYears.getYears(AYear);
				JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
				change4 = true;
				loaded2 = true;
			}
							        	
							        	
							        	
							        	
							        	
							       /*	for (Years BYear : SchoolYears)
							        		{
							        		yearName = BYear.getYName();
							        		if(yearName.equals(yearNameInput))
							        		{
							        		AYear = BYear;
							        		JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
							        		change4 = true;
							        		loaded2 = true;
							        		}
							        		} */
        		if(!loaded2)	
        			JOptionPane.showMessageDialog(null, "School Year " + yearNameInput + " was not found");
        		String classNameInput = JOptionPane.showInputDialog(menu15);
        		AClass = new Classes(classNameInput, 0, 4.0, new int[8]);
        		change5 = true;
        		if(change4)
        		{
        		loaded4 = false;
        		Schedule = AYear.getClasses();
        		if(Schedule.findClasses(AClass))
        		{
        			AClass = Schedule.getClasses(AClass);
        			JOptionPane.showMessageDialog(null, "Class " + AClass.getCName() + " was found");
					change5 = false;
					loaded4 = true;
        		}
									        	/*	for(Classes BClase: Schedule)
									        		{
									        		className = BClase.getCName();
									        		if(className.equals(classNameInput))
									        			{
									        			AClass = BClase;
									        			JOptionPane.showMessageDialog(null, "Class " + AClass.getCName() + " was found");
									        			change5 = false;
									        			loaded4 = true;
									        			}
									        		} */
        		if(!loaded4)
        			JOptionPane.showMessageDialog(null, "Class " + classNameInput + " was not found");
        		}
        		while(!change5)
        		{
        		String manipulateClass = JOptionPane.showInputDialog(menu16);
        		int manipulateClassCase = Integer.parseInt(manipulateClass);
        		switch(manipulateClassCase)
        		{
        		case 1://remove
        		{
        		if(AYear.getClasses().remove(AClass))
        		{
        		AYear.getClasses().remove(AClass);
        		JOptionPane.showMessageDialog(null, AClass.getCName() + " was removed");
        		}
        		else
        		JOptionPane.showMessageDialog(null, AClass.getCName() + " was not found and therefore can not be removed");
        		//file writer
				PrintWriter writer = new PrintWriter("StudentArrayList.txt", "UTF-8");
				writer.println(Students.getSize()); //Number of Students
				StudentNode tempA = Students.getFirst();
				while(tempA != null)
				{
				writer.println(tempA.getData().getName());
				writer.println(tempA.getData().getYears().getSize()); //Number of School Years
				YearsNode tempB = tempA.getData().getYears().getFirst();
				while(tempB != null)
				    {
				    writer.println(tempB.getData().getYName());
				    writer.println(tempB.getData().getClasses().getSize()); //Number of Classes
				    ClassesNode tempC = tempB.getData().getClasses().getFirst();
				    while(tempC != null)
				    	{
				    	writer.println(tempC.getData().getCName());
				    	writer.println(tempC.getData().getPeriod());
				    	writer.println(tempC.getData().getWeight());
				    	int[] TempAG;
				    	int TempG = 0;
				    	for(int G = 0; G < 8; G++)
				    	{
				    		TempAG = tempC.getData().getGrade();	
				    		TempG = TempAG[G];
				    		writer.print(TempG + "\t");
				    	}
				    	writer.println("");
				    	tempC = tempC.getNext();
				    	}
				    tempB = tempB.getNext();
				    }
				tempA = tempA.getNext();
				}
				writer.close();
        		}
        		break;
        		case 2://add a class
       			{
       			JOptionPane.showMessageDialog(null, "Add a Class");

       			String classNameInputValue = JOptionPane.showInputDialog(menu5);
       			className = classNameInputValue;
       			
       			String classPeriodInputValue = JOptionPane.showInputDialog(menu6);
       			int p = Integer.parseInt(classPeriodInputValue);
       			classPeriod = p; 
       			
       			Object[] options = {"4.0", "4.5", "5.0"};
	
				double w = JOptionPane.showOptionDialog(null,
   					"Select a weight of 4.0, 4.5, or 5.0 for your class",
   					"Invalid Option",
    				JOptionPane.DEFAULT_OPTION,
   					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[2]);
       			if(w == 0)
       				w = 4.0;
       			else if(w == 1)
       				w = 4.5;
       			else
       				w = 5.0;
       			classWeight = w;
       			
       			grade = new int[8];
       			for(int x=0; x < 8; x++)
       			{
       			   String classGradeInputValue = JOptionPane.showInputDialog(menu7);
       			   int g = Integer.parseInt(classGradeInputValue);
       			   grade[x] = g;
       			}
				classGrade = grade;
       			
       			AClass = new Classes();
       			Schedule.add(new Classes(className, classPeriod, classWeight, classGrade));
       			}
				//file writer	
				PrintWriter writer = new PrintWriter("StudentArrayList.txt", "UTF-8");
				writer.println(Students.getSize()); //Number of Students
				StudentNode tempA = Students.getFirst();
				while(tempA != null)
				{
				writer.println(tempA.getData().getName());
				writer.println(tempA.getData().getYears().getSize()); //Number of School Years
				YearsNode tempB = tempA.getData().getYears().getFirst();
				while(tempB != null)
				    {
				    writer.println(tempB.getData().getYName());
				    writer.println(tempB.getData().getClasses().getSize()); //Number of Classes
				    ClassesNode tempC = tempB.getData().getClasses().getFirst();
				    while(tempC != null)
				    	{
				    	writer.println(tempC.getData().getCName());
				    	writer.println(tempC.getData().getPeriod());
				    	writer.println(tempC.getData().getWeight());
				    	int[] TempAG;
				    	int TempG = 0;
				    	for(int G = 0; G < 8; G++)
				    	{
				    	TempAG = tempC.getData().getGrade();	
				    	TempG = TempAG[G];
				    	writer.print(TempG + "\t");
				    	}
				    	writer.println("");
				    	tempC = tempC.getNext();
				    	}
				    tempB = tempB.getNext();	
				    }
				tempA = tempA.getNext();    
				}
				writer.close();
        		
        		break;
        		case 3://check class
        		{
        		grade = AClass.getGrade();
        		JOptionPane.showMessageDialog(null, "Grades in order of 1st Six Weeks, 2nd, 3rd, Exam1, 4th Six Weeks, 5th, 6th, Exam2");
        		JOptionPane.showMessageDialog(null, AClass.toString() + "Grades: " + grade[0] + "   " + grade[1] + "   " + grade[2] + "   " + grade[3] + "   " + grade[4] + "   " + grade[5] + "   " + grade[6] + "   " + grade[7]);
        		}
        		break;
        		default:
        			change5 = true;
        			
        		}
        		}
        	}
        	break;
        	case 3: //editing Grades
        	change6 = false;
        	while(!change6)
        	{
        	loaded2 = true;
        	change4 = false;
        	String yearNameInput = JOptionPane.showInputDialog(menu13);
        	SchoolYears = AStudent.getYears();
        	AYear = new Years(yearNameInput, null);
        	Schedule = new ClassesList();
        	change4 = true;
        	if(SchoolYears.findYears(AYear))
        	{
        		AYear = SchoolYears.getYears(AYear);
        		JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
				change4 = true;
				loaded2 = true;
        	}
        		if(!loaded2)	
        			JOptionPane.showMessageDialog(null, "School Year " + yearNameInput + " was not found");
        		String classNameInput = JOptionPane.showInputDialog(menu15);
        		AClass = new Classes(classNameInput, 0, 4.0, new int[8]);
        		change5 = true;
        		if(change4)
        		{
        		loaded4 = false;
        		Schedule = AYear.getClasses();
        		if(Schedule.findClasses(AClass))
        		{
        			AClass = Schedule.getClasses(AClass);
        			JOptionPane.showMessageDialog(null, "Class " + AClass.getCName() + " was found");
					change5 = false;
					loaded4 = true;
        			
        		}
        		if(!loaded4)
        			JOptionPane.showMessageDialog(null, "Class " + classNameInput + " was not found");
        		}
        		while(!change5)
        		{
        		int index = 0;
        		String manipulateSixWeeks = JOptionPane.showInputDialog(menu17);
				int manipulateSixWeeksCase = Integer.parseInt(manipulateSixWeeks);
				works2 = true;
				while(works2)
				{
				switch(manipulateSixWeeksCase)
				{
				case 1: 
				{
				index = 0;
				works2 = false;
				} 
				break;
				case 2: 
				{
				index = 1;
				works2 = false;
				} 
				break;
				case 3: 
				{
				index = 2;
				works2 = false;
				} 
				break;
				case 4: 
				{
				index = 3;
				works2 = false;
				} 
				break;
				case 5: 
				{
				index = 4;
				works2 = false;
				} 
				break;
				case 6: 
				{
				index = 5;
				works2 = false;
				} 
				break;
				case 7: 
				{
				index = 6;
				works2 = false;
				} 
				break;
				case 8: 
				{
				index = 7;
				works2 = false;
				} 
				break;
				default:
					works2 = true;
				
				
				}
				}
        		String manipulateGrade = JOptionPane.showInputDialog(menu18);
        		int manipulateGradeScore = Integer.parseInt(manipulateGrade);

				AClass.changeGrade(index, manipulateGradeScore);
				//file writer	
				PrintWriter writer = new PrintWriter("StudentArrayList.txt", "UTF-8");
				writer.println(Students.getSize()); //Number of Students
				StudentNode tempA = Students.getFirst();
				while(tempA != null)
				{
				writer.println(tempA.getData().getName());
				writer.println(tempA.getData().getYears().getSize()); //Number of School Years
				YearsNode tempB = tempA.getData().getYears().getFirst();
				while(tempB != null)
				    {
				    writer.println(tempB.getData().getYName());
				    writer.println(tempB.getData().getClasses().getSize()); //Number of Classes
				    ClassesNode tempC = tempB.getData().getClasses().getFirst();
				    while(tempC != null)
				    	{
				    	writer.println(tempC.getData().getCName());
				    	writer.println(tempC.getData().getPeriod());
				    	writer.println(tempC.getData().getWeight());
				    	int[] TempAG;
				    	int TempG = 0;
				    	for(int G = 0; G < 8; G++)
				    	{
				    	TempAG = tempC.getData().getGrade();	
				    	TempG = TempAG[G];
				    	writer.print(TempG + "\t");
				    	}
				    	writer.println("");
				    	tempC = tempC.getNext();
				    	}
				    tempB = tempB.getNext();
				    }
				tempA = tempA.getNext();
				}
				writer.close();
				
				String doneWithGrades = JOptionPane.showInputDialog(menu19);
				int doneWithGradesCase = Integer.parseInt(doneWithGrades);
        		switch(doneWithGradesCase)
        		{
        		case 1: 
				{
				change5 = false;
				}
				break;
				default: 
				{
				change5 = true;
				change6 = true;
				}
        		}
        		}
        	}
        	
        	
        	break;
        	default:
        		change2 = true;
        		
        	}
            }
        
        
        

        }//case 1 ends
        break;
        case 2: //new school year adding process
        {
        JOptionPane.showMessageDialog(null, "Create a new School Year for " + AStudent.getName());
        
 		done5 = false;
       		while(!done5)
       			{  
       			String schoolYearInputValue = JOptionPane.showInputDialog(menu3);
       			int case2 = Integer.parseInt(schoolYearInputValue);
       			switch(case2)
       			{
       			case 1:
       			Schedule = new ClassesList();
       			
       			Object[] option1 = {"Freshman", "Sophmore", "Junior", "Senior"};
	
				int y = JOptionPane.showOptionDialog(null,
   					"Select a School Year Name of Freshman, Sophmore, Junior or Senior" + "\n" + "If no year selected,the year name will defualt to Freshman",
   					"Invalid Option",
    				JOptionPane.DEFAULT_OPTION,
   					JOptionPane.QUESTION_MESSAGE,
					null,
					option1,
					option1[3]);
       			if(y == 4)
       				yearName = "Senior";
       			else if(y == 1)
       				yearName = "Sophmore";
       			else if(y == 2)
       				yearName = "Junior";
       			else
       				yearName = "Freshman";
       			//makes classes for a year
       			done6 = false;	
       			do
       			{
       			JOptionPane.showMessageDialog(null, "Add a Class");

       			String classNameInputValue = JOptionPane.showInputDialog(menu5);
       			className = classNameInputValue;
       			
       			String classPeriodInputValue = JOptionPane.showInputDialog(menu6);
       			int p = Integer.parseInt(classPeriodInputValue);
       			classPeriod = p; 
       			
       			Object[] options = {"4.0", "4.5","5.0"};
	
				double w = JOptionPane.showOptionDialog(null,
   					"Select a weight of 4.0, 4.5, or 5.0 for your class",
   					"Invalid Option",
    				JOptionPane.DEFAULT_OPTION,
   					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[2]);
       			if(w == 0)
       				w = 4.0;
       			else if(w == 1)
       				w = 4.5;
       			else
       				w = 5.0;
       			classWeight = w;
       			
       			grade = new int[8];
       			for(int x=0; x < 8; x++)
       			{
       			   String classGradeInputValue = JOptionPane.showInputDialog(menu7);
       			   int g = Integer.parseInt(classGradeInputValue);
       			   grade[x] = g;
       			}
				classGrade = grade;
       			
       			AClass = new Classes(); //can i move up to the top?
       			Schedule.add(new Classes(className, classPeriod, classWeight, classGrade));
       			
       			String classBooleanInputValue = JOptionPane.showInputDialog(menu8);
       			int b = Integer.parseInt(classBooleanInputValue);
				
				
       			if(b == 2)
       			{
       				done6 = true;
       			}
       			else
       				done6 = false;
       			
       			
       			}
       			while(!done6);
       			
       			SchoolYears = AStudent.getYears();
       			SchoolYears.add(new Years(yearName, Schedule));
				
				JOptionPane.showMessageDialog(null, "School Year Complete");

				//file writer	
				PrintWriter writer = new PrintWriter("StudentArrayList.txt", "UTF-8");
				writer.println(Students.getSize()); //Number of Students
				StudentNode tempA = Students.getFirst();
				while(tempA != null)
				{
				writer.println(tempA.getData().getName());
				writer.println(tempA.getData().getYears().getSize()); //Number of School Years
				YearsNode tempB = tempA.getData().getYears().getFirst();
				while(tempB != null)
				    {
				    writer.println(tempB.getData().getYName());
				    writer.println(tempB.getData().getClasses().getSize()); //Number of Classes
				    ClassesNode tempC = tempB.getData().getClasses().getFirst();
				    while(tempC != null)
				    	{
				    	writer.println(tempC.getData().getCName());
				    	writer.println(tempC.getData().getPeriod());
				    	writer.println(tempC.getData().getWeight());
				    	int[] TempAG;
				    	int TempG = 0;
				    	for(int G = 0; G < 8; G++)
				    	{
				    	TempAG = tempC.getData().getGrade();	
				    	TempG = TempAG[G];
				    	writer.print(TempG + "\t");
				    	}
				    	writer.println("");
				    	tempC = tempC.getNext();
				    	}
				    tempB = tempB.getNext();
				    }
				tempA = tempA.getNext();
				}
				writer.close();
				
				break;
				default:
					done5 = true;
        }//case 2
        }//switch
		
		
		
		
		}//loading student
            case 3:
        	{
        	calculated = false;
        	while(!calculated)
        	{
        	String GPACalculator = JOptionPane.showInputDialog(menu20);
        	int GPACalculatorCase = Integer.parseInt(GPACalculator);
        	switch(GPACalculatorCase)
        	{
        	case 1: //Calculate Grade Average for a Class
        	{
        	String yearNameInput = JOptionPane.showInputDialog(menu24);
        	SchoolYears = AStudent.getYears();
        	AYear = new Years(yearNameInput, null);
        	Schedule = new ClassesList();
        	change4 = true;
        	loaded2 = false;
        	if(SchoolYears.findYears(AYear))
        	{
        		AYear = SchoolYears.getYears(AYear);
        		JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
				change4 = true;
				loaded2 = true;
        	}
        		if(!loaded2)	
        			JOptionPane.showMessageDialog(null, "School Year " + yearNameInput + " was not found");
        		String classNameInput = JOptionPane.showInputDialog(menu25);
        		AClass = new Classes(classNameInput, 0, 4.0, new int[8]);
        		change5 = true;
        		if(change4)
        		{
        		loaded4 = false;
        		Schedule = AYear.getClasses();
				if(Schedule.findClasses(AClass))
				{
					AClass = Schedule.getClasses(AClass);
					JOptionPane.showMessageDialog(null, "Class " + AClass.getCName() + " was found");
					change5 = false;
					loaded4 = true;
				}							        
        		if(!loaded4)
        			JOptionPane.showMessageDialog(null, "Class " + classNameInput + " was not found");
        		while(!change5)
        		{
        		String GradeAveragesemOneTwo = JOptionPane.showInputDialog(menu21);
        		int GradeAveragesemOneTwoCase = Integer.parseInt(GradeAveragesemOneTwo);
        		switch(GradeAveragesemOneTwoCase)
        		{
        		case 1:
        		JOptionPane.showMessageDialog(null, "Grade Average for " + AClass.getCName() + ": " + AClass.getGradeAverageSemOne());
        		break;
        		case 2:
        		JOptionPane.showMessageDialog(null, "Grade Average for " + AClass.getCName() + ": " + AClass.getGradeAverageSemTwo());
        		break;
        		default:
        			change5 = true;
        		}
        		
        		
        		
        		
        		}
        	}
        	}
        	break;
        	case 2: //Calculate GPA Average for a Class
        	{
        	String yearNameInput = JOptionPane.showInputDialog(menu24);
        	SchoolYears = AStudent.getYears();
        	AYear = new Years(yearNameInput, null);
        	Schedule = new ClassesList();
        	change4 = true;
        	loaded2 = false;
        	if(SchoolYears.findYears(AYear))
        	{
        		AYear = SchoolYears.getYears(AYear);
        		JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
				change4 = true;
				loaded2 = true;
        		
        	}
        		if(!loaded2)	
        			JOptionPane.showMessageDialog(null, "School Year " + yearNameInput + " was not found");
        		String classNameInput = JOptionPane.showInputDialog(menu25);
        		AClass = new Classes(classNameInput, 0, 4.0, new int[8]);
        		change5 = true;
        		if(change4)
        		{
        		loaded4 = false;
        		Schedule = AYear.getClasses();
        		if(Schedule.findClasses(AClass))
        		{
        			AClass = Schedule.getClasses(AClass);
        			JOptionPane.showMessageDialog(null, "Class " + AClass.getCName() + " was found");
					change5 = false;
					loaded4 = true;
        		}
        		if(!loaded4)
        			JOptionPane.showMessageDialog(null, "Class " + classNameInput + " was not found");
        		while(!change5)
        		{
        		String GPAAveragesemOneTwo = JOptionPane.showInputDialog(menu22);
        		int GPAAveragesemOneTwoCase = Integer.parseInt(GPAAveragesemOneTwo);
        		switch(GPAAveragesemOneTwoCase)
        		{
        		case 1:
        		JOptionPane.showMessageDialog(null, "GPA Average for " + AClass.getCName() + ": " + AClass.getGPAAverageSemOne());
        		break;
        		case 2:
        		JOptionPane.showMessageDialog(null, "GPA Average for " + AClass.getCName() + ": " + AClass.getGPAAverageSemTwo());
        		break;
        		default:
        			change5 = true;
        		}
        		
        		
        		
        		
        		}
        	}
        	}
        	break;
        	case 3: //Calculate the GPA average for all the Classes (ArrayList of Classes)
        	{
        	String yearNameInput = JOptionPane.showInputDialog(menu24);
        	SchoolYears = AStudent.getYears();
        	AYear = new Years(yearNameInput, null);
        	Schedule = new ClassesList();
        	change4 = false;
        	loaded2 = false;
        	if(SchoolYears.findYears(AYear))
        	{
        			AYear = SchoolYears.getYears(AYear);
        			JOptionPane.showMessageDialog(null, "School Year " + AYear.getYName() + " was found");
					change4 = true;
					loaded2 = true;
        	}
        		if(!loaded2)	
        			JOptionPane.showMessageDialog(null, "School Year " + yearNameInput + " was not found");
        	while(change4)
        	{
        	String ScheduleGPAAveragesemOneTwo = JOptionPane.showInputDialog(menu23);
        	int ScheduleGPAAveragesemOneTwoCase = Integer.parseInt(ScheduleGPAAveragesemOneTwo);
        	switch(ScheduleGPAAveragesemOneTwoCase)
        	{
        	case 1:
        	JOptionPane.showMessageDialog(null, "GPA Average for Schedule: " + AYear.getScheduleTotalGPAForSemOne());
        	break;
        	case 2:
        	JOptionPane.showMessageDialog(null, "GPA Average for Schedule: " + AYear.getScheduleTotalGPAForSemTwo());
        	break;
        	default:
        		change4 = false;
        	}
        	}
        	}
        	break;
        	case 4: //Calculate the GPA average for the Student
        	{
        	JOptionPane.showMessageDialog(null, AStudent.getName() +" has a total GPA of: " + AStudent.getStudentGPAAverage());
        	}
        	break;
        	default:
        	calculated = true;
        	}
        	}
        	}
        	break;
        	default:
        	done4 = true;
        }	
        }
		}
		break;
       case 2:
       	   {
			AStudent = new Student();
			SchoolYears = new YearsList();
       	   	JOptionPane.showMessageDialog(null, "Welcome to GPA Calculator!");

       		String studentNameInputValue = JOptionPane.showInputDialog(menu2);
       		studentName = studentNameInputValue;
       		
       		done2 = false;
       		while(!done2) //creating student's year
       			{  
       			String schoolYearInputValue = JOptionPane.showInputDialog(menu3);
       			int case2 = Integer.parseInt(schoolYearInputValue);
       			switch(case2)
       			{
       			case 1:
       			Schedule = new ClassesList();
       			
       			Object[] option1 = {"Freshman", "Sophmore", "Junior", "Senior"};
	
				int y = JOptionPane.showOptionDialog(null,
   					"Select a School Year Name of Freshman, Sophmore, Junior or Senior" + "\n" + "If no year selected,the year name will defualt to Freshman",
   					"Invalid Option",
    				JOptionPane.DEFAULT_OPTION,
   					JOptionPane.QUESTION_MESSAGE,
					null,
					option1,
					option1[3]);
       			if(y == 4)
       				yearName = "Senior";
       			else if(y == 1)
       				yearName = "Sophmore";
       			else if(y == 2)
       				yearName = "Junior";
       			else
       				yearName = "Freshman";
       			//makes classes for a year
       			done3 = false;	
       			do //creating student's classes
       			{
       			JOptionPane.showMessageDialog(null, "Add a Class");
				
				String classNameInputValue = JOptionPane.showInputDialog(menu5);
       			works = false;
       			do
       			{
       			if(classNameInputValue != null)
       			{
       			works = true;
       			}
       			}
       			while(!works);
       			className = classNameInputValue;
       			
       			String classPeriodInputValue = JOptionPane.showInputDialog(menu6);
       			int p = Integer.parseInt(classPeriodInputValue);
       			classPeriod = p; 
       			
       			Object[] options = {"4.0", "4.5","5.0"};
	
				double w = JOptionPane.showOptionDialog(null,
   					"Select a weight of 4.0, 4.5, or 5.0 for your class",
   					"Invalid Option",
    				JOptionPane.DEFAULT_OPTION,
   					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[2]);
       			if(w == 0)
       				w = 4.0;
       			else if(w == 1)
       				w = 4.5;
       			else
       				w = 5.0;
       			classWeight = w;
       			
       			grade = new int[8];
       			for(int x = 0; x < 8; x++)
       			{
       			   String classGradeInputValue = JOptionPane.showInputDialog(menu7);
       			   int g = Integer.parseInt(classGradeInputValue);
       			   grade[x] = g;
       			}
				classGrade = grade;
       			
       			AClass = new Classes();
       			Schedule.add(new Classes(className, classPeriod, classWeight, classGrade));
       			
       			String classBooleanInputValue = JOptionPane.showInputDialog(menu8);
       			int b = Integer.parseInt(classBooleanInputValue);
				
				
       			if(b == 2)
       			{
       				done3 = true;
       			}
       			else
       				done3 = false;
       			
       			
       			}
       			while(!done3);
       			SchoolYears.add(new Years(yearName, Schedule));

       			

       			JOptionPane.showMessageDialog(null, "School Year Complete");

       			break;
       			case 2: done2 = true;
       			break;
       			default: JOptionPane.showMessageDialog(null, "Invalid Input");
       			}
       			

       			
       			
       			
       			
       			
       			}
       		    Students.add(new Student(studentName, SchoolYears));
       		    
				//file writer	
				PrintWriter writer = new PrintWriter("StudentArrayList.txt", "UTF-8");
				writer.println(Students.getSize()); //Number of Students
				StudentNode tempA = Students.getFirst();
				while(tempA != null)
				{
				writer.println(tempA.getData().getName());
				writer.println(tempA.getData().getYears().getSize()); //Number of School Years
				YearsNode tempB = tempA.getData().getYears().getFirst();
				while(tempB != null)
				    {
				    writer.println(tempB.getData().getYName());
				    writer.println(tempB.getData().getClasses().getSize()); //Number of Classes
				    ClassesNode tempC = tempB.getData().getClasses().getFirst();
				    while(tempC != null)
				    	{
				    	writer.println(tempC.getData().getCName());
				    	writer.println(tempC.getData().getPeriod());
				    	writer.println(tempC.getData().getWeight());
				    	int[] TempAG;
				    	int TempG = 0;
				    	for(int G = 0; G < 8; G++)
				    	{
				    	TempAG = tempC.getData().getGrade();	
				    	TempG = TempAG[G];
				    	writer.print(TempG + "\t");
				    	}
				    	writer.println("");
				    	tempC = tempC.getNext();
				    	}
				    tempB = tempB.getNext();
				    }
				tempA = tempA.getNext();
				}
				writer.close();
       			}
       	break;
       	case 3: done = true;
       	break;
       	default: JOptionPane.showMessageDialog(null, "Invalid option");
	   }
       
    
    
    
    
    
    
    
    
       	}

	   }
    }



