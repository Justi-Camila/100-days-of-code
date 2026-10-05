package dia_03.min_heap.src;

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.imprimir();
    }
}
