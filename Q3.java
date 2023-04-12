import java.util.*;
class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    } 
 class LinkList{
    public Node head = null;  
    public Node tail = null;  
public void display()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.printf("%d ",temp.data);
        temp=temp.next;
    }
    System.out.printf("\n");
}
public void search(int v)
{
    int i=0;
    Node temp=head;
    while(temp!=null)
    {
        if(temp.data==v)
        {
            System.out.printf("the value %d is present at index %d \n",v,i);
        }
        temp=temp.next;
        i++;
    }
    
    System.out.printf("\n");
}
public void addLast(int data)
{
    Node newNode = new Node(data);  
    if(head==null)
    {
        head=newNode;
        tail=newNode;
    }
    else
    {
        tail.next=newNode;
        tail=newNode;
    }
}
}
public class Q3
{
	public static void main(String[] args) {
	LinkList list=new LinkList();
	list.addLast(1);
	list.addLast(2);
	list.addLast(3);
	list.addLast(4);
	list.addLast(5);
	list.addLast(3);
	list.addLast(4);
	list.addLast(1);
	list.addLast(5);
	list.display();
	list.search(3);
}
}
