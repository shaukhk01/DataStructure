public class ListLinked
{
    public class Node
    {
        int data;
        Node next;
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
            tail = node;//because of tail before this line point to tail=first node
                        //Now its tail become second Node similarly........
            tail.next = null;
        }
    }
    public void printNode()
    {
        Node current = head;
        while(current !=null)
        {
            System.out.print(current.data);
            current = current.next;
        }
    }
    public static void main(String[]args)
    {
        ListLinked list = new ListLinked();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);
        list.printNode();
    }
}


