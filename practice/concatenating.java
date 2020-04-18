class concatenatingList
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
    static Node GetNode(int data)
    {
        return new Node(data);
    }
/*   public static void printNode(Node node)
    {
        while(node !=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
*/
    static class Node1
    {
        int data;
        Node1 next1;
        public Node1(int data)
        {
            this.data = data;
            this.next1 = next1;
        }
    }
    public static Node GetNode1(int data)
    {
        return new Node(data);
    }

     public static void printNode(Node node,Node node1)
          {
            while(node !=null)
             {
            System.out.print(node.data+" ");
            node = node.next;
            if(node == null)
            {
                while(node1 !=null)
                {
                    System.out.print(node1.data);
                    node1=node1.next;
                    if(node1 !=null)
                        System.out.print(",");
                }
                    System.out.println();
            }
             }
          }

    public static void main(String[]args)
    {
        Node head = GetNode(3);
        head.next = GetNode(5);
        head.next.next = GetNode(7);
        head.next.next.next = GetNode(11);
        head.next.next.next.next = GetNode(12);
        Node head1 = GetNode1(2);
        head1.next = GetNode1(4);
        head1.next.next = GetNode1(6);
        head1.next.next.next = GetNode1(8);
        head1.next.next.next.next = GetNode1(10);
        printNode(head,head1);


    }
}

