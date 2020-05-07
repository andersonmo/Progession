public class Progression {

	protected long first;
	protected long current;
	
	Progression(){
		current = first = 0;
	}
	
	protected long firstValue() {
		current = first;
		return current;
	}
	
	protected long nextValue() {
		return ++current;
	}
	
	public void printProgression(int n) {
		System.out.print(firstValue());
		for (int i=2; i<= n; i++) {
			System.out.print(" "+ nextValue());
		}
		System.out.println();
	}
	
}
