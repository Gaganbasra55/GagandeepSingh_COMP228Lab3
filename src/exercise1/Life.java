package exercise1;

public class Life extends Insurance {

	public Life(String typeOfInsurance, double monthlyCost) { // Constructor
		super(typeOfInsurance, monthlyCost); // Super class constructor

		//this.monthlyCost = monthlyCost ;

	}


	@Override
	public void setInsuranceCost(double newCost) {

		if (newCost <= 0.0)
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");

		this.monthlyCost = newCost+monthlyCost;

	}

	//Overridden method displayInfo that returns a formatted string
	
	@Override
	public String displayInfo() {

		return String.format("%s: %s%n%n%s: %.2f%n", "Insurance Type", super.getTypeOfInsurance(),
				"Monthly Cost", super.getMonthlyCost());

	}

}
