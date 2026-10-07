# Dia 05 — 06/10/2026

## O que foi feito

### 1. extractMin
Implementação do `extractMin` (sift down) no MinHeap, testado com heap vazio,
um elemento e valores repetidos (pasta `extract_min`).

**Principais aprendizados:**
- No extractMin, o último elemento vai para a raiz e desce, trocando sempre com o menor dos dois filhos
- O teste de mesa mostrou que o bug estava antes do laço, e não no laço.
- O certo é `heap[0] = heap[tamanho - 1];` e não `heap[tamanho] = heap[tamanho - 1];` pois é necessário atribuir à primeira posição, não ao tamanho
- O último elemento (índice `tamanho - 1`) precisa ir para o índice 0. Com `heap[tamanho] = heap[tamanho - 1];`, eu copiava para a posição livre, e o topo continuava no lugar
- Antes de usar o heap[esquerdo], é preciso conferir se esquerdo < tamanho. O mesmo é válido para o direito
- Insert e extractMin são O(log n), porque sobem ou descem no máximo a altura da árvore
- Tirar do heap até esvaziar devolve os números em ordem crescente (é a ideia do heap sort)
- Próximo passo: iniciar o MaxHeap

### 2. HackerRank (Simple Array Sum)
Objetivo: percorrer um array e acumular ("acumular vs. concatenar") (pasta `simple_array_sum`).

**Principais aprendizados:**
- Acumular a soma com uma variável iniciada em 0 e um laço sobre a lista
- Escolher o tipo pelas restrições do problema
- Atualizar o bufferedWriter do HackerRank para o IntelliJ
- A entrada tem o n na primeira linha e os números na segunda. Digitar tudo numa linha dá `NumberFormatException`
- Próximo passo: Iniciar A Very Big Sum



