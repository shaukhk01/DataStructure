class InsertElement
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
    static Node InsertPos(Node headNode,int pos,int data)
    {
        Node head = headNode;
        if(pos < 1)
            System.out.println("Invalid position");
        if(pos == 1)
        {
            Node newNode = new Node(data);
            newNode.next = headNode;
            head = newNode;
        } 
        else
        {
            while(pos-- !=0)
            {
                if(pos == 1)
                {
                Node newNode = GetNode(data);
                newNode.next = headNode.next;
                headNode.next = newNode;
                break;
            }
            headNode=headNode.next;
        }
        if(pos !=1)
            System.out.println("position out of range");
            
        }
        return head;
    }
    static void printList(Node node)
    {
        while (node !=null)
        {
            System.out.print(node.data);
            node = node.next;
            if(node !=null)
                System.out.print(",");
        }
        
        System.out.println();
    }

    public static void main(String[]args)
    {
        Node head = GetNode(3);//instance of method
        head.next = GetNode(5);
        head.next.next = GetNode(8);
        head.next.next.next = GetNode(10);
        System.out.println("Linked List before insertiion");
        printList(head);
        int data = 12,pos = 3;
        head = InsertPos(head,pos,data);
        System.out.println("Linked List After Insertition");
        printList(head);
        data = 100;
        pos = 1;
        head = InsertPos(head,pos,data);
        printList(head);
        data = 20;
        pos = 4;
        head = InsertPos(head,pos,data);
        printList(head);
        head = InsertPos(head,8,200);//it will work because of inplace of 8 position null is there
  //      head = InsertPos(head,10,200);//it will not work because of after 8 9 pos null is there !=10
        printList(head);
    
    }
}

   
