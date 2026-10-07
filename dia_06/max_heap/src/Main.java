package dia_06.max_heap.src;

public class Main {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(3);

        while (true) {
            try {
                System.out.print(heap.extractMax() + " ");
            } catch (IllegalStateException e) {
                System.out.println("\n" + e.getMessage());
                break;
            }
        }
    }

}
