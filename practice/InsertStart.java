public class InsertStart
{
   static class Node
    {
        int data;
        Node next;
        public  Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data)
    {
        Node add = new Node(data);
        if(head == null)
        {
            head = add;
            tail = add;
        }
        else
        {
            tail.next = add;
            tail = add;
        }
    }

    public void addAtStart(int data)
    {
        Node node = new Node(data);
       if(head == null)
       {
           head = node;
           tail = node;
       }
       else
       {
           Node temp = head;
           head = node;
           head.next = temp;
       }
    }
    public void addAtLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            Node temp = newNode;//newdata
            tail.next = temp;//here tail value stored from addNode 
                             //and from addAtLast tail.next = temp[i.e newdata]
            tail = temp;//Now tail becomes[newdata] not before[i.e addNode]
        }
         
    }


    public void disp()
    {
        Node current  = head;
        while (current !=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[]args)
    {
        InsertStart list = new InsertStart();
    /*    list.addAtStart(10);
        list.addAtStart(20);
        list.addAtStart(30);
        */
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addAtStart(100);
        list.addAtLast(200);
        list.disp();

    }
}

