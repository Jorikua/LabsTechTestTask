import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        final OneWayLinkedList stack = new OneWayLinkedList();

        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        final LinkedList[] sortedStack = splitStack(stack.getHead());

        for (LinkedList linkedStack : sortedStack) {
            for (Object o : linkedStack) {
                System.out.println(o);
            }
        }
    }

    private static LinkedList[] splitStack(OneWayLinkedList.Node head) {
        final LinkedList<Integer>[] array = new LinkedList[2];

        final LinkedList oddStack = new LinkedList();
        final LinkedList evenStack = new LinkedList();

        while (head != null) {
            final int data = head.data;
            if (data % 2 == 0) {
                evenStack.addLast(data);
            } else {
                oddStack.addLast(data);
            }
            head = head.next;
        }

        array[0] = oddStack;
        array[1] = evenStack;

        return array;
    }
}
