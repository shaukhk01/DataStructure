public class TreePreOrder
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
    public static Node tail=head;

    public static void addNode(Node temp)
    {

    
        if(temp == null)
            return;
//        System.out.print(temp.data+" ");//preorder
        addNode(temp.left);
        addNode(temp.right);
        System.out.print(temp.data+" ");//post-order
    }

    public static void main(String[]args)
    {
        head = new Node(20);
        head.left = new Node(100);
        head.left.left = new Node(50);
        head.left.left.left = new Node(222);
        head.left.right = new Node(15);

        head.right = new Node(3);
        head.right.right = new Node(35);
        head.right.left = new Node(250);
       
        addNode(head);
        System.out.println();
    }
}
