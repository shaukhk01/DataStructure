public class circularlist
{
   static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public static void addNode(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            head.next = newnode;
            tail = head;
        }
        else
        {
           tail.next = newnode;
           tail = newnode;
           tail.next = head;

        }
    }
    public static  void addAtloc(int loc,int data)
    {
        if(loc < 1)
            System.out.println("invalid loc");
       if(loc == 1)
        {
            Node headnode = new Node(data);
            headnode.next = head;
             head = headnode;
            tail.next = head;
        }
    }
    public static void spacificlocation(Node head,int loc,int data)
    {
        if(loc < 1)
            System.out.println("invalid loc");
        else
        {
            while(loc-- !=0)
            {
                if(loc ==1)
                {
                    Node newnode = new Node(data);
                    newnode.next = head.next;
                    head.next = newnode;
                    break;

                }
                head = head.next;
            }
        }
    }
    public static void lastlocation(int loc,int data)
    {
        Node last = new Node(data);
        last.next = head;
        tail.next = last;
        tail = last;
    }

    public static void printNode( )
    {
        Node node = head;
        do
        {
            System.out.println(node+"  "+node.data);
            node = node.next;
        }
        while(node !=tail.next);
    }

    public static void main(String[]args)
    {
        circularlist cir = new circularlist();
        cir.addNode(1);
        cir.addNode(3);
        cir.addNode(5);
        addAtloc(1,0);
        cir.printNode();
        System.out.println();
        cir.spacificlocation(head,3,2);
       cir.spacificlocation(head,5,4);
        cir.printNode();
        cir.lastlocation(6,6);
        cir.lastlocation(7,7);
        System.out.println();
        cir.printNode();

    }
}
