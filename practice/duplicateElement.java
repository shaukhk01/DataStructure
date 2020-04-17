class RemoveDuplicate
{
    class Node
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
    public void  addNode(int data)
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
    public void remove()
    {
        Node temp = head;
        try
        {
        while(temp !=null)
        {
            if(temp.data == temp.next.data)
            {
                Node next = temp.next.next;
                temp.next = next;
            }
            temp = temp.next;
        }
        }
        catch(NullPointerException e)/*here we are using try and catch block
                                      *Because of if list not have duplicate element then 
                                      *java raise NullPointerException error...
                                      *there catch()block handle NullPointerException
                                      */
        {
            System.out.println("no duplicate value");
        }
    }
    public void printNode()
    {
        Node node = head;
        while(node !=null)
        {
            System.out.print(node.data);
            if(node !=null)
                System.out.print(",");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
       RemoveDuplicate list = new RemoveDuplicate();
       list.addNode(3);
       list.addNode(5);
       list.addNode(7);
       list.addNode(9);
       list.addNode(9);
       list.addNode(11);
       list.addNode(13);
       list.addNode(13);
       list.printNode();
       list.remove();
       list.printNode();
    }

}


