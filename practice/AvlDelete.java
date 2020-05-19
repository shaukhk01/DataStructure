public class AvlDelete{
    class Node{
        int data;
        int height;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.height= 1;
            this.left = null;
            this.right= null;
        }
    }

    Node root;

    AvlDelete(){
        root = null;
    }

    void insert(int key){
        root = insertRec(root,key);
    }


    int height(Node N){

        if(N == null)
            return 0;

        return N.height;
    }

    int max(int a,int b){

        return(a > b) ? a:b;
    }

    int getBalance(Node N){

        return(height(N.left)-height(N.right));
    }

    Node LL(Node x){

        Node y = x.right;
        Node t = y.left;

        y.left = x;
        x.right=t;

        x.height = 1 + max(height(x.left),height(x.right));
        y.height = 1 + max(height(y.left),height(y.right));

        return y;
    }

    Node RR(Node y){

        Node x = y.left;
        Node t = x.right;

        x.right = y;
        y.left  = t;


        y.height = 1 + max(height(y.left),height(y.right));
        x.height = 1 + max(height(x.left),height(x.right));

        return x;
        
    }

    Node insertRec(Node root,int key){
        if(root == null)
            return(new Node(key));

        if(key < root.data)
            root.left = insertRec(root.left,key);

        else if(key > root.data)
            root.right = insertRec(root.right,key);
        else 
            return root;

        root.height = 1 + max(height(root.left),height(root.right));

        int balance = getBalance(root);


        if(balance > 1 && key > root.left.data){

            root.left = LL(root.left);

            return(RR(root));
        }
            




        return root;
    }

    void delete(int key){
        root = deleteRec(root,key);
    }

    Node deleteRec(Node root,int key){


        if(key < root.data)
            root.left = deleteRec(root.left,key);
        else if(key > root.data)
            root.right = deleteRec(root.right,key);
        
        else{
            if(root.right == null)
                return root.left;
            if(root.left == null)
                return root.right;
        root.data = node(root.right);
        root.right= deleteRec(root.right,root.data);

        }

        //System.out.println("root"+root.data);
        root.height = 1 + max(height(root.left), height(root.right));
        int balance = getBalance(root);

        if(balance > -1 && key > root.data)
            return(RR(root));

        return root;


        }

     int node(Node n){

         int value = n.data;
         while(n !=null){
             value = n.data;
             n = n.left;
        }
        return value;
     }

    void order(){
//        avlDeletedNode(root);
        preOrder(root);
        
    }

    void preOrder(Node root){

        if(root !=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
//            System.out.print(root.data+" ");
            preOrder(root.right);
        }
    }

        public static void main(String[]args){

            AvlDelete tree = new AvlDelete();
/*            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);
            */
            tree.insert(9);
            tree.insert(5);
            tree.insert(10);
            tree.insert(0);
            tree.insert(6);
            tree.insert(11);
            tree.insert(-1);
            tree.insert(1);
            tree.insert(2);
            
            tree.order();
            System.out.println();
            System.out.println("10 Deleted");
            tree.delete(10);
 //           tree.delete(30);
            tree.order();
            System.out.println();
 //           tree.delete(50);
  //          tree.order();
            System.out.println();

        }
    }


