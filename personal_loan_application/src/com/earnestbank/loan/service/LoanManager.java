package com.earnestbank.loan.service;

import com.earnestbank.loan.domain.Customer;

public class LoanManager {
    public boolean processLoan(Customer customer){
        LoanApprovalManager loanApprover=LoanApprovalManager.getInstance();
        return loanApprover.approveLoan(customer);
    }
}
