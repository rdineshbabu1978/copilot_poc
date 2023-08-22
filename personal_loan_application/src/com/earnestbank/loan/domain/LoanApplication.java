package com.earnestbank.loan.domain;

public class LoanApplication {

    private String applicationId;
    private double loanAmountinLacs;
    private float tenureInYears;
    private float creditScore;

    public LoanApplication() {
    }


    public LoanApplication(String applicationId, double loanAmountinLacs, float tenureInYears, float creditScore) {
        this.applicationId = applicationId;
        this.loanAmountinLacs = loanAmountinLacs;
        this.tenureInYears = tenureInYears;
        this.creditScore = creditScore;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public double getLoanAmountinLacs() {
        return loanAmountinLacs;
    }

     public float getTenureInYears() {
        return tenureInYears;
    }
    public float getCreditScore() {
        return creditScore;
    }

}
