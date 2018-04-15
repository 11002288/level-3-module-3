package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = s;
	}
	
	public String toString() {
		return funkifyText();
	}

	
}