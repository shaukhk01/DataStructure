import java.util.*;
public class LinkedListPrint
{
    class Node
    {
        int data;
        Node Next;//reference is child class name
        public Node(int data)//here Node is constructor
        {
            this.data = data;//for actual data
            this.Next=null;
        }
    }
    public Node head=null;//using for base address
    public Node tail=null;//
    public void addNode(int data)//function
    {
        Node newNode = new Node(data);//Inner class createing object with one arg
                                     //&Initialize constructor also
        if(head==null)//first time is head is null 
        {
            head = newNode;
            tail = newNode;
        }
        else
        {  //second this onward its execute because of head is not null
            tail.Next=newNode;/*here Next=null[[tail.Next[finding null their
                               *can store newNode object 
                               */
            tail=newNode;//after find tail.Next=null then newNodeValue store on tail
        }
    }
    public void disp()
    {
        Node current = head;//because of we are using base address
        if(head==null)
        {
            System.out.println("List is empty");
        }
        System.out.println("Node of single linked list:");
        while(current !=null)
        {
            System.out.println(current.data+"  ");
            current=current.Next;//here current also find null otherwise loop goes to inf...
    {
        LinkedListPrint list =  new LinkedListPrint();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.disp();
        
    }
}
//IF YOU STILL NOT UNDERSTAND COMMENT THEN REFER[linked.java]
