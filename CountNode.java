public class CountNode
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

    public static int count(Node root)
    {
        if(root == null)
            return 0;
        int x = count(root.left);
        int y = count(root.right);
        return x+y+1;//postOrder remember//count no of Node

    }
    public static int countSibling(Node root)
    {
        if(root == null)
            return 0;
        int x = countSibling(root.left);
        int y = countSibling(root.right);

        if(root.left !=null && root.right !=null) 
            return x+y+1;//return degreeOfNode deg(2)
        else
            return x+y;
    } 
    public static int addNodeData(Node root)
    {
        if(root == null)
            return 0;
        int x = addNodeData(root.left);
        int y = addNodeData(root.right);

        return x+y+root.data;//sum of all node
    }

    public static void main(String[]args)
    {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
       System.out.println(count(root));
       System.out.println(countSibling(root));
       System.out.println(addNodeData(root));

    }
}
