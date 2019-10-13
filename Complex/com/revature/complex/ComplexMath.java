import ComplexNumber;

public class ComplexMath{

	public static void main(String[] args) {
		ComplexNumber a = new ComplexNumber(5, 2);
		ComplexNumber b = new ComplexNumber(9, 8);

		ComplexNumber c = a.plus(b);
		ComplexNumber d = a.minus(b);

		System.out.println(a.printout() + " + " + b.printout() + " = " + c.printout());
		System.out.println(a.printout() + " - " + b.printout() +  " = " + d.printout());
	}

}