package exercise1;

public class Health extends Insurance {

	public Health(String typeOfInsurance, double monthlyCost) {

		super(typeOfInsurance, monthlyCost); // Super class constructor
		
		this.monthlyCost =monthlyCost;

																				
	}

	//Overridden method setInsuranceMethod
	
	@Override
	public void setInsuranceCost(double newCost) {

		if (newCost <= 0.0)
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");

		this.monthlyCost = newCost+monthlyCost;
		//Modifying protected variable monthlyCost

	}

	//Overridden method displayInfo that returns a formatted string
	
	@Override
	public String displayInfo() {

		return String.format("%s: %s%n%n%s: %.2f", "Insurance Type", super.getTypeOfInsurance(), "Monthly Cost",
				super.getMonthlyCost());

	}

}
