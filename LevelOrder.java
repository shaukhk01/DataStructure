import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder
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

    public static void printLevelOrder(Node root)
    {
        if(root == null)
            return;
        //blank queue for levelorder traversal
        Queue<Node> q = new LinkedList<Node>();

        q.add(root);

        while(true)
        {
            int nodeCount = q.size();

            if(nodeCount == 0)
                break;
            while(nodeCount > 0)
            {
                Node node = q.peek();
                System.out.print(node.data+" ");
                q.remove();

                if(node.left !=null)
                    q.add(node.left);
                if(node.right !=null)
                    q.add(node.right);

                nodeCount--;
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        printLevelOrder(root);
    }
}

        

