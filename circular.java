class Circular
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
    public static Node head =null;
    public static Node tail = null;
    public static void GetNode(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
        head = node;
        tail = node;
        node.next = head;
        }
        else
        {
            tail.next = node;
            tail = node;
            tail.next = head;//assing first address on most last recent value
        }
    }
    public static void printNode()
    {
        Node current = head;
        do
        {
            System.out.print(current.data+" ");
            current = current.next;

        }
        while(current !=head);//because of we won't loop
        }
    public static void main(String[]args)
    {
        Circular h = new Circular();
        h.GetNode(10);
        h.GetNode(20);
        h.GetNode(30);
        h.GetNode(40);
        h.printNode();
    }
}

