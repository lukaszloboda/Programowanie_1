package ListImplementation;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list.add((random.nextInt(1000) / 10));
        }
        System.out.println("Implementacja ArrayListy:");
        System.out.println(list + "\n");
        System.out.println("-------------------------------\n");
        List<Integer> linkedList = new MyLinkedList<Integer>();
        for (int i = 0; i < 3; i++) {
            linkedList.add((random.nextInt(1000) / 10));
        }
        System.out.println("Implementacja LinkedListy:");
        System.out.println(linkedList + "\n");
        linkedList.remove(1);
        linkedList.remove(0);
        System.out.println("Odejmowanie elementów:");
        System.out.println(linkedList);


        System.out.println("------------------- STACK --------------------");
        System.out.println();
        MyStack stos = new MyStack();
        stos.push(4.5);
        stos.push(2.5);
        stos.push(1.5);
        stos.push(8.5);
        System.out.println(stos);
        stos.pop();
        stos.pop();
        stos.pop();
        System.out.println(stos);
        System.out.println("----- stos na bazie tabeli: -----");
        MyStackArray<Integer> stos2 = new MyStackArray<>();
        stos2.push(5);
        stos2.push(1);
        stos2.push(3);
        System.out.println(stos2);
        stos2.pop();
        System.out.println(stos2);
        stos2.pop();
        System.out.println(stos2);
    }
}
