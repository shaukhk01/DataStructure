class InsertNode
{
    static class Node
    {
       public int data;
       public Node next;
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
    public static boolean isAvailable(Node head,int d)
    {
        Node temp = head;
        while(temp !=null)
        {
            if(temp.data ==d)
            {
                return true; //if this return execute then other return will no be execute
            }
            temp=temp.next;
        }
        return false;
    }
    public static void printNode(Node node)
    {
        while(node !=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }
    public static void main(String[]args)
    {
        Node head = GetNode(3);
        head.next = GetNode(5);
        head.next.next = GetNode(7);
        head.next.next.next = GetNode(9);
        int comp = 9;
        printNode(head);
        if(isAvailable(head,comp))
            System.out.println("True");
        else
            System.out.println("False");



    }
}

        
