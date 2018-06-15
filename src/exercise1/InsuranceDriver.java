package exercise1;

import javax.swing.JOptionPane;

public class InsuranceDriver {

	public static void main(String[] args) {
        //Insurance array
        Insurance[] insuranceArray = new Insurance[3];

        //Control variable
        int control = 0;

        //introduction

        JOptionPane.showMessageDialog(null,
                "Creating " + insuranceArray.length + " objects of type Insurance!", "Welcome!", 1);

        //Loop through array to create objects

        while (control < insuranceArray.length) {

            try {
                //Getting values from user

                String typeOfInsurance = JOptionPane.showInputDialog("Enter the insurance type: Health or Life");
                double monthlyCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the Monthly Cost"));

                try {
                    //Type of insurance Health

                    if (typeOfInsurance.toLowerCase().equals("health")) {
                        Health healthInsurance = new Health(typeOfInsurance, monthlyCost); //Creating health object
                        insuranceArray[control] = healthInsurance;
                        control++;
                    }
                    else {
                        //Type of insurance Life

                        if (typeOfInsurance.toLowerCase().equals("life")) {
                            Life lifeInsurance = new Life(typeOfInsurance, monthlyCost); //Creating life object
                            insuranceArray[control] = lifeInsurance;
                            control++;
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Type of insurance unknown by the system! Try again");
                    }
                }
                catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You must enter a valid number!", "Error", 0);
            }
        }

        //Custom messages
        JOptionPane.showMessageDialog(null,
                "Objects created! Now, you will set a new monthly cost for each object and they will be displayed in a polymorphic way",
                "Information", 1);

        //Loop through array set new monthly cost
        for (int i = 0; i < insuranceArray.length;) {

            try {
                double newCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the new Monthly Cost for insurance " + (i + 1)
                        + " of type: " + insuranceArray[i].getTypeOfInsurance().toUpperCase()));
                try {
                     //Setting the new cost
                    insuranceArray[i].setInsuranceCost(newCost);
                    JOptionPane.showMessageDialog(null, "Monthly Cost successfully changed!", "Information", 1);										i++;

                }
                catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
                }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You must enter a valid number for the new cost!", "Error", 0);
            }
        }

        //Loop through array to display information

        int i = 1;

        for(Insurance insuranceItem : insuranceArray){

            JOptionPane.showMessageDialog(null, "Insurance object: "+i+"\n"+insuranceItem.displayInfo(), "Display Information", 1);
            i++;
        }

    }

}