package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {

        //Arraylist can store hetro value. We just dont need to define the datatype of element while declaring array. ArrayList l1 = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        l1.add("A");
        l1.add("12");
        System.out.println(l1);            //l1 is internally calling ArrayList toString method. cause otherwise it would have given the class name

/*
        //add method for particular pos dont override the particular pos element, it just add the element in the pos and the old element move forward
        l1.add(1,"V");
        System.out.println(l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("23");
        l2.add("65");

        //addAll to add another list on the current list
        //l1.addAll(l2);
        l1.addAll(2,l2);
        System.out.println(l1);

        //get method to print particular pos element
        System.out.println(l1.get(2));

        //remove will remove the index element
        l1.remove(String.valueOf("A"));             //time complexity of the remove method is O(n), as all the element after the removed element will shift one one pos in left
        System.out.println(l1);

        //to change a particular element value in particular pos
        l1.set(1,100000);
        System.out.println(l1);

        //to check if element is there or not
        System.out.println(l1.contains(100000));

        //Ways to print list element

        //1 Iterator
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println("The element value is "+it.next());
        }

        //2 forEach
         for(String Elements : l1){
            System.out.println("The element value is "+Elements);
        }

        //3 for loop
        for(int i= 0; i<l1.size; i++){
            System.out.println("The element value is+ l1.get(i));
        }
 */

//        ArrayList<String> a = () ->
//        System.out.println(a);
        }
    }
