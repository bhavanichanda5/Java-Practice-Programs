package CollectionsFramework.Collection.List;

import java.util.LinkedList;

public class LinkedListAsQueueAndDeque {
    public static void main(String[] args) {
        //LinkedList also implements Queue and Deque Interface....so, ll can implement methods of these interfaces as well.
        LinkedList<Integer> ll = new LinkedList<>();

        //=========offer()===========
        ll.offer(20);      //same like add()
        System.out.println(ll);

        //=========addFirst()===========
        ll.addFirst(60);
        System.out.println(ll);

        //=========addLast()===========
        ll.addLast(40);
        System.out.println(ll);

        //=========getFirst()===========
        System.out.println(ll.getFirst());                      //60

        //=========getLast()===========
        System.out.println(ll.getLast());                       //40

        //=========removeFirst()===========
        ll.removeFirst();
        System.out.println(ll);                                       //[20, 40]

        //=========removeLast()===========
        ll.removeLast();
        System.out.println(ll);                                         //[20]

        //=========peek()===========
        System.out.println(ll.peek());                              //[20]   -- returns top element

        //=========poll()===========
        System.out.println(ll.poll());                                 //[20]  -- it remove top element and return that element


        System.out.println(ll +" "+ll.size());

    }
}
