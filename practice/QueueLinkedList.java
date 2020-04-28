public class QueueLinkedList
{
    public class queue
    {
        int data;
        queue next;

        public queue(int data)
        {
            this.data  = data;
            this.next = null;
        }

    }
    public queue front=null;
    public queue rear = null;

    public void addNode(int data)
    {
        queue newnode = new queue(data);
        
        if(rear == null)
        {
            front = newnode;
            rear  = newnode;
            rear.next = null;
        }
        else
        {
            rear.next = newnode;
            rear = newnode;
            rear.next = null;
        }
    }

    public void deQueue()
    {
        if(front == null)
            return;
        queue node = front;

        front = front.next;//store front.next value[head.next] depnes on deQueue call

        if(front == null)
           rear = null;
    }

/*    public void printNode()
    {
        queue node = front;
        while(node !=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    */
    public static void main(String[]args)
    {
        QueueLinkedList list = new QueueLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
//        list.printNode();
        list.deQueue();
        list.deQueue();
        System.out.println("Queue Rear: "+list.rear.data);
        System.out.println("Queue Front: "+list.front.data);
        System.out.println();
}
}

