import java.util.LinkedList;
import java.util.Queue;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queList = new LinkedList<Integer>();
        System.out.println("Que: " + enQue(queList));
        System.out.println("Removed element: " + deQue(queList));
        System.out.println("First element: " + laFirst(queList));
    }

    public static Queue<Integer> enQue(Queue<Integer> que) throws Exception {
        que.add(24);
        que.add(11);
        que.add(123);
        que.add(3);
        return que;
    }

    public static Integer deQue(Queue<Integer> deque) throws Exception {
        int reMove = deque.poll();
        System.out.println("Last element:" + deque);
        return reMove;
    }

    public static Integer laFirst(Queue<Integer> first) throws Exception {
        int newFirst = ((LinkedList<Integer>) first).getFirst();
        return newFirst;
    }
}
