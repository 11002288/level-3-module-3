package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder str = new StringBuilder(s);
		for(int i=0; i<s.length(); i+=2) {
			str.setCharAt(i, str.substring(i,i+1).toLowerCase().charAt(0));
		}
		for(int i=1;i<s.length(); i+=2) {
			str.setCharAt(i, str.substring(i,i+1).toUpperCase().charAt(0));
		}
		return str.toString();
	}

}
