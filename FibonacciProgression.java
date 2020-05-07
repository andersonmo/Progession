public class FibonacciProgression extends Progression{
	
	protected long anterior;
	
	FibonacciProgression() {
		this(0,1);
	}
	
	FibonacciProgression(long value1, long value2){
		first = value1;
		anterior = value2 - value1;
	}
	
	protected long nextValue() {
		long temp = anterior;
		anterior = current;
		current += temp;
		return current;
	}

}
