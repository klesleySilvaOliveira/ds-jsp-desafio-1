# Desafio: Componentes e Injeção de Dependência

Este repositório contém a resolução do desafio **Componentes e Injeção de Dependência**, desenvolvido no capítulo inicial do curso **Java Spring Professional**.

O projeto tem como objetivo praticar os conceitos iniciais de desenvolvimento com **Spring Boot**, principalmente a criação de componentes, a separação de responsabilidades e o uso de **injeção de dependência** entre serviços.

## Sobre o desafio

O desafio propõe a criação de uma aplicação para calcular o valor total de um pedido.

O pedido possui os seguintes dados:

- Código do pedido;
- Valor básico;
- Percentual de desconto.

A aplicação deve calcular o valor final do pedido aplicando o desconto sobre o valor básico e, em seguida, adicionando o valor do frete.

A fórmula geral é:

```text
valor total = valor básico com desconto + frete
```

## Regra de frete

A regra de frete definida no enunciado considera o **valor básico do pedido**, sem aplicar o desconto:

| Valor básico do pedido | Frete |
| --- | ---: |
| Abaixo de R$ 100,00 | R$ 20,00 |
| De R$ 100,00 até R$ 200,00 exclusive | R$ 12,00 |
| R$ 200,00 ou mais | Grátis |

## O que foi cobrado

O desafio solicitava que a solução fosse desenvolvida em **Java com Spring Boot**, seguindo uma organização baseada em componentes.

A aplicação deveria conter:

- Um objeto para representar os dados do pedido;
- Um serviço responsável por calcular o frete;
- Um serviço responsável por calcular o valor total do pedido;
- Uso da anotação `@Service` para registrar os serviços como componentes Spring;
- Uso de injeção de dependência entre os serviços;
- Exibição do resultado no terminal da aplicação.

## Estrutura do projeto

A solução foi organizada em três partes principais: entidade, serviços e classe principal da aplicação.

### `Order`

Classe responsável por representar os dados de um pedido.

Ela contém os atributos:

- `code`: código do pedido;
- `basic`: valor básico do pedido;
- `discount`: percentual de desconto.

### `ShippingService`

Serviço responsável por calcular o valor do frete do pedido conforme a regra definida no desafio.

Essa classe é registrada como um componente Spring por meio da anotação `@Service`.

### `OrderService`

Serviço responsável por calcular o valor total do pedido.

Ele depende do `ShippingService` para obter o valor do frete. Essa dependência é gerenciada pelo Spring, demonstrando o conceito de **injeção de dependência**.

Essa classe também é registrada como componente Spring por meio da anotação `@Service`.

### `DesafioApplication`

Classe principal da aplicação Spring Boot.

Ela implementa `CommandLineRunner`, permitindo que o programa seja executado diretamente pelo terminal. Nessa classe, os dados do pedido são lidos, o objeto `Order` é criado e o resultado final é exibido no console.

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- Programação orientada a objetos
- Injeção de dependência

## Como executar o projeto

Clone o repositório:

```bash
git clone git@github.com:klesleySilvaOliveira/ds-jsp-desafio-1.git
```

Acesse a pasta do projeto:

```bash
cd nome-do-repositorio
```

Execute a aplicação no Linux ou macOS:

```bash
./mvnw spring-boot:run
```

No Windows PowerShell:

```bash
.\mvnw spring-boot:run
```

Após iniciar a aplicação, informe os dados do pedido no terminal, seguindo esta ordem:

```text
código
valor básico
percentual de desconto
```

## Exemplos de execução

### Exemplo 1

Entrada:

```text
1034
150.00
20.0
```

Saída esperada:

```text
Pedido código 1034
Valor total: R$ 132.00
```

### Exemplo 2

Entrada:

```text
2282
800.00
10.0
```

Saída esperada:

```text
Pedido código 2282
Valor total: R$ 720.00
```

### Exemplo 3

Entrada:

```text
1309
95.90
0.0
```

Saída esperada:

```text
Pedido código 1309
Valor total: R$ 115.90
```

## Conceitos praticados

Este projeto reforça conceitos fundamentais para o desenvolvimento com Spring Boot:

- Divisão do sistema em componentes menores;
- Separação clara de responsabilidades;
- Registro de serviços com `@Service`;
- Inversão de controle;
- Injeção de dependência;
- Reaproveitamento de componentes;
- Organização de uma aplicação Spring Boot simples;
- Execução de lógica no início da aplicação com `CommandLineRunner`.

## Observação

Este projeto foi desenvolvido com finalidade educacional, como parte do processo de aprendizado dos fundamentos do Spring Boot.

O foco principal não está apenas no cálculo do pedido, mas na aplicação dos conceitos de **componentes**, **inversão de controle** e **injeção de dependência**.
