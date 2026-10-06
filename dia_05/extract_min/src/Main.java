package dia_05.extract_min.src;

public class Main {
    public static void main(String[] args) {
        ExtractMin heap = new ExtractMin(10);
        heap.insert(9);
        heap.insert(8);
        heap.insert(7);
        heap.insert(6);
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(1);

        while (true) {
            try {
                System.out.print(heap.extractMin() + " ");
            } catch (IllegalStateException e) {
                System.out.println("\n" + e.getMessage());
                break;
            }
        }
    }
}
