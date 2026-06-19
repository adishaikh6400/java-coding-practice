class DNode {
    DNode prev;
    int data;
    DNode next;

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    DNode head;
    DNode tail;

    public void pushFront(int data) {
        DNode n1 = new DNode(data);

        if (head == null) {
            head = n1;
            tail = n1;
        } else {
            n1.next = head;
            head.prev = n1;
            head = n1;
        }
    }

    public void pushBack(int data) {
        DNode n1 = new DNode(data);

        if (head == null) {
            head = n1;
            tail = n1;
        } else {
            tail.next = n1;
            n1.prev = tail;
            tail = n1;
        }
    }

    public void displayForward() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        DNode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();

        dl.pushFront(10);
        dl.pushFront(20);
        dl.pushFront(30);

        dl.pushBack(40);
        dl.pushBack(50);

        System.out.println("Forward Traversal:");
        dl.displayForward();

        System.out.println("Backward Traversal:");
        dl.displayBackward();
    }
}