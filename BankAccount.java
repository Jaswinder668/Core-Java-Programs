import java.util.Scanner;
class Bank{
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    //Setter
    public void setAccountHolderName(String name){
        this.accountHolderName=name;
    }
 
    public void setAccountNumber(int number){
        this.accountNumber=number;
    }

    //Getter
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public int getaccountNumber(){
        return accountNumber;
    }


    Bank(String accountHolderName,int accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(Scanner sc){
        System.out.print("Enter amount for deposit: ");
        int amount=sc.nextInt();
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit SuccessFully");
            check_Balance();

        }else{
            System.out.println("Invaild amount entered");
        }
    }
    public void withdraw(Scanner sc){
        System.out.print("Enter amount for withdraw: ");
        int amount=sc.nextInt();

        if(amount<=balance&&amount>0){
            balance-=amount;
            System.out.println("Withdraw Successfully");
            check_Balance();

        }else if(amount<=0){
            System.out.print("Invalid Amount Entered....!");
        }
        else{
            System.out.print("Insufficent Balance...!");
        }
    }
    public void check_Balance(){
        System.out.print("Balance is : "+balance);
    }


}
class BankAccount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bank ob=new Bank("Jaswinder Singh",4545455,100000d);
        int choice;
       
        do{
             System.out.print("Enter number to perform below Task:\n1.Check balance\n2.Withdraw\n3.Deposit\n4.Exit\nSelect Option by enter Number:  ");
         choice=sc.nextInt();
        switch(choice){
            case 1:ob.check_Balance();
            break;
            case 2:ob.withdraw(sc);
            break;
            case 3:ob.deposit(sc);
            break;
            case 4:System.out.print("Logout: Thankyou for use our Banking System");
            break;
            default:System.out.print("Invalid Choice");
        }
        }while(choice!=4);
        sc.close();

    }
}