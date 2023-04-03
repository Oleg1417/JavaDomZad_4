import java.util.Collections;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

public class Task1 {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(24);
        ll.add(11);
        ll.add(123);
        ll.add(3);
        ll.add(13);
        ll.add(2);
        ll.add(99);

        System.out.println(ll);
        System.out.println(listRevers(ll));
    }

    public static LinkedList<Integer> listRevers(LinkedList<Integer> arr) throws Exception {
        Collections.reverse(arr);
        return arr;
    }
}