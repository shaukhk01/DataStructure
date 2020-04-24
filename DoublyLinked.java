class doublyLinked
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
            this.prev = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    public static int resize= 0;
    public static void addNode(int data)
    {
        Node addnode = new Node(data);
        if(head == null)
        {
            head = addnode;
            tail = addnode;
        }
        else
        {
            tail.next = addnode;
            addnode.prev = tail;
            tail = addnode;
        }
    }
    public static void atFirst(int pos,int data)
    {
        Node node = new Node(data);
        if(pos == 1)
        {
            node.next = head;
            head.prev = node;
            head = node;
            resize++;
        }
    }
    public static void atLast(int data)
    {
        Node temp = new Node(data);
        tail.next = null;
        tail.next = temp;
        temp.prev = tail;
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
    public static void printNode()
    {
        Node node = head;
        while(node !=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String[]args)
    {
        doublyLinked list = new doublyLinked();
        list.addNode(10);
        list.addNode(15);
        list.addNode(25);
        list.addNode(30);
        list.atFirst(1,5);
        list.atLast(40);
        list.atSpacific(3+resize,20);
        list.atSpacific(6+resize,35);
        list.printNode();
    }
}


