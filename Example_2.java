package homework_method_calling;

public class Example_2 {
	
	   static String[] college()  {
		   String[] sanjeevan = {"FE","SE","TE","BE"};
		   
		   return sanjeevan;
		   
		   
	   }

	    public static void main(String[] args) {
	    	
	    	for(int i=0;i<=3;i++)
	    		
	    		System.out.println(Example_2.college()[i]);
	    			
			
		}
}
