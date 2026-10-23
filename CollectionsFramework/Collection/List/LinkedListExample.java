package CollectionsFramework.Collection.List;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {

    //Each element in a linked list is known as a node. It consists of 3 fields:
    //Prev - stores an address of the previous element in the list. It is null for the first element
    //Next - stores an address of the next element in the list. It is null for the last element
    //Data - stores the actual data

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        System.out.println("\n=============Common Collection Interface Methods=============");
        //======== add() ========
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);           //Insertion Order Must Preserved.

        //======== remove() ========
        list.remove(2);
        System.out.println(list);

        //======== addAll() ========
        List<Integer> list2 = new LinkedList<>();
        list2.add(00);
        list2.add(11);
        list2.add(22);
        list2.add(20); //duplicates are allowed..

        list.addAll(list2);
        System.out.println(list);

        //======== removeAll() ========
        list.removeAll(list2);             //it also removed list values 20
        System.out.println(list);

        //======== size() ========
        System.out.println("List : "+list.size() +" - "+list);
        System.out.println("List2 : "+list2.size()+" - "+list2);

        //======== clear() ========
        list2.clear();    //it clears arraylist.
        System.out.println("Size of list2 After clear() - "+list2.size());

        //======== iterator() ========
        Iterator<Integer> iterator = list.iterator();    //it helps to traverse on list
        while (iterator.hasNext()){
            System.out.println("Elements - "+iterator.next());
        }

        System.out.println("\n=============List Interface Specific Methods=============");
        List<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);

        System.out.println(list3);

        //======== get() ========
        System.out.println(list3.get(2));

        //======== set() ========
        list3.set(3,9);             //9 replace the index 3 value
        System.out.println(list3);

        //======== toArray() ========
        Object[] arr = list3.toArray(); //it converts the list3 into array
        for (Object i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        //======== contains() ========
        System.out.println(list3.contains(9));
        System.out.println(list3.contains(10));

        System.out.println("\n=============LinkedList Specific Methods=============");
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(100);
        list4.add(700);
        list4.add(900);
        list4.add(800);
        list4.add(1200);
        System.out.println("UnSorted List - "+list4);

        //======== sort() ========
        Collections.sort(list4);
        System.out.println("Ascending Sorted List - "+list4);

        LinkedList<Integer> al = new LinkedList<>(list4);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Descending Sorted List - "+al);

        //======== clone() ========
        //Object.clone() method performs a shallow copy by default.A shallow copy creates a new object and copies the top-level field values from the original object. If any fields are primitive data types (like int, float, or boolean), their values are copied directly. If any fields are reference types (like objects, arrays, or lists), only the memory address (reference) is copied.
        //As a result, both the original object and the copied object point to the same nested objects. Changing a nested object through one copy affects the other.

        System.out.println("Before Cloning list2 size : "+list2.size());

        list2 = (LinkedList<Integer>) list4.clone();        //we did Casting Here... also .clone() works on LinkedList like list4.clone(),
        System.out.println("After list4 Cloning list2 size : "+list2.size() +" - "+list2);

        //======== isEmpty() ========

        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(list4.isEmpty()+" - "+list4.size());
        System.out.println(ll.isEmpty()+" - "+ll.size());

        //======== indexOf() ========
        System.out.println(list2.indexOf(5));   //-1
        System.out.println(list2.indexOf(900));    //3

        //======== lastIndexOf() ========
        list2.add(1000);
        list2.add(900);
        list2.add(1100);
        list2.add(900);
        System.out.println("list2 Printing - "+list2+" size of list2 - "+list2.size());
        System.out.println("LastIndexOf - "+list2.lastIndexOf(900));                 //8th index
    }
}
