package homework_method_calling;
//Get one string array in return from a static method and print this array in main method.

//char array reverse direction 

public class Example2 {
	     
	   public static String[] name() {
		   
		  String[] friends = {"priyanka","candy", "murali","akshay"};
		  
		  return friends;
				  
	  }
	   
	   public static void main(String[] args) {
		   
		   for(int i=0; i<Example2.name().length; i++)	{
			   
		  System.out.print(Example2.name()[i]+ " ");
		
	}
		   
}
	   
}