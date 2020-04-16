public class MakeSortedList
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
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
            tail.next=newNode;
            tail = newNode;
        }
    }
    public void sortList()
    {
        Node current = head,index=null;
        int temp;//for swaping
        while(current !=null)//first true because of current=head
        {
            index = current.next;//now index becomes not null
            while(index !=null)
            {
                if(current.data > index.data)
                {
                temp = current.data;
                current.data = index.data;
                index.data = temp;
            }

            index = index.next;//now index increase until the found null in the list
        }
        current=current.next;//current also finding null But null is available at last
    }
    }

    public void disp()
    {
        Node current = head;
        while(current !=null)
        {
            System.out.print(current.data+"  ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        MakeSortedList list= new MakeSortedList();
        list.addNode(5);
        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
System.out.println("orignal list");
        list.disp();
        System.out.println();
System.out.println("sorted list ");        
        list.sortList();
        list.disp();
    }
}
