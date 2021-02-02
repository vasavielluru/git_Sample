import java.util.Scanner;

public class UsingConstructors {

	public static void main(String[] args) {
		
		  
		        // Declaring an array of student 
		        Student[] arr; 
		        Scanner obj=new Scanner(System.in);
		        // Allocating memory for 2 objects 
		        // of type student 
		        arr = new Student[2]; 
		  
		        // Initializing the first element 
		        // of the array 
		        int index=0;
		        for(int i=0;i<2;i++)
		        {
		        	int id=obj.nextInt();
		        	String name=obj.next();
		        	String[] names= {"cat", "ball", "dog"};
		        	arr[index++]= new Student(id,name,names);
		        }
		  
		        // Displaying the student data 
		        System.out.println( 
		            "Student data in student arr 0: "); 
		        arr[0].display(); 
		  
		        System.out.println( 
		            "Student data in student arr 1: "); 
		        arr[1].display(); 
		    } 
		} 
		  
		// Creating a student class with 
		// id and name as a attributes 
		class Student { 
		  
		    public int id; 
		    public String name; 
		    public String[] Names;
		  
		    // Student class constructor 
		    Student(int id, String name,String[] names) 
		    { 
		        this.id = id; 
		        this.name = name; 
		        this.Names=names;
		    } 
		  
		    // display() method to display 
		    // the student data 
		    public void display() 
		    { 
		        System.out.println("Student id is: " + id + " "
		                           + "and Student name is: "
		                           + name); 
		        System.out.println(); 
		        for(int i=0;i<Names.length;i++)
		        	System.out.println(Names[i]);
		    } 
		}

	


