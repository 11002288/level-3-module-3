package abstract_classes.farm;
import java.util.ArrayList;

public class Farm {
		public static void main(String[] args) {
			ArrayList<Animal> farm = new ArrayList<Animal>();
			Animal a1 = new Cat();
			Animal a2 = new Dog();
			Animal a3 = new Misc();
			Animal a4 = new Turtle();
			Animal a5 = new Misc();
			Animal a6 = new Cat();
			farm.add(a1);
			farm.add(a2);
			farm.add(a3);
			farm.add(a4);
			farm.add(a5);
			farm.add(a6);
			for(int i = 0; i<farm.size();i++) {
				farm.get(i).makeNoise();
			}
		}
}
