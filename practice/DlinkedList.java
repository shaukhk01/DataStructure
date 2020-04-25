public class DlinkedList
{
    static class Node
    {
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
            tail = newNode;
            tail.next = null;
        }
    }
    public static void delFirst()
    {
        Node node = head;
        node = node.next;
        head = node;
    }
    public static void delLast()
    {
        tail = tail.prev;//because of 40 will store tail
        tail.next = null;//after 40.next = null[50 deleted]
    }
    public static void delPosition(int pos)
    {
        Node temp = head;
        for(int i=1;i<pos-1;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

    }

    public static void printNode()
    {
        Node node = head;
        while(node !=null)
        {
            System.out.print(node.data);
            node = node.next;
            if(node !=null)
                System.out.print(",");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        DlinkedList list = new DlinkedList();
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);
        addNode(50);
//       delFirst();
//       delLast();
        delPosition(3);
        printNode();
    }
}
        

