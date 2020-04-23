public class deletecircularlist {
    public static class Node
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
    public static int size  = 0;
    public static Node first=null;
    public static void addNode(int data)
    {
        Node newnode = new Node(data);
         first = head;
        if(head == null)
        {
            head =newnode;
            first = newnode;
            head.next = newnode;
            tail = newnode;
            
        }
        else
        {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
        size++;
    }
    public static void delFirstNode(int loc)
    {
        Node headnode = head;
        if(loc == 1)
        {
            head =head.next;
            tail.next = head;
            size--;
        }
    }

 /*  public void delLastNode(int loc)          
   {                                                  
       Node temp = head;                              
       if(loc >=size)                                 
       {                                              
           for(int i=0;i<size-2;i++)                  
           {                                          
                                                       
                 temp = temp.next;                      
           }                                            
          temp.next = tail.next;                       
       }                                                
   } */                                                   
    public static void lastNode()
    {
        Node temp = head;
        while(temp.next !=tail)
        {
            temp = temp.next;
        }
        tail.next =null;
        temp.next = head;
        tail = temp;
    }
    public static void position(int pos)
    {
        Node temp = head;
        for(int i=1;i<pos-1;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void printNode()
    {
        Node current = head;
        do
        {
            System.out.println(current.data+" ");
            current = current.next;
        }
        while(current !=head );

    }
        
    public static void main(String[]args)
    {
        deletecircularlist node = new deletecircularlist();
        node.addNode(10);
        node.addNode(20);
        node.addNode(30);
        node.addNode(40);
        node.addNode(50);
       delFirstNode(1);
//        lastNode();
        position(2);
        printNode();
        
    }
}
