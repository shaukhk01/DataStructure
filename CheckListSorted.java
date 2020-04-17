public class CheckListSorted
{
    static class Node
    {
        int data;
        Node next;
    }
    public static boolean isSort(Node head)
    {
        if(head == null)
            return true;
        for(Node t = head;t.next !=null;t = t.next)
        {
            if(t.data<=t.next.data)
                return false;
        }
        return true;
    }
    public static Node addNode(int data)
    {
        Node temp = new Node();
        temp.next = null;
        temp.data = data;
        return temp;
    }
    public static void main(String[]args)
    {
        Node head = addNode(10);
        head.next = addNode(8);
        head.next.next = addNode(6);
        if(isSort(head))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

