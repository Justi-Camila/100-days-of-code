package dia_05.extract_min.src;

public class ExtractMin {
    private int[] heap;

    // tamanho = quantidade de elementos = índice da próxima posição livre
    private int tamanho;

    // Construtor que inicializa o array heap
    public ExtractMin(int capacidade) {
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

        // sift up: enquanto o filho for menor que o pai, troca (regra do min-heap: pai <= filhos)
        // i > 0 porque a raiz (índice 0) não tem pai
        // pai de i = (i - 1) / 2
        while (i > 0 && heap[i] < heap[(i - 1) / 2]) {
            int pai = (i - 1) / 2;
            // variável temporária para a troca de valores entre pai e filho
            int temp = heap[i];
            heap[i] = heap[pai];
            heap[pai] = temp;
            i = pai;
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public int extractMin() {
        if (tamanho == 0) {
            throw new IllegalStateException("Heap vazio");
        }

        int variavelMin = heap[0];
        heap[0] = heap[tamanho - 1];
        tamanho--;

        int i = 0;

        while (true) {
            int esquerdo = 2 * i + 1;
            int direito = 2 * i + 2;
            int menor = i;
            if (esquerdo < tamanho && heap[esquerdo] < heap[menor]) {
                menor = esquerdo;
            }

            if (direito < tamanho && heap[direito] < heap[menor]) {
                menor = direito;
            }

            if (menor == i) {
                break;
            } else {
                int temp = heap[i];
                heap[i] = heap[menor];
                heap[menor] = temp;
            }
            i = menor;
        }

        return variavelMin;
    }
}
