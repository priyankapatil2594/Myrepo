package homework_method_calling;

public class Area_i {
	public static void main(String[] args) {
     
   Rectangular a= new Rectangular();
   int x=a.calculate_area(10,10);
		
	Square s= new Square();
	int y=s.calculate_area(10);
	
	
	Circle c= new Circle();
	double z= c.calculate_area(10);
	
	System.out.println("area of rectangular is "+ x);
	System.out.println("area of square is "+ y);
	System.out.println("area of circle is "+ z);
			
	}

}
