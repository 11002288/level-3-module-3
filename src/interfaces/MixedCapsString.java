package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String in = "";
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			
		if (i%2==0) {
			in = in+s.substring(i, i+1).toLowerCase();
			}else {
			in = in+s.substring(i, i+1).toUpperCase();
			}

		}
		return in;
	}

}
