public class customer extends Thread {
    int amount =1000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<amount){
            System.out.println("less balance");}
        
        try{
            wait();
        }
        catch (Exception e){

        }}
        synchronized void deposit(int amount){
            System.out.println("depositon complete");
            notify();

        }
        public static void main(String[] args) {
            final customer c=new customer();
            new Thread(){
            public void run(){
c.withdraw(1500);
            }
        }.start();;
        //c.start();
            
new Thread(){
    public void run(){
        c.deposit(10000);
    }
}.start();;

      
      
    }
        
    }    
   

