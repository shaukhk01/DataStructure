import java.util.LinkedList;
import java.util.Queue;

public class SearchBinaryTree
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
            this.right=null;
        }
    }

    public static boolean levelTraverse(Node root,int key)//use levelOrder:-because level use Queue[is very fast]
                                                         //use pre,inor,pos:-because this order uses stack
    {
        if(root == null)
            return false;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(true)
        {
            int countQueue = q.size();
            if(countQueue == 0)
                break;
            while(countQueue>0)
            {
                Node node = q.peek();
                if(node.data == key)
                    return true;
                q.remove();

                if(node.left !=null)
                    q.add(node.left);
                if(node.right !=null)
                    q.add(node.right);
                countQueue--;
            }
        }
        return false;
    }
    public static void main(String[]args)
    {
        Node root = new Node(20);
        root.left = new Node(100);
        root.right = new Node(3);
        root.left.left = new Node(50);
        root.right.right = new Node(35);
        root.left.right  = new Node(15);
        root.right.left  = new Node(250);
        root.left.left.left = new Node(222);
        
        if(levelTraverse(root,15))
            System.out.println("Found");
        else
            System.out.println("!Found");

        if(levelTraverse(root,5))
            System.out.println("Found");
        else
            System.out.println("!Found");
    }
}


