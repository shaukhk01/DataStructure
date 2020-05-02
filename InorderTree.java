public class InorderTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    public static Node head;
    public static Node temp = head;

    public static void addNode(Node temp)
    {
        if(temp == null)
            return;
        addNode(temp.left);
        System.out.print(temp.data+" ");
        addNode(temp.right);

    }

    public static void main(String[]args)
    {
        head = new Node(20);
        head.left = new Node(100);
        head.left.left = new Node(50);
        head.left.right = new Node(15);
        head.left.left.left = new Node(222);
        head.right = new Node(3);
        head.right.left = new Node(250);
        head.right.right = new Node(35);
        addNode(head);
        System.out.println();
    }
}

