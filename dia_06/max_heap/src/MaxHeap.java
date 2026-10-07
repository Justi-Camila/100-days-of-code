package dia_06.max_heap.src;

// Max Heap e Extract Max
public class MaxHeap {
    private int[] heap;

    // tamanho = quantidade de elementos = índice da próxima posição livre
    private int tamanho;

    // Construtor que inicializa o array heap
    public MaxHeap(int capacidade) {
        heap = new int[capacidade];
        tamanho = 0;
    }

    public void insert(int valor) {
        if (tamanho == heap.length) {
            throw new IllegalStateException("Heap cheio");
        }

        heap[tamanho] = valor;
        int i = tamanho;
        tamanho++;

        while (i > 0 && heap[i] > heap[(i - 1) / 2]) {
            int pai = (i - 1) / 2;
            // variável temporária para a troca de valores entre pai e filho
            int temp = heap[i];
            heap[i] = heap[pai];
            heap[pai] = temp;
            i = pai;
        }
    }

    public int extractMax() {
        if (tamanho == 0) {
            throw new IllegalStateException("Heap vazio");
        }

        int variavelMax = heap[0];
        heap[0] = heap[tamanho - 1];
        tamanho--;

        int i = 0;

        while (true) {
            int esquerdo = 2 * i + 1;
            int direito = 2 * i + 2;
            int maior = i;
            if (esquerdo < tamanho && heap[esquerdo] > heap[maior]) {
                maior = esquerdo;
            }

            if (direito < tamanho && heap[direito] > heap[maior]) {
                maior = direito;
            }

            if (maior == i) {
                break;
            } else {
                int temp = heap[i];
                heap[i] = heap[maior];
                heap[maior] = temp;
            }
            i = maior;
        }

        return variavelMax;
    }


}
