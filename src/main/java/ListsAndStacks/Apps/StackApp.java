package ListsAndStacks.Apps;

import ListsAndStacks.MyStack;

import java.util.InputMismatchException;
import java.util.Scanner;

// Aplikacja ma pobierać od użytkownika liczby doputy
// nie poda on liczby zero. Następnie wyświetla te liczby w odwrotnej kolejności.
public class StackApp {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Scanner input = new Scanner(System.in);
        int temp;
        try {
            do {
                System.out.println("Podaj liczbę:");
                temp = input.nextInt();
                stack.push(temp);
            } while (temp != 0);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
