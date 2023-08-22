import com.earnestbank.loan.service.LoanManager;
import com.earnestbank.loan.domain.Customer;
import com.earnestbank.loan.domain.LoanApplication;

public class Main {
    public static void main(String[] args) {

        /*Build LoanApplication*/
        LoanApplication loanApplication = new LoanApplication("LA123", 500000, 20, 8.5f);


        /*Build Customer*/
        Customer customer = new Customer("C456", "John Doe", 35, "Male", loanApplication);





        /*Call processLoan() method of LoanManager passing Customer object*/
          LoanManager loanManager = new LoanManager();
          boolean approvalResult=loanManager.processLoan(customer);

        /*Print out loan application result: Approved/Unapproved */
        if(approvalResult)
            System.out.println("Congratulations! Your loan application has been approved");
        else
            System.out.println("Sorry! Your loan application has been rejected");

    }
}