package se.hkr.task4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Queue<String> queue = main.createQueue();
        Stack<String> stack = main.createStack(queue);
        main.popStack(stack);

    }

    public Queue<String> createQueue(){
        Queue<String> queue = new LinkedList<String>();
        String[] temp = {"A", "B", "C", "D", "E", "F"};

        for (int i = 40; i > 0 ; i--) {
            for (int j = 0; j < temp.length; j++) {
                queue.add(String.valueOf(i + temp[j]));
            }
        }
        return queue;
    }

    public Stack<String> createStack(Queue<String> queue){
        Stack<String> stack = new Stack<String>();

        while (queue.size() > 0){
            stack.add(queue.poll());
        }

        return stack;
    }

    public Stack<String> popStack(Stack<String> stack){
        while (stack.size() > 0){
            stack.pop();
        }
        return stack;
    }

    public void viewQueue(Queue<String> queue){
        if (queue.isEmpty()){
            System.out.println("The queue is empty");
            return;
        }

        for (String s :
                queue) {
            System.out.println(s);
        }
    }

    public void viewStack(Stack<String> stack){
        if (stack.isEmpty()){
            System.out.println("The stack is empty");
            return;
        }

        for (String s :
                stack) {
            System.out.println(s);
        }
    }

}
