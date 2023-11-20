package my.kunalLL;

public class LinkList1 {

    private Node head;
    private Node tail;
    private int size;

    public LinkList1() {
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

    public Node(int val){
        this.val=val;
        //here the next value will be null as we are not referring to next
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail=node;
        size +=1;
    }

    public void insert(int val, int index) {

        try {
            if (index < 0 || index > size) {
//                System.out.println("helklo");
                throw new IndexOutOfBoundsException("Index is greater than the LL size");
            }
            else{

                if (index == 0) {
                    insertFirst(val);
                    return;
                }
                if (index == size) {
                    insertLast(val);
                    return;
                }

                Node temp = head;
                for (int i = 1; i < index; i++) {              //here we are starting from 1 cause for index 0 we already checked (ie index == 0 )
                    temp = temp.next;
                }

                Node node = new Node(val, temp.next);
                temp.next = node;
                size +=1;
            }
        }
        catch (IndexOutOfBoundsException message){
            System.out.println(message.getMessage());
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("No node to delete");
        }
        else {
            int value = head.val;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size -= 1;

            System.out.println("Deleted value is " + value);
        }
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("No node to delete");
        } else {
            int value = tail.val;
            if (size == 1) {
                deleteFirst();
                return;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
            }
            size--;
            System.out.println("Deleted value is " + value);
        }
    }

    //  Kunal delete last node
    public void deleteLastKK(){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node secondLast = get(size-2);                  //since get method will return the node that we pass so that's why we are writing -2
        int value = tail.val;
        tail = secondLast;
        tail.next =null;
        size --;
        System.out.println("Deleted value is " + value);
    }

    //  Kunal delete particular node
    public void deleteKK(int index){
        if(index<=1){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLastKK();
            return;
        }
        Node prev = get(index-1);
        int value = prev.next.val;

        prev.next = prev.next.next;

        System.out.println("Deleted value is "+value);

    }

    //  Kunal use this method to traverse to the particular node, which we need to delete
    public Node get(int index){
        Node node = head;
        for(int i =0; i< index;i++){
            node = node.next;
        }
        return node;
    }

    public void delete(int index){
        if(index<=1){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i =0; i<index-1; i++){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;

        System.out.println("Deleted node is "+val);
        size--;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println(size);
    }
}
