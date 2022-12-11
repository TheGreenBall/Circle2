
public class CircleRunner {

	public static void main(String[] args) {
		//Test greeting by uncommenting
		Circle.greeting();

		//Test menu. Should return menu choice.
		//Check right and wrong input
		System.out.println(Circle.menu());

		//Test getRadius. Should return positive radius only
		System.out.println(Circle.getRadius());

		//Test calculateCircumference. Try different values
		System.out.println(Circle.calculateCircumference(3.45));

		//Test calculateArea. Try different values
		System.out.println(Circle.calculateArea(56));

		//Test output. Try different values
		Circle.output(4.5,"C");

		//Test repeat. Check right and wrong input
		System.out.println(Circle.repeat());
	}
}
