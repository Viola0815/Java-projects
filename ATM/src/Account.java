public class Account {
 //初始化成员变量，account类中包含：
    private String CustomerName;
    private String CustomerGender;
    private String AccountNumber;
    private int Password;
    private double AccountBalance;
    private double WithdrawalLitmits;
    
    


    public Account(){
        
    }
    
    
    // public Account(String customerName, String customerGender, String accountNumber, double accountBalance,double withdrawalLitmits,int password) {
    //     CustomerName = customerName;
    //     CustomerGender = customerGender;
    //     AccountNumber = accountNumber;
    //     AccountBalance = accountBalance;
    //     WithdrawalLitmits=withdrawalLitmits;
    //     Password=password;
    // }
    public String getCustomerName() {
        return (CustomerGender.equals("F")? "Miss":"Mr")+" "+ CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public String getCustomerGender() {
        return (CustomerGender.equals("F")?"Miss":"Mr")+" "+CustomerGender;
    }
    public void setCustomerGender(String customerGender) {
        CustomerGender = customerGender;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }
    public double getAccountBalance() {
        return AccountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }
    public double getWithdrawalLitmits() {
        return WithdrawalLitmits;
    }
    public void setWithdrawalLitmits(double withdrawalLitmits) {
        WithdrawalLitmits = withdrawalLitmits;
    }
    public int getPassword() {
        return Password;
    }
   public void setPassword(int password) {
        Password = password;
    }

  
}
