class ISBException extends java.lang.Exception{

    public ISBException(String message) {
        super(message);
    }
    

}

class CustomExceptionThrow{
    public static void main(String[] args) {
        int balance=1100;
       try {
         if(balance<1000){
            throw new ISBException("Your balance is less then 1000 . Transaction Failed");
        }
        System.out.println("Transaction Successfull");
        System.out.println("Balance is "+balance);
           
       } catch (ISBException e) {
        System.out.println(e.getMessage());
       }
       
       
    }
}