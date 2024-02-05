package OOPs.Inheritance;

class Account{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob){
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    };
    public String getPhno(){
        return phno;
    }
    public String getDOB(){
        return dob;
    }
    public long getBalance(){
        return balance;
    }
    public void setAddress(String add){
        address=add;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
            
}

class SavingsAccount extends Account{
    public void deposit(long amt){
        balance+=amt;
    }
    public void withdraw(long amt){
        balance-=amt;
    }
}

class LoanAccount extends Account{
    public void payEMI(long amt){
        balance-=amt;
    }
    public void repay(long amt){
        if(balance==amt)
            balance=0;
    }
}

public class InheritanceAccount {
    public static void main(String[] args) {
        Account a = new Account("01", "ram", "coimbatore", "1234567890", "12/03/1980");
        System.out.println("Amount first : "+a.getBalance());
        
        SavingsAccount s = new SavingsAccount();
        System.out.println("Amount before deposite : "+a.getBalance());
        s.deposit(10000);
        System.out.println("Amount after deposite : "+a.getBalance());
        System.out.println("Amount before withdraw : "+a.getBalance());
        s.withdraw(350);
        System.out.println("Amount after withdraw : "+a.getBalance());

        LoanAccount l = new LoanAccount();
        System.out.println("Amount before payEMI : "+a.getBalance());
        l.payEMI(1000);
        System.out.println("Amount after payEMI : "+a.getBalance());
        System.out.println("Amount before repay : "+a.getBalance());
        l.repay(500);
        System.out.println("Amount after repay : "+a.getBalance());
    }

}
