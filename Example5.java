package homework_method_calling;
// write a character type array in one instatace method and in main method print this array in reverse direction
// 1. char array pahije 
// 2. in instantaneous method
// 3. print this array in main method ; in reverse direction.
public class Example5 {
	
	char[]method_alpha() {
	char[]alphabet= {'A', 'B','C', 'D'};
	return alphabet;
	}
	
	public static void main(String[] args) {
		Example5 Alpha=new Example5();
		 char []  main_array =Alpha.method_alpha();
		 
		
		//System.out.println(main_array[3] + " " +main_array[2]+ " " + main_array[1]);
		//System.out.println(main_array[3]);
		//System.out.println(main_array[2]);
		//System.out.println(main_array[1]);
		//System.out.println(main_array[0]);
		//int i = main_array.length;
		for(int i=3; i>=0; i--) {
			System.out.println(main_array[i]);
		}
				
	}
	
		   
}
	   


