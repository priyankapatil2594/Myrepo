package homework_method_calling;

public class Rec_result {

	public static void main(String[]args) {
		
		Rectangular cal= new Rectangular();
		
		int x= cal.calculate_area(10, 10);
		 
		int y= Rectangular.calculate_peri(11,12); 
		
		System.out.println("area is " + x);
		
		System.out.println("peri is " + y);
		
		
		
		
		
		}

		
		
			
}
