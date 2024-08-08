public class TiposVariaveis {
    @SuppressWarnings("unused") //usado para suprimir avisos de erros de convencoes java
    public static void main(String[] args) throws Exception {
        
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo em forma de string
		float pi = 3.14F;
		double salario = 1275.33;

        //Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Por mais que tenhamos ciência do valor quenumeroNormal cabe é um short, o Java não permite correr o risco. pois o Java é fortemente tipado.

        //para declarar uma variavel que o seu valor atribuido nao seja modificado você tera que adicionar no inicio da linha o comando "Final" e o nome da variavel em CAIXA_ALTA, ex:
        final double VALOR_DE_PI = 3.14;
    }
}
