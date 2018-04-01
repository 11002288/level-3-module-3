package interfaces;

public class BackwardsString extends SpecialString{
	
	public BackwardsString(String s) {
		
		super(s);
	

		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String out = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
		out= out+s.charAt(i);
		}
		
		return out;
	}

	
}
