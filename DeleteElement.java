public class DeleteElement
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
    public Node head=null;
    public Node tail=null;
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
            tail.next=newNode;
            tail=newNode;
        }
    }
public void deleteNode(int pos)
{
    Node temp = head;
    for(int i=0;temp !=null && i<pos-1;i++)
        temp = temp.next;
    Node next = temp.next.next;
    temp.next=next;
}
  /*  public void deleteElement()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            if(head !=tail)
            {
               head = head.next;
            }
            else
            {
                head = tail=null;
            }
        }
    }
    */
    public void disp()
    {
        Node current = head;
        while(current !=null)
        {
            System.out.println(current.data+"  ");
            current=current.next;

        }

    }
    public static void main(String[]args)
    {
        DeleteElement list = new DeleteElement();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
//        list.addNode(50);
        list.disp();
        System.out.println();
        list.deleteNode(2);
        list.disp();
/*        while(list.head !=null)
        {
            list.deleteElement();
            System.out.println("Updated List");
            list.disp();
            */
            
    }
}
