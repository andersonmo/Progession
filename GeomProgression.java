public class GeomProgression extends Progression {
	
	protected long base;
	
	GeomProgression() {
		this(2);
	}
	
	GeomProgression(long b){
		base = b;
		first = 1;
		current = first;
	}
	
	protected long nextValue() {
		current *= base;
		return current;
	}

}
