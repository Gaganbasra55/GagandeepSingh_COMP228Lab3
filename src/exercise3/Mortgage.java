package exercise3;

public abstract class Mortgage implements MortgageConstants {

    private int mortgageNumber;
    private String customerName;
    private double mortgageAmount;
    private double interestRate;
    private int term;
    private String termName; // String value for terms

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) { //Constructor

        if(mortgageAmount > MortgageConstants.maxMortgageAmount) //Validating mortgage amount against maximum amount
            throw new IllegalArgumentException("You have exceeded the maximum amount for a mortgage");

        if(mortgageAmount < 0) //Validating mortgage amount so it cannot be negative
            throw new IllegalArgumentException("The mortgage amount cannot be negative");

        if(interestRate < 0) //Validating interest rate so it cannot be negative
            throw new IllegalArgumentException("The interest rate cannot be negative");

        //Assigning values to instance variables

        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;
        this.interestRate = (interestRate)/100;


        //Getter and Setters

        public String getTermName() {
            return termName;
        }

        public int getMortgageNumber() {
            return mortgageNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public double getMortgageAmount() {
            return mortgageAmount;
        }

        public int getTerm() {
            return term;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

