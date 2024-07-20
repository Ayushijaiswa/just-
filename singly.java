import java.lang.constant.DynamicConstantDesc;

public class singly {
    class Node
    {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }public Node head =null;
    public Node tail=null;
    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;

        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
            return;

        }System.out.println("nodes of singly linkedlist");
        while(current!=null){
            System.out.println("current data"+current.data);
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        singly s=new singly();
        s.addNode(12);
        s.addNode(23);
        s.display();
    }
    
}
