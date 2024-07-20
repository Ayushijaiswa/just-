 public class threadss extends Thread{
    

	public void run()
	{
		System.out.println("r1 ");
		
		try {
        		sleep(500);
    		}
    	catch(InterruptedException ie) 
    	{ 
    		// do something
			
    	}
       
  	}
	
	public static void main(String[] args) 
	{
		threadss t1=new threadss();
        threadss t2=new threadss();
		t1.start();
		//t2.start();
		System.out.println(t1.isAlive());
		t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
			System.out.println("r2");
            
        }
       
	}
}
    

