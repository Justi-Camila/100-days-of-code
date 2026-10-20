# Dia 15 — 19/10/2026

## O que foi feito

### 1. Exercícios sistema de Lista de Compras (Mercado)

Objetivo: Sistema de console para controlar uma lista de compras, com menu interativo (pasta `java-basico/mercado`)

Principais aprendizados:

- Separação de responsabilidades: separar o item (dados) da lista (regras) deixou o código mais simples de manter. Antes, uma única classe fazia os dois papéis e causava vários bugs
- Método de busca reutilizável: um buscarItem(nome) usado em adicionar, remover e alterar elimina código repetido e a mensagem "não existe" duplicada
- null e NullPointerException: testar se a busca encontrou algo antes de usar o objeto
- ConcurrentModificationException: não se remove um elemento de uma lista dentro de um for-each que a percorre
- BigDecimal para dinheiro: evita erros de arredondamento do double. Comparação com compareTo (e não equals, que considera a escala) e conversão do int na hora do cálculo
- Scanner: nextInt() deixa o "enter" no buffer. Ler tudo com nextLine() e converter com Integer.parseInt / new BigDecimal(String) evita o problema
- try/catch com repetição: métodos de leitura que repetem até o usuário digitar um valor válido, capturando NumberFormatException
- Estouro de int: somar duas quantidades válidas pode passar do limite do tipo. A conta é feita em long antes de comparar com o máximo


## Links
[Repositório Java Básico](https://github.com/Justi-Camila/java-basico)