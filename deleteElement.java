public class deleteElement
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
        {
            head = temp.next;
            return;
        }
        for(int i=0;temp !=null && i<pos-1;i++)
        {
            temp = temp.next;
        }
        Node next = temp.next.next;
        temp.next = next;
    }
    public void delentire()
    {
        head = null;/*assing first node to null next node automaticaly
                     *garbage collection and its automatically deleted
                     *last node also assing null
                     */
        tail = null;
    }
    public void printNode()
    {
        Node current = head;
        while(current !=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[]args)
    {
        deleteElement node = new deleteElement();
        node.addNode(10);
        node.addNode(20);
        node.addNode(30);
        node.addNode(40);
        node.addNode(50);
        node.printNode();
        System.out.println("after delete");
        node.delNode(3);
        node.printNode();
        node.delentire();
        System.out.println("entire list");
        node.printNode();
    }
}

