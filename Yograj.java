class Yograj{
    public static void main(String[] args) {
        
        //downloading complete
        //music play

        //Process:  Vs Code ,Chrome, youtube ,Resturent
         //Thread: Smallest unit of process that is called thread
         

         //Way to create thread in java
         //1. by extending thread class
         //2. by implementing Runnable interface
    }
    

}

class ThreadDay1{
    public static void main(String[] args) {
        // MyThread t=new MyThread();
        // chracter ob2=new chracter();
        // ob2.start();
        // t.start();


        OrderThread s1=new OrderThread();
        s1.start();
        Payment s2=new Payment();
        s2.start();
     
        
    }

}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }
   
}
class chracter extends Thread{
    public void run(){
        for(char ch='A';ch<='E';ch++){
            System.out.println(ch);
        }
    }
   
}

class OrderThread extends Thread{
    public void run(){
        System.out.println("Preapring food");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.print(e);
        }
        System.out.println("Order Ready......");
    }
}
class Payment extends Thread{

    public void run(){
        System.out.println("Payment Processing");
        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Payment sucessfully");
    }
}
class Resturant{
    public static void main(String[] args){
        
    }
}