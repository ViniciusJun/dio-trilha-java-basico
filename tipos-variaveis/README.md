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

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
