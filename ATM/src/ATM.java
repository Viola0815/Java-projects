import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM{
    private ArrayList<Account> accounts= new ArrayList<>();//负责存储Account的信息
    private Account loginAccount;//记录登陆后的用户账户
    private Account payee;
    private Account payer;
 
//开户功能
    private void openAccount(){
        Account account= new Account();
//用户输入名字
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String customerName=sc.nextLine();
        account.setCustomerName(customerName);
//用户输入性别
        while(true){
        System.out.println("Enter your gender:M/F");
        String customerGender=sc.nextLine();
        if(customerGender.equalsIgnoreCase("M")||customerGender.equalsIgnoreCase("F")){
        account.setCustomerGender(customerGender);
        break;
        }else{
            System.out.println("please enter a valid gender");
        }
    }
        
//得到randomly 9位数的卡号,并且不重复        
         String customerAccountNumber="" ;
        while(true){
       
        Random r= new Random();
        for (int i = 0; i < 8; i++) {
            int nums=r.nextInt(10);
            customerAccountNumber+=nums;

        }
        Account acc=getAccountNumberByAccount(customerAccountNumber);
        if(acc==null){
            account.setAccountNumber(customerAccountNumber);
            break;
        }
        }


//让用户设置密码
         while (true) {
        System.out.println("please set your password for your account");
        int userInput= sc.nextInt();
        //account.setPassword(userInput);
//第二次确认密码
       
        System.out.println("please enter your password one more time");
        int userIpt=sc.nextInt();
        if(userInput==userIpt){
            account.setPassword(userIpt);
            break;
        }else{
            System.out.println("the password you put is not the same as the first one you entered");
        }
    }
//让用户设置取现额度
        while(true){
        System.out.println("please set your daily withdrawal limits");
        int userInput1=sc.nextInt();
        if(userInput1>0){
        account.setWithdrawalLitmits(userInput1);
            break;
        }else{
            System.out.println("the daily withdrawal limits have to be bigger than 0");
        }
    }

        accounts.add(account);
        System.out.println("Dear "+account.getCustomerName()+":");
        System.out.println("You have successfully opened up an account from our bank, your account number is :"+ account.getAccountNumber()+".");
        System.out.println("Your password is :"+account.getPassword()+".");
        System.out.println("Your current balance on your account is "+ account.getAccountBalance());
        System.out.println("Your daily withdrawal limits is :"+account.getWithdrawalLitmits()+".");
      
    }


//查找卡号返回对象
    private Account getAccountNumberByAccount(String AccNum){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if(acc.getAccountNumber().equals(AccNum)){
                return acc;
            }   
        }
        return null;

    }

//通过accounts查找密码
    private Account geAccountPasswordByAccount(int password){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if(acc.getPassword()==password){
                return acc;
            }
            
        }
        return null;
    }

    //登录以及登录后操作功能

    private void loginFunction(){
        Scanner sc= new Scanner(System.in);
        System.out.println("---login site---");
        if(accounts.size()==0){
            System.out.println("there is no accounts under our system so far,please open up an account from our bank first");
            return;
        }
        while (true) {
        System.out.println("please enter your account number");
        String data=sc.next();
        Account acc=getAccountNumberByAccount(data);
        if(acc==null){
            System.out.println("the number you entered is not existing,please try again");
        }else{
            System.out.println("enter your password:");
            int passwordData=sc.nextInt();
            Account accPassword=geAccountPasswordByAccount(passwordData);
            if(accPassword==null){
                System.out.println("your password is not matching");
            }else{
                System.out.println("Dear "+acc.getCustomerName()+" you have successfully logged into your account");
                loginAccount=acc;
                AfterloginCommand();
                return;
                
            }
        }
    }
}

    private void AfterloginCommand(){
        while(true){
        Scanner sc= new Scanner(System.in);
        System.out.println(loginAccount.getCustomerName()+"---You can select services below---");
        System.out.println("1.Inquire");
        System.out.println("2.Deposit");
        System.out.println("3.Withdrawal");
        System.out.println("4.Transfer");
        System.out.println("5.Password change");
        System.out.println("6.Exit");
        System.out.println("7.Cancel account");
        int command=sc.nextInt();
        switch (command) {
            case 1:
                Inquire();
                break;
            case 2:
                Deposit();
                break;
            case 3:
                Withdrawal();
                break;

            case 4:
                Transfer();
                break;

            case 5:
                PasswordChange();
                break;

            case 6:
                System.out.println("Thank you for using ATM system! See you next time");
                return;

            case 7:
                CancelAccount();
                break;
            default:
                System.out.println("Enter a valid command number!");
                break;
        }
        }
    }
