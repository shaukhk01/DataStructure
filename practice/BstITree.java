import java.util.Queue;
import java.util.LinkedList;
public class BstITree
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

    public static void levelTraverse(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(true)
        {
            int queueSize = q.size();

            if(queueSize == 0)
                break;
            while(queueSize>0)
            {
                Node node = q.peek();
                System.out.print(node.data+" ");
                q.remove();
                if(node.left !=null)
                    q.add(node.left);
                if(node.right !=null)
                    q.add(node.right);
                queueSize--;
            }
            System.out.println();
        }
    }
    public static void insert(Node root,int key)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        int qsize = q.size();
        while(qsize > 0)
        {
            Node node = q.peek();
            q.remove();
            if(node.left !=null && node.right == null)
            {
                node.right = new Node(key);
                break;
            }
            else
            {
                q.add(node.left);
            }
        }
    }

    public static void main(String[]args)
    {
        Node root = new Node(20);
        root.left = new Node(100);
        root.right = new Node(3);
        root.left.left = new Node(50);
        root.left.right= new Node(15);
        root.left.left.left = new Node(222);
        root.right.right = new Node(35);
        root.right.left  = new Node(250);
        insert(root,230);
        levelTraverse(root);

    }

}




