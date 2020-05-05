public class LeafNodeCount
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

    public static int DegTwoNode(Node root)
    {
        /***Degree(2)Find Node
         *
         */

        if(root ==  null)
            return 0;
        int x = DegTwoNode(root.left);
        int y = DegTwoNode(root.right);

        if(root.left != null && root.right != null)
            return x+y+1;
        else
            return x+y;

    }

    public static int LeafNode(Node root)
    {
        if(root == null)
            return 0;
        int x = LeafNode(root.left);
        int y = LeafNode(root.right);

        if(root.left ==null && root.right ==null)
            return x+y+1;
        else
            return x+y;
    }

    public static int degTwoOne(Node root)
    {
        if(root == null)
            return 0;
        int x = degTwoOne(root.left);
        int y = degTwoOne(root.right);

        if(root.left !=null || root.right !=null)
            return x+y+1;//deg(1) or deg(2) return only not deg(0)
        else
           return x+y;
    }

    public static int degreeOne(Node root)
    {
        if(root == null)
            return 0;
        int x = degreeOne(root.left);
        int y = degreeOne(root.right);

        if(root.left !=null ^ root.right !=null)
            return x+y+1;
        else
            return x+y;
    }

    public static void main(String[]args)
    {
        Node root = new Node(8);
        root.left = new Node(3);
        root.left.left = new Node(12);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(9);
        root.left.left.right.right = new Node(7);
        root.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(6);
        root.right.right.left = new Node(12);
        System.out.println(DegTwoNode(root));
        System.out.println(LeafNode(root));
        System.out.println(degTwoOne(root));
        System.out.println(degreeOne(root));
    }
}
        



