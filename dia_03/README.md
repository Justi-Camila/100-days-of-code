# Dia 03 — 04/10/2026

## O que foi feito

### 1. MinHeap — inserção com sift up
Implementação de um min-heap com array em Java, começando pelo método `insert`
(pasta `extract_min`).

**Principais aprendizados:**
- "Heap" tem dois significados: a área de memória da JVM onde ficam os objetos
  e a estrutura de dados. Aqui o assunto é a estrutura de dados
- Min-heap: cada pai é menor ou igual aos seus filhos, então o menor elemento
  fica sempre no topo (índice 0). O array não fica totalmente ordenado
- Posições no array: pai de `i` = `(i - 1) / 2`; filhos = `2i + 1` e `2i + 2`
- `insert`: coloca o valor no fim e sobe (sift up), trocando com o pai enquanto
  for menor que ele — O(log n)
- `tamanho` = quantidade de elementos = índice da próxima posição livre
  (começa em 0)
- Erros que corrigi: `heap` declarado mas não instanciado (`NullPointerException`),
  `tamanho` iniciado em 5 e falta de checagem de capacidade
- Próximo passo: implementar o `extractMin` (sift down) e depois o `MaxHeap`
### 2. Singleton — CadastroAlunos
Cadastro único de alunos usando o padrão Singleton (pasta `singleton`).

**Principais aprendizados:**
- Singleton garante uma única instância: construtor `private` + `getInstance()`
  estático
- `CadastroAlunos` é o cadastro geral (lista de `Aluno`), e não o registro de
  um aluno
- Método `static` pertence à classe; método sem `static` pertence ao objeto.
  Por isso: `CadastroAlunos.getInstance().adicionar(aluno)`
- `cadastro == cadastro1` retornou `true`, confirmando que a instância é a mesma
- Sobrescrevi o `toString()` de `Aluno` para o `listar()` imprimir de forma legível
- Próximo passo: thread-safety. Testar com várias threads (`ExecutorService`)
  e corrigir (`synchronized`, double-checked locking com `volatile`, holder idiom)
### 3. PriorityQueue (Java)
Testes com a `java.util.PriorityQueue` (pasta `priority_queue`).

**Principais aprendizados:**
- `PriorityQueue` é um min-heap por padrão
- `peek()` só olha o topo, sem remover — O(1)
- `poll()` devolve e remove o topo — O(log n)
- Max-heap: `new PriorityQueue<>(Comparator.reverseOrder())`. A regra de
  prioridade é definida na criação da fila, e não depois
- `stream().sorted(...)` cria uma lista nova e não altera a fila
- Próximo passo: `Comparator` customizado (ex: `Comparator.comparing(String::length)`)

