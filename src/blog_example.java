import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class blog_example {
    public static void main(String[] args) {
        Deque<String> deque1 = new ArrayDeque<>();

        deque1.addFirst("1");
        deque1.offerFirst("2");
        deque1.addLast("3");
        deque1.addLast("4");
        deque1.addLast("5");
        deque1.addLast("6");
        System.out.println(deque1);

        System.out.println(deque1.getFirst());
        System.out.println(deque1.peekFirst());
        System.out.println(deque1.getLast());
        System.out.println(deque1.peekLast());
        System.out.println(deque1.peek());


/*        System.out.println(deque1.removeFirst());
        System.out.println(deque1.pollFirst());
        System.out.println(deque1.removeLast());
        System.out.println(deque1.pollLast());
        System.out.println(deque1.remove());
        System.out.println(deque1.poll());*/
    }
}
