import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("initial size of arraylist"+arr.size());
        arr.add(1/0);
      
        System.out.println(arr);
        
    }
    
}
