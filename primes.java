import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        if((n%n==0&&n%2==1)||n==2){
            System.out.println("prime");}
            else{
                System.out.println("not prime");
          
        }
        
        }  
    }
    

