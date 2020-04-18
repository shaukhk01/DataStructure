class FindLoop
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
    public static Node head=null;
    public static int isloop(Node head)
    {
        Node h1 =  head;
        Node h2 = head;
        while(h1 !=null && h2 !=null && h2.next !=null)
        {
            h1 = h1.next;
            h2 = h2.next.next;
            if(h1 == h2)
            {
                System.out.println("Loop Found");
                return 1;
            }
        }
        return 0;
    }
    public static Node GetNode(int data)
    {
        if(head == null)
        {
            head = new Node(data);
        }

        return new Node(data);
    }
    public static void printNode(Node node)
    {
        while(node !=null)
        {
            System.out.println(node.data+" ");
            node = node.next;
        }
    }
    public static void main(String[]args)
    {
        Node head = GetNode(3);
        head.next = GetNode(5);
        head.next.next = GetNode(7);
        head.next.next.next = GetNode(9);
        head.next.next.next.next = GetNode(11);
        printNode(head);
        head.next.next.next.next.next = head;//creating loop
        isloop(head);
        System.out.println();
    }
}

