package project1aaa;

public class Computer {
	
	String name;
	int id;
	static String unvName="LIU";
	
	 public Computer(String name,int id) {
		
		this.name=name;
		this.id=id;
		
System.out.println(name + id);
	}
	 public void stdinfo() {
		 System.out.println("st univer is" +unvName);
	 }
	 public static void first(){
	System.out.println("This is called static method" );	 
		 
		 
	 }
	 }
	

