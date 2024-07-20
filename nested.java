public class nested {
    public static void main(String[] args) {
        try{
          
            
            try{
                int c=29/0;
                
            }
            catch(ArithmeticException e){
               System.out.println("dividing by zero");


            }
            try{
                int [] a=new int[5];
                a[5]=4;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bpound");
            }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}

