package CollectionsFramework.Collection.List;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        //List orr Collection is  Interface - can't create Instance.
        //ArrayListExample is a Concrete Class orr Implementation Class - can create Instance.

        List<Integer> list = new ArrayList<>();

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
        ArrayList<Integer> list2 = new ArrayList<>();
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
        List<Integer> list3 = new ArrayList<>();
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

        System.out.println("\n=============ArrayList Specific Methods=============");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(100);
        list4.add(700);
        list4.add(900);
        list4.add(800);
        list4.add(1200);
        System.out.println("UnSorted List - "+list4);

        //======== sort() ========
        Collections.sort(list4);
        System.out.println("Ascending Sorted List - "+list4);

        ArrayList<Integer> al = new ArrayList<>(list4);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Descending Sorted List - "+al);

        //======== clone() ========
        //Object.clone() method performs a shallow copy by default.A shallow copy creates a new object and copies the top-level field values from the original object. If any fields are primitive data types (like int, float, or boolean), their values are copied directly. If any fields are reference types (like objects, arrays, or lists), only the memory address (reference) is copied.
        //As a result, both the original object and the copied object point to the same nested objects. Changing a nested object through one copy affects the other.

        System.out.println("Before Cloning list2 size : "+list2.size());

        list2 = (ArrayList<Integer>) list4.clone();        //we did Casting Here... also .clone() works on ArrayList like list4.clone(),
        System.out.println("After list4 Cloning list2 size : "+list2.size() +" - "+list2);

        //======== ensureCapacity() ========
        ArrayList<Integer> capacity = new ArrayList<>();
        capacity.ensureCapacity(50);   //this method is used when we know that this list will contains minimum 50 Elements..it helps to increase performence and also save from coping elemenets. cause default capacity of ArrayList id 10.

        //======== isEmpty() ========
        System.out.println(list4.isEmpty()+" - "+list4.size());
        System.out.println(capacity.isEmpty()+" - "+capacity.size());

        //======== indexOf() ========
        System.out.println(list2.indexOf(5));   //-1
        System.out.println(list2.indexOf(900));    //3

    }
}