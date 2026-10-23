package CollectionsFramework.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    //• Vector synchronizes almost every individual operation (add(), get(), remove(), etc.). This means if multiple threads try to access it, they must wait in a queue for object locks, introducing massive performance overhead.
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();

        System.out.println("\n=============Common Collection Interface Methods=============");
        //======== add() ========
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);           //Insertion Order Must Preserved.

        //======== add(index,element) ========
        list.add(2,20);       //insert element in that index and move old elements to next index, don't replace that index element just move to next index and insert element to that index.
        System.out.println(list);

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

        //======== set() ========
        System.out.println(list);
        list.set(1,20);                                     //set() replace the element of that index
        System.out.println(list);

        //======== toArray() ========
        Object[] arr = list.toArray();
        for (Object obj : arr) System.out.print(obj +" ");
        System.out.println();

        //======== toString() ========
        String str = list.toString();     //it converts list to String.
        System.out.println(str);

        //======== contains() ========
        System.out.println(list.contains(20));

    }
}