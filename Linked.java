public class Linked
{
  class Node
  {
      int data;
      Node next;
      public Node(int data)
      {
          this.data=data;
          this.next=null;//
      }
  }
  public Node head=null;//for base address
  public Node tail=null;//storing address until the null
public void addNode(int data)
{
    Node newNode = new Node(data);
    if(head ==null)
    {
        head = newNode;
        tail = newNode;
    }
    else
    {
        tail.next=newNode;//goto next head
        tail=newNode;//and stored newNode
    }
}
public void disp()
{
    Node current = head;//because we want base address
    while(current !=null)
    {
        System.out.println(current.data+"  ");
        current = current.next;//one by one going to till the null
    }
    System.out.println();
}
public static void main(String[]args)
{
    Linked list=new Linked();
    list.addNode(1);
    list.addNode(2);
    list.disp();
}}




