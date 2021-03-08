package homework_method_calling;

public class Sq_result {
	
	public static void main(String[] args) {
		
		Square A=new Square();
		
	
		
		int x= A.calculate_area(10);
		
		int y=Square.calculate_peri(10);
		
		System.out.println("area is " + x);
		
		System.out.println("peri is " + y);
		
		
	}

}
