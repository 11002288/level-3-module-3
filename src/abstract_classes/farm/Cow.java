package abstract_classes.farm;

public class Cow extends Animal{

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Mooo");
	}

	@Override
	void die() {
		// TODO Auto-generated method stub
		System.out.println("oof");
	}

}
