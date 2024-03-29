package com.heysanjeet.datastructure.linkedlist.doublyLL;

public class DoublyLL {
    Node head;
    Node tail;
    int length;

    public DoublyLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (head == null) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (head == null) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        }
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;
    }

   /* public Node get(int index) {
        Node temp = head;
        if (index < 0 || index > length) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }*/

    //efficient
    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index > length) {
            return null;
        }
        if (index > length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            length++;
            return true;
        }
        if (index == length) {
            append(value);
            length++;
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            removeFirst();
        }
        if (index == length - 1) {
            removeLast();
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head " + head);
    }

    public void getTail() {
        System.out.println("Tail " + tail);
    }

    public void length() {
        System.out.println("Size " + length);
    }
}
