

class Node{
    int data;
    Node ref;
    Node(int data){
        this.data = data;
        this.ref = null;
    }
}

class LinkedList{
    Node head;
    Node tail;

    public void pushBack(int data){
        Node n1 = new Node(data);
        if(head == null){
            head = n1;
            tail = n1;
        }else{
            tail.ref = n1;
            tail = n1;
        }
    }


    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.ref;
        }
    }

    public void pushFront(int data){
        Node n1 = new Node(data);

        if(head == null){
            head = n1;
            tail = n1;
        }else{
            n1.ref = head;
            head = n1;
        }
    }
}


class NodeCreation{
    static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.pushBack(100);
        list.pushBack(200);
        list.pushBack(300);
        list.display();
        list.pushFront(50);
        list.display();
    }
}