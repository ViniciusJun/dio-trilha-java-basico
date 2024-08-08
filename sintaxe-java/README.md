# Tipos Primitivos em Java

Em Java, os tipos primitivos são os blocos básicos de construção para a manipulação de dados. Esses tipos não são objetos e representam valores simples. Existem oito tipos primitivos em Java, cada um com um propósito específico. Eles são classificados em quatro categorias principais: tipos numéricos inteiros, tipos numéricos de ponto flutuante, caracteres e booleanos.

## Tipos Numéricos Inteiros

1. **byte**: Usado para economizar espaço em grandes arrays, onde a economia de espaço realmente importa. É um tipo de 8 bits.
2. **short**: Também usado para economizar espaço, como o `byte`, mas pode armazenar números maiores. É um tipo de 16 bits.
3. **int**: O tipo numérico inteiro padrão para a maioria das operações. É um tipo de 32 bits.
4. **long**: Usado quando um intervalo maior que o `int` é necessário. É um tipo de 64 bits.

## Tipos Numéricos de Ponto Flutuante

5. **float**: Usado para economizar memória em grandes arrays de números de ponto flutuante. É um tipo de 32 bits.
6. **double**: O tipo padrão para números de ponto flutuante. É um tipo de 64 bits.

## Caracter

7. **char**: Usado para armazenar qualquer caractere único. É um tipo de 16 bits que representa um único caractere Unicode.

## Booleano

8. **boolean**: Usado para armazenar valores verdadeiros ou falsos. Pode ter apenas dois valores: `true` ou `false`.

## Tabela dos Tipos Primitivos

| Tipo   | Tamanho (bits) | Valor Mínimo              | Valor Máximo               | Valor Padrão |
|--------|----------------|---------------------------|----------------------------|--------------|
| byte   | 8   (1 bytes)  | -128                      | 127                        | 0            |
| short  | 16  (2 bytes)  | -32.768                   | 32.767                     | 0            |
| int    | 32  (4 bytes)  | -2.147.483.68             | 2.147.483.647              | 0            |
| long   | 64  (8 bytes)  | -9.223.372.036.854.775.808| 9.223.372.036.854.775.807  | 0L           |
| float  | 32  (4 bytes)  | 1.4e-45 (aprox.)          | 3.4028235e+38 (aprox.)     | 0.0f         |
| double | 64  (8 bytes)  | 4.9e-324 (aprox.)         | 1.7976931348623157e+308    | 0.0d         |
| char   | 16  (2 bytes)  | '\u0000' (ou 0)           | '\uffff' (ou 65.535)       | '\u0000'     |
| boolean| 1 (não def.)   | false                     | true                       | false        |

Esses tipos primitivos são essenciais para a programação em Java, fornecendo uma base eficiente e direta para a manipulação de dados simples.

# Declaração de Variáveis

Uma variável é uma identificação de um espaço na memória utilizado pelo programa. Seguindo as convenções das linguagens de programação, toda variável é composta por: tipo de dado + identificação + valor atribuído.

A estrutura padrão para declarar uma variável é:

```java
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
```

Exemplos:

```java
int idade; // Tipo "int", nome "idade", sem valor atribuído.
int anoFabricacao = 2021; // Tipo "int", nome "anoFabricacao", valor 2021.
double salarioMinimo = 2500.00; // Tipo "double", nome "salarioMinimo", valor 2500.00.
```

## Peculiaridades com Tipos Específicos

Alguns tipos de dados têm particularidades. Veja o exemplo abaixo:

```java
public class TipoDados {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, talvez precise ser de outro tipo
        long cpf = 98765432109L; // Se começar com zero, talvez precise ser de outro tipo
        float pi = 3.14F;
        double salario = 1275.33;
    }
}
```

Observe que o tipo `long` precisa terminar com `L`, o tipo `float` precisa terminar com `F`, e algumas situações podem exigir alterações nos tipos de dados convencionais.

## Fortemente Tipado

Java é uma linguagem fortemente tipada. Considere o exemplo abaixo:

```java
// TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal; // Isso não é permitido pelo Java.
```

Mesmo sabendo que `numeroNormal` cabe em um `short`, Java não permite tal conversão direta.

## Variáveis e Constantes

Uma variável é uma área de memória associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e operações. Java é uma linguagem fortemente tipada, diferentemente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

Em Java, utilizamos identificadores que representam uma referência a um valor em memória, e esta referência pode ser redirecionada para outro valor, daí o nome "variável".

Constantes são valores que, uma vez declarados, não podem ser modificados. Em Java, utilizamos a palavra reservada `final` para declarar constantes. Por convenção, constantes são escritas em CAIXA ALTA.

### Exemplo de Variáveis e Constantes

```java
public class ExemploVariavel {
    public static void main(String[] args) {
        /*
         * Esta linha é considerada uma declaração de variável.
         * Iniciamos a existência da variável numero com valor 5.
         * Regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * Na linha abaixo, alteramos o valor da variável para 10.
         * Observe que o tipo não é mais necessário, pois a variável já foi declarada anteriormente.
         */
        numero = 10;

        System.out.print(numero);

        /*
         * Ao usar a palavra reservada final, você determina que esta variável
         * jamais poderá obter outro valor.
         * A linha 25 vai apresentar um erro de compilação, pois isso é considerado uma CONSTANTE na linguagem Java.
         */
        final double VALOR_DE_PI = 3.14;

        VALOR_DE_PI = 3.15; // Esta linha vai apresentar erro de compilação!
    }
}
```

Para declarar uma variável como uma constante, utilizamos a palavra `final`. Por convenção, estas variáveis são escritas em CAIXA ALTA.
