public class AvlTree{

    class Node{
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data){

            this.data = data;
            this.left = null;
            this.right= null;
            this.height = 1;
        }
    }
    public Node root;

    public AvlTree(){

        root = null;
    }

    public void insert(int key){

        root = insertRec(root,key);
    }

    public Node insertRec(Node node,int key){

        if(node == null){

         return (new Node(key));
        }
        if(key < node.data)
            node.left = insertRec(node.left,key);
        else if(key > node.data)
            node.right = insertRec(node.right,key);
        else 
            return node;

        node.height = 1 + max(height(node.left),height(node.right));
        System.out.println("Height:"+node.height);

        return node;
    }

    int height(Node N){
        if(N == null)
            return 0;
        System.out.println("Height:"+N.height);
        return N.height;
    }

    int max(int a,int b){

        return(a > b) ? a : b;
    }
    

    public void preorder(){

        preorderRec(root);
    }

    public void preorderRec(Node node){

        if(node !=null){
            System.out.print(node.data+" ");
            preorderRec(node.left);
            preorderRec(node.right);
        }


}

public static void main(String[]args)
{
    AvlTree tree = new AvlTree();

    tree.insert(10);
    tree.insert(20);
    tree.insert(30);
    tree.preorder();
    System.out.println();
}
}



