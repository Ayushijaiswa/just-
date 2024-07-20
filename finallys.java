public class finallys {
    public static void main(String[] args) {
        int a[]={5,10};
        int b=5;
        try{
            int c=a[2]/b-b;
        }
        catch(ArithmeticException e){
            System.out.println("divided by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("bad index");
        }
        catch(ArrayStoreException e){
            System.out.println("wrong data store");
        }
        finally{
            int y=a[1]/a[0];
            System.out.println(y);
        }
    }
    
}
