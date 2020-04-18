class InsertNode
{
     class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
            {
                tail.next = newNode;
                tail = newNode;
            }
    }
    public void insertAtFirst(int data)
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void insertAtLast(int data)
    {
        Node nwnode = new Node(data);
            tail.next = nwnode;
            tail = nwnode;//Now last Node is nwnode
    }
    public void insertAtLoc(int data,int pos)
    {
        Node temp = head;
        Node nodehead = new Node(data);
        if(pos == 0)
        {
            nodehead.next = head;
            head = nodehead;
            return;
        } 
        for(int i=0;temp !=null;i++)
        {
            if(i ==pos-1)//pos-1 because of temp.next we are taking 
            {
                nodehead.next = temp.next;
                temp.next = nodehead;
                break;
            }
            temp = temp.next;

        }

        }
    public void printNode()
    {
        Node node = head;
        while(node !=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[]args)
    {
        InsertNode node = new InsertNode();
        node.addNode(1);
        node.addNode(2);
        node.addNode(3);
        node.addNode(5);
        node.printNode();
        System.out.println();
        node.insertAtFirst(0);
        node.printNode();
        node.insertAtLast(6);
        System.out.println();
        node.printNode();
        System.out.println();
        node.insertAtLoc(4,4);
        node.insertAtLoc(-1,0);
        node.printNode();

/*        node.insertAtFirst(-1);
        node.printNode();
        System.out.println();
        node.insertAtLast(7);
        node.printNode();
*/


    }
}
