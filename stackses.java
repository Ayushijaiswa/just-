import java.util.*;
public class stackses {
    public static void main(String[] args) {
        
    
    Stack<String> st=new Stack<>();
    st.push("raj");
    st.push("shreya");
    st.push("neel");
    st.pop();
    st.peek();
    st.search("raj");
    System.out.println(st.peek());
    System.out.println(st.search("raj"));
    System.out.println(st);
    }
}
