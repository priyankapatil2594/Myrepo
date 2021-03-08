package homework_method_calling;

public class Example4 {
	public static String[] star() {
		   
		  String[] stars = {"*****","****", "***","**", "*"};
		  
		  return stars;
				  
	  }
	   
	   public static void main(String[] args) {
		   
		   for(int i=0; i<Example4.star().length; i++)	{
			   
		  System.out.println(Example4.star()[i]);
		
	}
		   
}
	   
}


