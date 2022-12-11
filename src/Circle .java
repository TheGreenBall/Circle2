import javax.swing.*;

class Circle {
	public static void main( String args[] )
	{
		String choice;
		double 	radius = 0,
				answer = 0;

		greeting();

		do
		{
			choice=menu();
			radius=getRadius();
			if( choice.equalsIgnoreCase("A") )
				answer=calculateArea(radius);
			else
				answer=calculateCircumference(radius);
			output(answer,choice);

		}while( repeat() );

	}

	//Area = pi * r2                             Circumference =  2 * pi * r

	//where r is the radius of the circle. You should use the Math class value of PI and for the squaring of the radius.
	//You are going to be given main. You are NOT, repeat NOT allowed to change main in any way. You are going to need to write multiple method definitions.
	// Here is a list:

	////Precondition-None
	//
	////Postcondition-None
	//
	//greeting      Print out what program is doing

	public static void greeting() {

		System.out.println(" I print the Area and Circumference of a circle, THAT'S IT!!!");

	}



	////Precondition-None
	//
	////Postcondition-Returns only “A”,”a” or “C”,”c”
	//
	//menu          Asks the user if they want to calculate the area or the circumference of the circle.


	static String menu() {

		String Mean;



			Mean = JOptionPane.showInputDialog("A FOR AREA C FOR CIRCUMFERENCE");


		if (Mean != "A" || Mean != "a" || Mean != "C" || Mean != "c") {
			return Mean;
		}
		else {
			return "A";
		}



	}


	////Precondition-None
	//
	////Postcondition-Return a valid double representing the radius
	//
	//getRadius    Asks the user to enter a valid radius.

	public static double getRadius() {

		double pineapple;

		String rad = JOptionPane.showInputDialog(" Please enter a double");

		pineapple = Double.parseDouble(rad);

		if (pineapple <= 0) {
			return 1.1;
		}

		return pineapple;
	}



	////Precondition-Sent a valid double for radius
	// Circumference =  2 * pi * r
	////Postcondition-Return a valid double for circumference
	//
	//calculateCircumference      Takes the radius and returns the correct value of the circumference

	public static double calculateCircumference(double a) {

		double circumference = 2 * Math.PI * a;

		return circumference;

	}

	////Precondition-Sent a valid double for radius
	//
	////Postcondition-Return a valid double for area
	// Area = pi * r2
	//calculateArea     Takes the radius and returns the correct value of the area

	public static double calculateArea (double a) {


		double area = Math.PI * a;

		return area;


	}

	////Precondition-Sent a valid double, representing the area or circumference and String, representing A or C
	//
	////Postcondition-Prints out to the screen the answer
	//
	//output     Outputs the result of the calculations as to whether the user wanted the area or circumference

	public static void output(double a, String b) {







//
//		if (b != "A" || b != "a" || b != "C" || b != "c") {
//			b = b;
//		}
//		else {
//			b = "A";
//		}
//
//		if (b != "A" || b != "a") {
//
//			double r = calculateArea(a);
//
//		}
//
//		if (b != "C" || b != "c") {
//
//			double p = calculateCircumference(a);
//
//		}

		System.out.println(b + " equals " + a);


	}

	////Precondition-None
	//
	////Postcondition-Returns either true or false
	//
	//repeat();     Asks the user whether or not they want to repeat the program.
	 static boolean repeat() {

		 Boolean A;
		 String Again;

		 do {

			 Again = JOptionPane.showInputDialog("Play again? T Or F");


		 } while (!(Again.equalsIgnoreCase("T")) || !(Again.equalsIgnoreCase("F")));

		 if (Again.equalsIgnoreCase("T")) {
			 return true;
		 } else {
			 return false;
		 }
	 }

}