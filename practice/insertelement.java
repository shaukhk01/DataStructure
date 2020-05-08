import java.util.LinkedList;
import java.util.Queue;
class InsertElement
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data =data;
            this.left = null;
            this.right= null;
        }
    }

    public static  void inorder(Node root)
    {
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void insert(Node root,int key)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        int queusize = q.size();

        while(queusize > 0)
        {
            Node node = q.peek();
            q.remove();
            if(node.left ==null)
            {
                node.left = new Node(key);
                break;
            }
            else
                q.add(node.left);//passing left side of q.peek() node
            if(node.right == null)
            {
                node.right = new Node(key);
                break;
            }
            else
                q.add(node.right);//passing right side q.peek() node
        }
    }
            
    public static void main(String[]args)
    {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.right = new Node(8);
        root.right.left  = new Node(15);

        inorder(root);
        System.out.println();
        insert(root,12);
        inorder(root);
    }
}
