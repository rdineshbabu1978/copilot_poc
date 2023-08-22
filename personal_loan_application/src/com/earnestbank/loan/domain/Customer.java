package com.earnestbank.loan.domain;

public class Customer {
    private String customerId;
    private String customerName;
    private int age;
    private String gender;
    private LoanApplication loanApplication;
    public Customer() {
    }

    public Customer(String customerId, String customerName, int age, String gender, LoanApplication loanApplication) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.gender = gender;
        this.loanApplication = loanApplication;
    }

    public String getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

     public String getGender() {
        return gender;
    }

     public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    }







