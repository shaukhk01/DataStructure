public class InsertElementTree
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

    public static void traverseElement(Node root)
    {
        if(root == null)
            return;
        Node node = root;
        System.out.print(root.data+" ");
        traverseElement(root.left);
        traverseElement(root.right);
    }

    public static void addEle(Node root,int key)
    {
        Node tail= null;
        while( root != null)
        {
            tail = root;//storing last node
            if(key == root.data)
                return;
            else if(key < root.data)
                root = root.left;
            else
                root = root.right;

        }
        Node node = new Node(key);;
        node.left = null;
        node.right= null;
        if(node.data < tail.data)
            tail.left = node;
        else
            tail.right = node;
    }
    public static void main(String[]args)
    {
        Node root = new Node(30);
        root.left = new Node(20);
        root.left.left = new Node(10);
        root.right = new Node(40);
        root.right.left = new Node(35);
        root.right.right = new Node(50);
        System.out.print("Before adding:-");
        traverseElement(root);
        addEle(root,38);
        System.out.println();
        System.out.println();

        System.out.print("After adding:-");
        traverseElement(root);

        System.out.println();
    }
}
