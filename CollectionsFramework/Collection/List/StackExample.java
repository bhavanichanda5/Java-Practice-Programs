package CollectionsFramework.Collection.List;

import java.util.Stack;

public class StackExample {
    //Stack Class extends Vector Class.   it follows Last In First Out (LIFO) order...

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //=======push()=======
        st.push(80);
        st.push(50);
        st.push(90);
        st.push(30);
        st.push(10);
        System.out.println(st);

        //========pop()=======
        st.pop();
        System.out.println(st);

        //========peek()=======
        System.out.println(st.peek());

        //========search()=======
        System.out.println(st.search(90));

        //========empty()=======
        System.out.println(st.empty());
    }

}
