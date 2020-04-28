public class QueueArray
{
    public static int size=7;
    public int front;
    public int rear;

    int[] queue;

    public QueueArray(int size)
    {
        this.queue = new int[size];
        this.front = -1;
        this.rear = 0;
    }

    public boolean enQueue(int value)
    {
        if(isFull())
            return false;
        queue[rear] = value;

        if(front == -1)
            front = rear;
        rear = (rear + 1)%queue.length;
        return true;
    }

    public boolean deQueue()
    {
        if(isEmpty())
            return false;
        int val = queue[front];
        front = (front +1)%queue.length;
        if(front == rear)
            front = -1;
        return true;
    }

    public boolean isFull()
    {
        return(front == rear);
    }
    public boolean isEmpty()
    {
        return (front == -1);
    }

    public static void main(String[]args)
    {
        QueueArray q = new QueueArray(size);

        for(int i=1;i<=size;i++)
             q.enQueue(i);
        q.deQueue();
//        q.enQueue(5);
        for(int i=0;i<size;i++)
            System.out.println(q.queue[i]);
        boolean b = q.isFull();
        System.out.println("Array Full: "+b);
    }

}
