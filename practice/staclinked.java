public class staclinked
{
    public class stack
    {
        int data;
        stack next;
        public stack(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static stack root = null;

    public void push(int data)
    {
        stack newNode = new stack(data);
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            stack temp = root;
            newNode.next = temp;
            root = newNode;
        }
    }
    public int pop()
    {
        if(root == null)
        {
            System.out.println("Stack Empty");
            return 0;
        }

        
        else
        {
           stack current = root;
           int x = current.data;
           root = current.next;
          return x; 

        }
    }

    public static void main(String[]args)
    {
        staclinked s = new staclinked();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println();
        for(int i=0;root !=null;i++)
        System.out.println(s.pop());
    }
}



