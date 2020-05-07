public class ArithProgression extends Progression {
	
	protected long increment;
	
	ArithProgression() {
		this(1);
	}
	
	ArithProgression(long inc){
		increment = inc;
	}
	
	protected long nextValue() {
		current += increment;
		return current;
	}
}
