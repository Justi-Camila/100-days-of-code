package dia_04.extract_min.src;

public class Main {
    public static void main(String[] args) {
        ExtractMin heap = new ExtractMin(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        System.out.println(heap.extractMin());
    }
}
