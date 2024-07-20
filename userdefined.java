import java.lang.Exception;
public class userdefined  extends Exception{
    userdefined(String message){
        super(message);
    }
    public static void main(String[] args) throws userdefined {
        int x=5,y=10000;
        try{
        float c=(float) x/(float) y;
        if(c<0.01){
           throw new userdefined("tooo small");
        }
    }
    catch(userdefined ei){
        System.out.println(ei.getMessage());
    }
        finally{
            System.out.println("i");
        }

;    }

    
}
