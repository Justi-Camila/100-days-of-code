# Dia 10 — 12/10/2026

## O que foi feito

### 1. Desafio Controle de Estoque (E-commerce)

Leitura e planejamento do desafio da semana (`StockLevelQuery` + `InventoryChecker`). Ainda não iniciei o código, o dia foi dedicado a entender o problema e montar a estratégia.

Principais aprendizados:

- Cada classe tem uma responsabilidade: `StockLevelQuery` guarda e consulta o estoque (`Map<String, Integer>`); `InventoryChecker` aplica a regra de negócio
- O `InventoryChecker` não deve saber como o estoque é armazenado, só precisa receber a `StockLevelQuery` de fora (injeção de dependência, tema que cai na prova)
- Pontos a decidir antes de codar: o que retornar para ID inexistente (`getOrDefault` ajuda), se "abaixo do limite" é `<` ou `<=`, e como tratar IDs repetidos
- As restrições do enunciado (ID de até 20 caracteres alfanuméricos, threshold entre 1 e 1000) são requisitos reais e devem ser validadas
- Estratégia: fazer primeiro a versão simples, sem validações, e só depois adicionar as validações uma por uma, testando a cada passo
- Casos de teste a montar: lista vazia, estoque exatamente igual ao limite, ID inexistente, ID inválido, threshold 0, 1, 1000 e 1001
- Próximo passo: criar `StockLevelQuery`, depois `InventoryChecker` (caminho feliz) e depois as validações

### 2. HackerRank (Java String Reverse)

Objetivo: descobrir se a palavra recebida é um palíndromo.

Principais aprendizados:

- Existe método pronto na biblioteca para inverter uma String: `reverse()` do `StringBuffer`
- Antes de montar um loop na mão, vale pesquisar se o Java já resolve o problema
- Próximo passo: refatorar o Staircase e o plus minus
