package abstract_classes.farm;

import java.util.ArrayList;

public abstract class Fram extends Animal{
public static void main(String[] args) {
	
	
	ArrayList<Animal> Farm = new ArrayList<Animal>();
	Animal doge = new Dog();
	Animal bull = new Cow();
	Animal Tortoise = new Turtle();
	Animal Pig = new Pork();
	
Farm.add(doge);
Farm.add(bull);
Farm.add(Tortoise);
Farm.add(Pig);
for (int i = 0; i < 1; i++) {
	doge.makeNoise();
	bull.makeNoise();
	Tortoise.makeNoise();
	Pig.makeNoise();
	doge.die();
	bull.die();
	Tortoise.die();
	Pig.die();
}


}
}
