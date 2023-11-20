package my.kunalLL;

public class LL1Main {
    public static void main(String[] args) {
        LinkList1 list = new LinkList1();
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(8);
        list.insertFirst(24);
        list.insertFirst(67);
        list.insertFirst(98);

//        list.insert(78,9);
//        list.display();
//        list.deleteFirst();
//        list.deleteLast();
//        list.delete(4);
        list.find(98);
//        list.display();
    }
}
