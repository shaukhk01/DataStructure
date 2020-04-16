public class ListPosition
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void deleteNode(int pos)
    {
        Node temp =head;
       /* if(head == null)
            return;
        Node temp =head;
        if(pos==0)
        {
            head = temp.next;
            return;
        }*/
        for(int i=0;temp !=null && i<pos-1;i++)
            temp = temp.next;
        //if(temp == null || temp.next == null)
         //   return;
        Node next = temp.next.next;
        temp.next=next;
    }
    public void print()
    {
        Node current = head;
        while (current !=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[]args)
    {
        ListPosition list = new ListPosition();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.print();
        System.out.println();
        list.deleteNode(4);
        list.print();
    }
}

