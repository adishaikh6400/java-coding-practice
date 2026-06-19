

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

    public boolean search(int key){
        Node temp = head;

        while(temp != null){
            if(temp.data == key){

                return true;
            }
            temp = temp.ref;
        }

        return false;
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

    public int popFront(int key){
        if(head == null){
            return -1;
        }
        int deletedData = head.data;
        if(head==tail){
            head = null;
            tail = null;
        }else {
            head = head.ref;
        }
        return deletedData;
    }

    public int popBack(int key){
        if(head == null){
            return -1;
        }
        int deletedData = tail.data;
        if(tail==head){
            tail = null;
            head = null;
            return  deletedData;
        }

        Node temp = head;

        while(temp.ref != tail){
            temp = temp.ref;
        }

        temp.ref = null;
        tail = temp;

        return deletedData;
    }


}


class NodeCreation{
    static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.pushBack(100);
        list.pushFront(50);
        list.pushBack(200);
        list.pushBack(300);
        list.display();
        System.out.println();

        if(list.search(50)){
            System.out.println("The linked list contains the linked list " );
        }else {
            System.out.println("The linked list does not contain the linked list");
        }
        list.popFront(200);
        list.display();
        System.out.println();
        list.popBack(200);
        list.display();
    }
}