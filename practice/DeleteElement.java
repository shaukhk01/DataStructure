class DeleteNode
{
     class Node
    {
        public int data;
        public Node next;
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
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void delNode(int pos)
    {

        Node temp = head;
        if(pos == 0)
            head = temp.next;
        for(int i=0; temp!=null && i<pos-1;i++)
            temp = temp.next;

        Node next = temp.next.next;
        temp.next = next;
    }
        
    public void printNode()
    {
        Node current = head;
        while(current !=null)
        {
            System.out.print(current.data);
            current = current.next;
            if(current !=null)
                System.out.print(",");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        DeleteNode list = new DeleteNode();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(7);
        list.printNode();
        list.delNode(0);
        list.printNode();
    }
}
        

