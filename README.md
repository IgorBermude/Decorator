# 🍕 Padrão de Projeto: Decorator (Pizza com Adicionais)

Este projeto demonstra o uso do **padrão de projeto Decorator** em Java por meio de um exemplo simples e real: montagem de pizzas com adicionais.

---

## 🧱 O que é o padrão Decorator?

O **padrão Decorator** é um padrão estrutural que permite adicionar comportamentos ou responsabilidades a objetos individuais de forma dinâmica, sem alterar suas classes. Ele fornece uma alternativa flexível à herança para estender funcionalidades de maneira modular e escalável.

---

## 📌 Quando usar?

- Quando precisamos **acrescentar responsabilidades a um objeto** em tempo de execução.
- Quando há **muitas combinações possíveis de funcionalidades**.
- Quando queremos **evitar uma hierarquia extensa de subclasses**.

---

## 📚 Exemplo: Pizza com adicionais

Neste projeto, uma `Pizza` pode receber diversos adicionais como `Queijo Extra`, `Calabresa`, `Azeitona`, entre outros, de forma dinâmica.

### 🧩 Estrutura

```java
Pizza pizza = new PizzaBase();
pizza = new QueijoExtra(pizza);
pizza = new Calabresa(pizza);
pizza = new Azeitona(pizza);

System.out.println(pizza.getDescricao());
// Saída: Pizza base, Queijo Extra, Calabresa, Azeitona

System.out.println(pizza.getPreco());
// Saída: Soma dos preços da pizza com adicionais

       +--------------------+
       |      Pizza         | <----- Interface (Componente)
       +--------------------+
                  ^
                  |
       +--------------------+
       |    PizzaBase       | <----- Classe concreta (Componente base)
       +--------------------+
                  ^
                  |
       +--------------------+         +------------------------+
       |  PizzaDecorator    |<--------|     QueijoExtra        |
       +--------------------+         |     Calabresa          |
                  ^                   |     Azeitona           |
                  |                   +------------------------+
         (decoradores concretos)

```
## ✅ Vantagens
Flexível: adiciona funcionalidades sem modificar o código original.

Combinável: permite múltiplas composições dinâmicas.

Extensível: novos comportamentos são facilmente adicionados com novos decorators.

## ⚠️ Cuidados
Uso excessivo pode resultar em muitos objetos decoradores aninhados.

Pode aumentar a complexidade de leitura e debug se não for bem estruturado.
