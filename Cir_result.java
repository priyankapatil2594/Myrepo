package homework_method_calling;

public class Cir_result {
	
	public static void main(String[] args) {
		
		Circle circle= new Circle();
		
		double A= circle.calculate_area(10);
		double B= circle.calculate_peri(10);
		
		System.out.println("area is " +A);
		
		System.out.println("peri is " +B);
		
		
				
				
		
	}

}