//查询功能
    private void Inquire(){
        System.out.println("Dear "+loginAccount.getCustomerName()+" your balance on your account is "+ loginAccount.getAccountBalance());
        System.out.println("your daily withdrawal is "+loginAccount.getWithdrawalLitmits());
    } 

//存款功能
    private void Deposit(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit");
        double command=sc.nextDouble();
        double originallyBalance= loginAccount.getAccountBalance();
        originallyBalance=originallyBalance+command;
        loginAccount.setAccountBalance(originallyBalance);
        System.out.println("you have successfully deposited money under your account, your current balance is "+ loginAccount.getAccountBalance());
    }    

//取款功能
    private void Withdrawal(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount you want to withdrawal");
        double command=sc.nextDouble();
        double balance =loginAccount.getAccountBalance();
        balance=balance-command;
        if(loginAccount.getAccountBalance()==0){
            System.out.println("You do not have "+command+" to withdrawal from your account!");
        }else if(command>loginAccount.getWithdrawalLitmits()){
            System.out.println("Sorry, the daily withdrawal is "+ loginAccount.getWithdrawalLitmits()+", we are unable to approve your request.");

        }
        else{
            loginAccount.setAccountBalance(balance);
            System.out.println("You have successfully withdrawal "+command+" from your account!");

        }
        }
//改密码
        
            private void PasswordChange(){
            while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your old password");
            int command= sc.nextInt();
            if(command==loginAccount.getPassword()){
                System.out.println("please enter your new password");
                int newPassword=sc.nextInt();
                loginAccount.setPassword(newPassword);
                System.out.println("you have successfully changed your password");
                break;
            }else{
                System.out.println("you did not get the correct old password,please try again");
            }
        }
    }
    
//转账
        private void Transfer(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the account number for the person you want to transfer to");
            String command= sc.next(); 
            payee=getAccountNumberByAccount(command);
            if(payee==null){
                System.out.println("we did not find this account under our system");
                return;
            }else{
                System.out.println("Are you sure you want to transfer to "+payee.getCustomerName());
                System.out.println("Y/N");
                String confirmation = sc.next();

        if (confirmation.equalsIgnoreCase("Y")) {
        System.out.println("Please enter the amount you want to transfer");
        double transferAmount = sc.nextDouble();

        if (transferAmount <= 0) {
            System.out.println("Invalid transfer amount.");
            return;
        }

        if (transferAmount > loginAccount.getAccountBalance()) {
            System.out.println("Insufficient balance.");
            return;
        }

        if (transferAmount > loginAccount.getWithdrawalLitmits()) {
            System.out.println("Transfer amount exceeds daily withdrawal limit.");
            return;
        }

        // 更新付款账号和接收账号的余额
        double payerBalance = loginAccount.getAccountBalance() - transferAmount;
        double payeeBalance = payee.getAccountBalance() + transferAmount;

        loginAccount.setAccountBalance(payerBalance);
        payee.setAccountBalance(payeeBalance);

        System.out.println("Transfer successful. Your new balance is: " + loginAccount.getAccountBalance());
    } else if (confirmation.equalsIgnoreCase("N")) {
        System.out.println("You have cancelled the transfer.");
    } else {
        System.out.println("Invalid choice.");
    }
}
            }
           


//销户
    private void CancelAccount(){
        while(true){
        Scanner sc= new Scanner(System.in);
        System.out.println("Are you sure you want to cancel your account?");
        System.out.println("Y/N");
        String confirmation=sc.next();
        if(confirmation.equalsIgnoreCase("Y")){
            accounts.remove(loginAccount);
            System.out.println("You have delete your account from our bank");
            welcomeSite();
            break;

        }else if(confirmation.equalsIgnoreCase("N")){
            System.out.println("Account cancellation has been canceled.");
            break ;
        }else{
            System.out.println("invalid choice");
            break;
        }
    }
    }



            
            
    


    public void welcomeSite(){
        while(true){
        System.out.println("------Welcome to mini bank------");
        System.out.println("please select services below");
        System.out.println("1.open up an account");
        System.out.println("2.login to your account");
        System.out.println("3.exit");
        Scanner sc= new Scanner(System.in);
        int command= sc.nextInt();
       
        switch (command) {
            case 1:
                openAccount();
                break;
            case 2:
            loginFunction();
                break;
            case 3:
                System.out.println("you have exit our system, welcome back anytime!");
                return;
            default:
                System.out.println("please enter a valid number");
                break;
        }
        }
    
    }
}



