import java.util.ArrayList;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Circle c = new Circle();
		ArrayList<Integer> arr = new ArrayList<>();
		String ans = "y";
		
		do {
			double rad = Validator.getDouble(scnr, "Enter radius: ", 0, Double.MAX_VALUE);
			c.circle(rad);
			System.out.println("Circumference: " + c.getForCir());
			System.out.println("Area: " + c.getForArea());
			arr.add(1);
			
			ans = Validator.getString(scnr, "Would you like to continue? y/n ");
		} while (ans.equalsIgnoreCase("y"));
		
		System.out.println();
		System.out.println("Congratulations! You made " + arr.size() + " circles! Goodbye.");
		
		
		
	}

}
