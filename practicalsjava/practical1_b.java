package practicalsjava;

public class practical1_b extends practical1{
   int peri;
     public  practical1_b(int l,int b){
     super(l, b);


       
     }
     public int perimeter(){
      peri=2*(l+b);
return(peri);
     }
     public static void main(String[] args) {
      practical1 r1=new practical1(10,20);
      r1.area();
      practical1_b r2=new practical1_b(20, 30);
      r2.perimeter();

     }

    
}
