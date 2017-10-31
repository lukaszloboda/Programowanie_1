package Queue.Apps;

public class Main {

    public static void main(String[] args) {
        Queue.MyLinkedQueue<Integer> queue = new Queue.MyLinkedQueue<Integer>();

        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        System.out.println(queue);
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);

    }
}
