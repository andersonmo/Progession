
public class TestProgression {

	public static void main(String[] args) {
		Progression prog;
		
		System.out.println("Arithmetic Progression with default increment: ");
		prog = new ArithProgression();
		prog.printProgression(10);
		
		System.out.println("Arithmetic Progression with increment 5: ");
		prog = new ArithProgression(5);
		prog.printProgression(10);
		
		System.out.println("Geometric Progression with default base:");
		prog = new GeomProgression();
		prog.printProgression(10);
		
		System.out.println("Geometric Progression with base 3:");
		prog = new GeomProgression(3);
		prog.printProgression(10);
		
		System.out.println("Fibonnaci Progression with default values:");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		
		System.out.println("Fibonnaci Progression with starts values 4 and 6:");
		prog = new FibonacciProgression(4,6);
		prog.printProgression(10);


	}

}
