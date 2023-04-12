import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList {
    public Node head = null;
    public Node tail = null;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }

        System.out.printf("\n");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    public void addIndex(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        while (index > 1) {
            temp = temp.next;
            index--;
        }
        if (temp.next == null) {
            temp.next = newNode;
            tail = newNode;
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    public void deleteLast() {
        if (head == null) {
            System.out.printf("the list empty");
        } else {
            Node temp1 = head;
            Node temp2 = head.next;
            while (temp2.next != null) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            temp1.next = null;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.printf("the list empty");
        } else {
            head = head.next;
        }
    }

    public void deleteIndex(int index) {
        if (head == null) {
            System.out.printf("the list empty");
        } else {
            Node ptr1 = head;
            Node ptr2 = head.next;
            while (index > 1) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
                index--;
            }
            ptr1.next = ptr2.next;
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        list.AddFirst(4);
        list.AddFirst(5);
        list.display();
        list.addIndex(2, 1);
        list.addIndex(2, 2);
        list.addIndex(2, 3);
        list.addIndex(10, 1);
        list.addLast(2);
        list.addLast(3);
        list.display();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.display();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteLast();
        list.deleteLast();
        list.display();
        list.deleteIndex(2);
        list.deleteIndex(2);
        list.display();
    }
}
