public class StackLinkedList
{
    public class Stack
    {
        int data;
        Stack next;
        
        public Stack(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Stack root = null;

    public void push(int data)
    {
        Stack node = new Stack(data);
        if(root == null)
        {
            root = node;
        }
        else
        {
            Stack temp = root;
            root = node;//making first node
            node.next = temp;
        }
    }

    public Stack pop()
    {
        if(root == null)
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            return root;
        }
    }

    public int peek()
    {
        if(root == null)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        
        else
            return root.data;
    }

    public void printPoop(Stack popped)
    {
        Stack pop = popped;
        while(pop !=null)
        {
            System.out.println("    "+pop.data);
            pop = pop.next;
        }
    }

    public static void main(String[]args) {
        StackLinkedList list = new StackLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        Stack popped = list.pop();
        list.printPoop(popped);
        System.out.println();

        System.out.println(list.peek()+" TOP");
    }
}

