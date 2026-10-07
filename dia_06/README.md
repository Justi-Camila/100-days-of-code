# Dia 06 — 07/10/2026

## O que foi feito

### 1. maxHeap/extractMax
Implementação do `maxHeap` e `extractMax`, testado com heap vazio, um elemento e valores repetidos (pasta `max_heap`).

**Principais aprendizados:**
- `PriorityQueue` com `Comparator.reverseOrder()` funciona como max-heap
- O array do heap não fica em ordem decrescente (8 3 5 1 3). A ordem só aparece ao retirar um por um.
- No sift down há duas comparações diferentes: “esse filho existe?” (índice x tamanho) e “esse filho ganha?” (valor x valor). Só a segunda muda do min-heap para o max-heap.
- Heapify (conceito estudado): é consertar a regra do heap a partir de um nó (foi utilizado no laço dentro do extractMin, que é um heapify no índice 0)
- Build heap (conceito estudado): é o ato de transformar um array qualquer, desordenado, em um heap
- Próximo passo: exercícios com PriorityQueue

### 2. HackerRank (A Very Big Sum)
Objetivo: percorrer um array long e acumular os valores (pasta `very_big_sum`).

**Principais aprendizados:**
- a soma de valores grandes estoura o int, e por isso o tipo é long
- Próximo passo: iniciar Diagonal Difference

### 3. Alura (Threads)
Thread é como uma linha de execução que o programa usa para realizar uma tarefa

**Principais aprendizados:**
- Escalonador de threads decide qual thread usa o processador e por quanto tempo
- Gerenciador de concorrência -> quem pode usar o quê e quando (FIFO, Round-Robin, Prioridades)
- `public class Operacao implements Runnable { @Override public void run() {} }`
- `Thread variavel = new Thread(operacao);`
- Chamar `run()` direto executa na mesma thread, sem paralelismo, o `.start()` é o que cria a execução em paralelo
- Lock pessimista -> bloqueia os dados para que ninguém mais possa alterar até que a transação atual seja concluída
- Lock otimista -> permite que outras transações vejam os dados, mas antes de finalizar a transação, o sistema verifica se ninguém mais fez alguma alteração nesse meio tempo
- Executor -> interface que só executa tarefas; suas implementações geralmente são pools de threads (objeto que trabalha no gerenciamento das threads)
- Próximo passo: Concluir o curso e os exercícios do projeto Adopet