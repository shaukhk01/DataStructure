class SortList
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
    public static Node head = null;
    public static Node tail = null;
    public static void sortlist(Node head)
    {
        Node current = head,index = null;
        int temp;
        while(current !=null)
        {
            index = current.next;
            while(index !=null)
            {
                if(current.data > index.data)
                {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index=index.next;
            }
            current = current.next;
        }
    }
    
/*public static void addNode(int dat
{
    Node node = new Node(data);
    if(head == null)
    {
        head = node;
        tail = node;
    }
    else
    {
        tail.next = node;
        tail = node;
    }
}
*/
    public static Node GetNode(int data)
    {
            if(head == null)
            {
                head = new Node(data);
            }
        return new Node(data);
    }
    
    public static void printNode(Node head)
    {
        Node node = head;
        while(node !=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public static void main(String[]args)
    {

        SortList list = new SortList();
        /*list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(0);
        list.addNode(2);
        list.addNode(4);
        list.printNode();
        System.out.println();
        list.sortlist();
        list.printNode();
        */
        Node head = GetNode(1);
        head.next = GetNode(3);
        head.next.next = GetNode(5);
        head.next.next.next = GetNode(0);
        head.next.next.next.next = GetNode(2);
        head.next.next.next.next.next = GetNode(4);
        printNode(head);
        System.out.println();
        sortlist(head);
        printNode(head);
        
    }
}

