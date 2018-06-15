package exercise1;

import javax.swing.JOptionPane;

public class InsuranceDriver {

	public static void main(String[] args) {

		Insurance[] insuranceArray = new Insurance[3]; //Insurance array
		int control = 0; //Control variable

		//introduction

		JOptionPane.showMessageDialog(null,
				"Creating " + insuranceArray.length + " objects of type Insurance!", "Welcome!", 1);

		//Loop through array to create objects

		while (control < insuranceArray.length) {


			//Try and catch blocks are used to validate inputs
			try {
				//Getting values from end user

				String typeOfInsurance = JOptionPane.showInputDialog("Enter the type of the insurance: Health or Life");
				double monthlyCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the Monthly Cost"));

				//Try and catch blocks are used to validate inputs
				try {
					//Type of insurance Health

					if (typeOfInsurance.toLowerCase().equals("health")) {
						Health healthInsurance = new Health(typeOfInsurance, monthlyCost); //Creating health object
						insuranceArray[control] = healthInsurance;
						control++;
					} else
						JOptionPane.showMessageDialog(null, "Type of insurance unknown by the system! Try again");
				}
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
			}
		}
		try {
			//Try and catch blocks are used to validate inputs

			double newCost = Double
					.parseDouble(JOptionPane.showInputDialog("Enter the new Monthly Cost for insurance " + (i + 1)
							+ " of type: " + insuranceArray[i].getTypeOfInsurance().toUpperCase()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You must enter a valid number for the new cost!", "Error", 0);
		}
	}