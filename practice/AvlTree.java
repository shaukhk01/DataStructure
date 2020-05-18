public class AvlTree{

    class Node{
       
        int data;
        int height;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.height = 1;
            this.left = null;
            this.right= null;
        }
    }
    Node root;

    AvlTree(){
        root = null;
    }

    void insert(int key){
        root = insertNode(root,key);
    }

    Node LL(Node x){
        Node y = x.right;
        Node t = y.left;

        y.left = x;
        x.right = t;

        //update height acentors node;
        x.height = 1 + max(height(x.left),height(x.right));//first update root value
        y.height = 1 + max(height(y.left),height(y.right));//then roation value

        return y;
    }

    Node RR(Node x){

        Node y = x.left;

        Node t = y.right;

        y.right = x;
        x.left  = t;

        x.height = 1 + max(height(x.left),height(x.right));//here also first update root(x)node
        y.height = 1 + max(height(y.left),height(y.right));//then rotation value otherwise expected output not somewhere
        return y;

    }

    Node insertNode(Node root,int key){

        if(root == null){
            return(new Node(key));
        }

        if(key < root.data)
            root.left = insertNode(root.left,key);

        else if(key > root.data)
            root.right = insertNode(root.right,key);
        else
            //duplicate  key not allowed
            return root;

        //update height off this ancestors node
        root.height = 1 + max(height(root.left),height(root.right));

        //get balance factor whether this node become unblance
        int balance = getBalance(root);

        if(balance < -1 && key > root.right.data)
            return(LL(root));


        if(balance > 1 && key > root.left.data){
            root.left = LL(root.left);
            return RR(root);
        }

        if(balance < -1 && key < root.right.data){
            root.right = RR(root.right);
            return LL(root);
        }

        if(balance > 1 && key < root.left.data)
            return RR(root);
        
        return root;//return stack node

    }

    int height(Node N){
        if(N == null)
            return 0;
        return N.height;//return height of node;
    }

    //get maximum of two integers 
    int max(int a,int b){

        return(a > b) ? a:b;
    }

    int getBalance(Node N){
        if(N == null)
            return 0;

        return(height(N.left) - height(N.right));
    }

    void order(){
        preOrder(root);
    }

    void preOrder(Node root){

        if(root !=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[]args)
    {
        AvlTree tree = new AvlTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(25);
        tree.insert(28);
        tree.insert(27);
        tree.insert(5);

        tree.order();
        System.out.println();
    }
}

