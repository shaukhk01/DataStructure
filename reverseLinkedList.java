class ReverseNode
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
    
    public Node head=null;
    static Node GetNode(int data)
    {
        return new Node(data);
    }
    //reverse node
    public  void push(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void  printNode(Node node)
    {
        while(node !=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    public void print()
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
        Node head = GetNode(3);
        head.next = GetNode(5);
        head.next.next = GetNode(7);
        head.next.next.next = GetNode(9);
        head.next.next.next.next = GetNode(11);
        printNode(head);

        ReverseNode node = new ReverseNode();
        node.push(10);
        node.push(20);
        node.push(30);
        node.print();
    }
}
