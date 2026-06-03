# Projeto Java POO - Tema 17: Bebidas

## Integrantes

- Luiz Henrique Japecanga
- Isabella Moreno Castro

## Tema

- Tema escolhido: 17 - Bebidas

## Estrutura do Projeto

- `src/main/java/app/Main.java`
- `src/main/java/model/Bebida.java`
- `src/main/java/model/Suco.java`
- `src/main/java/enums/TipoBebida.java`
- `src/main/java/enums/Temperatura.java`

## Conceitos Aplicados

- classe abstrata
- herança
- sobrescrita (override)
- sobrecarga (overload)
- enum simples
- enum completo

## Descrição do Sistema

O sistema foi desenvolvido para representar bebidas, usando uma superclasse abstrata para os dados comuns e uma subclasse concreta para o tipo Suco

O projeto atende aos requisitos solicitados no enunciado, incluindo:

- 1 superclasse abstrata
- 1 subclasse que herda da superclasse
- 2 enums
- 1 classe `Main` com testes
- uso de herança, sobrescrita, sobrecarga, classe abstrata e enums

## Como o sistema funciona

- A classe `Bebida` guarda os atributos gerais de uma bebida
- A classe `Suco` herda de `Bebida` e adiciona atributos próprios
- O enum `TipoBebida` define categorias básicas de bebida
- O enum `Temperatura` define a temperatura ideal e seus graus
- O `Main` cria dois objetos diferentes, chama todos os métodos e faz comparações entre eles

## Observação

O código foi organizado em pacotes conforme solicitado:

- `app/`
- `model/`
- `enums/`
