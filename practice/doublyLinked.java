public class doublyLinked
{
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    public static Node prev;

    public static void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            
        }
    }
    public static void atFirst(int data)
    {
        Node node = new Node(data);
            node.next = head;
            head = node;
    }
    public static void atLast(int data)
    {
        Node node = new Node(data);
        if(tail.next == null)
        {
            tail.next = node;
            tail = node;
            tail.next = null;
        }
    }
    public static void atSpacific(int pos,int data)
    {
        Node temp = head;
        for(int i=1;i<pos-1;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }
    public static void reverse()
    {
        Node current = head;
        Node nextnode;
        while(current !=null)
        {
            nextnode = current.next;
            current.next = current.prev;
            current = nextnode;
        }
        current = head;
        head = tail;
        tail = current;
    }

    public static void printNode()
    {
        Node current = head;
        while(current !=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[]args)
    {
        doublyLinked list = new doublyLinked();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
//        list.atFirst(0);
 //       list.atLast(50);
//        list.atSpacific(2,15);
        list.printNode();
        System.out.println();
        reverse();
        list.printNode();
    }
}

