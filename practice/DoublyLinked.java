public class DoublyLinked
{
    class Node
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
    public Node head = null;
    public Node tail = null;

    
    public void addNode(int data)
    {
        Node node = new Node(data);

        if(head == null)
        {
            head = node;
            tail = node;
            tail.next = null;
        }

        else
        {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = head;
        }
    }
    public void reverse()
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



            
    public void printNode()
    {
        Node current = head;
        do
        {
            System.out.print(current.data);
            current = current.next;
            if(current !=null)
                System.out.print(",");
        }
        while(current !=tail.next);
   }
    public static void main(String[]args)
    {
        DoublyLinked list = new DoublyLinked();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.reverse();
        list.printNode();
    }
}
        


