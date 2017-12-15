package abstract_classes.cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		double taxes = this.population*this.growthRate;
		taxes = taxes*0.5*this.growthRate;
		return taxes;
	}

}
