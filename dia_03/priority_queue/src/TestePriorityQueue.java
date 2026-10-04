package dia_03.priority_queue.src;

import java.util.PriorityQueue;

public class TestePriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> fila = new PriorityQueue<>();
//      PriorityQueue<Integer> fila = new PriorityQueue<>(Comparator.reverseOrder());
        fila.add(5);
        fila.add(1);
        fila.add(8);
        fila.add(3);

        // Mostra o elemento do topo e remove: O(log n)
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println();

        // Olha o elemento do topo sem tirar da lista: O(1)
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println();

    }
}
