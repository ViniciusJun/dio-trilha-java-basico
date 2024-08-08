# Operadores em Java: Atribuição, Aritméticos 

Em Java, operadores são símbolos especiais que realizam operações em variáveis e valores. Nesta seção, abordaremos os operadores de atribuição, aritméticos, e a concatenação de strings.

## Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis. O operador de atribuição básico em Java é o `=`. Ele atribui o valor à direita da expressão à variável à esquerda.

### Exemplos de Operadores de Atribuição

```java
int x = 10; // Atribui o valor 10 à variável x
int y = 5;  // Atribui o valor 5 à variável y
```

Além do operador `=`, Java fornece operadores de atribuição combinados, que executam uma operação e atribuem o resultado à variável. Estes incluem:

- `+=`: Adição e atribuição
- `-=`: Subtração e atribuição
- `*=`: Multiplicação e atribuição
- `/=`: Divisão e atribuição
- `%=`: Módulo e atribuição

### Exemplos de Operadores de Atribuição Combinados

```java
int a = 10;
a += 5;  // Equivalente a a = a + 5, então a agora é 15

int b = 20;
b -= 3;  // Equivalente a b = b - 3, então b agora é 17
```

## Operadores Aritméticos

Os operadores aritméticos em Java são utilizados para realizar operações matemáticas básicas, como adição, subtração, multiplicação, divisão e módulo.

### Lista de Operadores Aritméticos

- `+` : Adição
- `-` : Subtração
- `*` : Multiplicação
- `/` : Divisão
- `%` : Módulo (resto da divisão)

### Exemplos de Operadores Aritméticos

```java
int x = 10;
int y = 3;

int soma = x + y;      // soma é 13
int subtracao = x - y; // subtracao é 7
int multiplicacao = x * y; // multiplicacao é 30
int divisao = x / y;   // divisao é 3 (divisão inteira)
int modulo = x % y;    // modulo é 1 (resto da divisão de 10 por 3)
```

### Atenção com a Divisão Inteira

Na divisão de dois inteiros, o resultado é sempre um número inteiro. Isso significa que qualquer fração será descartada. Para obter um resultado fracionado, é necessário usar números de ponto flutuante (`float`, `double`).

```java
double resultado = 10.0 / 3.0; // resultado é 3.3333...
```

## Concatenação de Strings

Concatenação de strings é o processo de unir duas ou mais strings em uma única string. Em Java, o operador `+` é usado para concatenar strings.

### Exemplos de Concatenação de Strings

```java
String saudacao = "Olá";
String nome = "Mundo";

String mensagem = saudacao + " " + nome + "!";
// mensagem agora é "Olá Mundo!"
```

Se um dos operandos for uma string e o outro for um valor não-string, o operador `+` converte automaticamente o valor não-string em uma string antes de realizar a concatenação.

```java
int idade = 30;
String frase = "Eu tenho " + idade + " anos.";
// frase agora é "Eu tenho 30 anos."
```

A concatenação de strings pode ser muito útil para criar mensagens dinâmicas e personalizadas em uma aplicação.



# Operadores Unários

Os operadores unários em Java são operadores que atuam sobre um único operando para realizar diversas operações, como incremento, decremento, negação lógica, entre outras. Esses operadores são frequentemente utilizados para simplificar expressões e manipular valores de variáveis.

## Tipos de Operadores Unários

### 1. Operador de Incremento (`++`)

O operador de incremento `++` aumenta o valor da variável em 1. Ele pode ser usado em duas formas:

- **Pré-incremento (`++variável`)**: Incrementa o valor da variável antes de usá-lo na expressão.
- **Pós-incremento (`variável++`)**: Usa o valor da variável na expressão e depois o incrementa.

#### Exemplos de Incremento

```java
int x = 5;

int y = ++x; // x é incrementado para 6, e y recebe 6
int z = x++; // z recebe 6, e depois x é incrementado para 7
```

### 2. Operador de Decremento (`--`)

O operador de decremento `--` reduz o valor da variável em 1. Assim como o incremento, ele pode ser usado em duas formas:

- **Pré-decremento (`--variável`)**: Decrementa o valor da variável antes de usá-lo na expressão.
- **Pós-decremento (`variável--`)**: Usa o valor da variável na expressão e depois o decrementa.

#### Exemplos de Decremento

```java
int a = 10;

int b = --a; // a é decrementado para 9, e b recebe 9
int c = a--; // c recebe 9, e depois a é decrementado para 8
```

### 3. Operador de Negação Lógica (`!`)

O operador de negação lógica `!` inverte o valor booleano de uma expressão. Se a expressão é `true`, ele a torna `false`, e vice-versa.

#### Exemplos de Negação Lógica

```java
boolean verdade = true;
boolean falso = !verdade; // falso é false
```

### 4. Operador Unário de Negação (`-`)

O operador unário de negação `-` inverte o sinal de um número, tornando positivo em negativo, e negativo em positivo.

#### Exemplo de Negação

```java
int num = 10;
int negNum = -num; // negNum é -10

int posNum = -negNum; // posNum é 10 novamente
```

### 5. Operador de Valor Positivo (`+`)

O operador `+`, quando usado unariamente, não altera o valor da variável, mas pode ser usado para indicar que o valor é positivo, embora seja pouco utilizado na prática.

#### Exemplo de Operador Positivo

```java
int positivo = +5; // positivo é 5
```

Os operadores unários são fundamentais para manipulações rápidas e eficientes de valores e variáveis em Java. Eles podem parecer simples, mas seu uso correto pode fazer uma grande diferença no comportamento do código.
