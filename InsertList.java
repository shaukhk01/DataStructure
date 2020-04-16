public class InsertList
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void insert(int data)
    {
        Node n=new Node(data);
        if(head ==null)
        {
            head = n;//here head is pulic we can access anywhere 
            tail=n;
        }
        else
        {
            Node temp = head;//first object on temp
            head = n;//n becomes head i.e first
            head.next = temp;//head finding null and in place of null stored temp i.e previos head.
        }
    }

    public void disp()
    {
        Node current = head;//first object of list
            while(current !=null)
            {
                System.out.println(current.data+"  ");
                current=current.next;
            }
    }
    public static void main(String[]args)
    {
        InsertList list=new InsertList();
        list.addNode(10);
        list.addNode(20);
        list.insert(30);
        list.disp();
    }
}

