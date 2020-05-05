import java.util.LinkedList;
import java.util.Queue;
public class TLevelOrder
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

    public static void printLevel(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        //Queue having Node element Queue<Node>
        q.add(root);

        while(true)
        {
            int countQueue = q.size();

            if(countQueue == 0)
                break;
            while(countQueue> 0)
            {
                Node node = q.peek();
                System.out.print(node.data+" ");
                q.remove();//removing element from Queue
                if(node.left !=null)//node.left[[we already assing First Value from Queue[q.peek()]
                    q.add(node.left);
                if(node.right !=null)
                    q.add(node.right);
                countQueue--;
            }
            System.out.println();
    }
}

public static void main(String[]args)
{
    Node root = new Node(1);
    root.left = new Node(2);
    root.right= new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    printLevel(root);
}
}

