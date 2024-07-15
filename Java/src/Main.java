public class Main {
    public static void main(String[] args) {
        /*
        *ALT + 1 abre ou  fecha a aba a esquerda da tela do intellij

        *Link com dicas da alura sobre o intellij
        *https://www.alura.com.br/artigos/intellij-idea-dicas-truques-usar-no-dia-a-dia

        *Link sobre a execução
        *https://www.alura.com.br/artigos/jvm-conhecendo-processo-execucao-de-codigo

        *Boas práticas:
        *   MinhaClasse
        *   meuMetodo
        *   MINHA_CONSTANTE
        *   minhaVariavel

        *As diferenças entre JVM, JRE e JDK:

            * JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por
            *  executar o bytecode;

            * JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece
            * as bibliotecas padrões do Java para o JDK compilar o seu código e para a
            * JVM executar o seu programa;

            * JDK (Java Development Kit) - Kit de Desenvolvimento Java responsável por
            * compilar código-fonte em bytecode.

        *   Escrever ... na tela (pode ser valores ou conteúdo dentro de " ", separados por ","
        *   System.out.println(...);

        *Declaração de variáveis
        * TIPO NOME = VALOR;
        * ou
        * TIPO NOME;
        * NOME = VALOR;
        *
        *   Tipos:
        *   int : valores inteiros de -2147483648 a 2147483647
        *   byte : valores inteiros de -128 a 127
        *   boolean: true or false (verdadeiro ou falso)
        *   char : 1 caractere
        *   short : valores inteiros de -32768 a 32767
        *   long : valores inteiros -9223372036854775808 a 9223372036854775807
        *   float : valores decimais com até 7 digitos
        *   double : valores decimais com até 15 digitos
        *   String : conjunto de caracteres

        *Operadores:

        *   Atribuição
        *   valor1 = valor2 : atribui valor2 a valor1
        *   valor1 += valor2 : valor1 será valor1 + valor2

        *   Aritméticos
        *   + : adição
        *   - : subtração
        *   * : multiplicação
        *   / : divisão
        *   % : resto de divisão
        *   (...) : resultado ... único (como na matemática)

        *   Comparação
        *   x == y : x igual y
        *   x != y : x diferente de y
        *   x > y : x maior que y
        *   x >= y : x maior ou igual a y
        *   x < y : x menor que y
        *   x <= y : x menor ou igual a y

        *   Lógicos
        *   && : and
        *   || : or
        *   ! : not

        *   Incremento
        *   ++x : x = x + 1

        *   Comandos
        *
        *   Função equal (retorna true se x = y)
        *   x.equals(y)

        *   Função format
        *   System.out.println(String.format(...);
        *   - Dentro da string "...", poderam ser colocados os %x, aonde x representa o tipo de dado a ser inserido,
        *   as variáveis são consideradas consecutivamente dda seguinte maneira: "1: %s \n 2: %d \n 3: %f",minhaString,
        *   meuInteiro, meuFloat
        *   - o %f (ponto flutuante) também pode receber outro parâmetro, %.xf aonde x é igual ao número de casas
        *   decimais após a virgúla que devem aparecer

        *   Text block
        *   ao dar valores de string com """...""" ao invés de "...", elas respeitarão os espaços e parágrafos
        *   -para usar o format no text-block, siga a sintaxe:
        *   """
               String: %s
               Inteiro: %d
               Float: %.3f
            """.formatted(minhaString, meuInteiro, meuFloat);


        *   Casting (conversão de valores)
        *   A conversão de valores pode ser feita de forma implícita, apenas ao usar o "=" e da seguinte forma
        *   (explicita):
        *   (x) (y)
        *   x= tipo (byte, short, char, int, long, float ou double) e y o valor a ser convertido
        *   Quando usar:
        *   byte: int, long, float, double
        *   short: int, long, float, double
        *   char: int, long, float, double
        *   int: long, float, double
        *   long: float, double

        */
        System.out.println("Hello world!!!");
        System.out.println("Filme: A rede social");
        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: "+anoLancamento);
        boolean incluidoNoPlano = true;
        double media = (10.0 + 15.0 + 5.0 + 20.0)/3;
        System.out.println(media);
        String frase;
        frase = "Aqui está minha frase.";
        String texto;
        texto = """
                Título
                
                1parágrafo
                2parágrago
                3parágrafo  
              """;
        System.out.println(texto);
        int mediaArredondada = (int) (media);
        System.out.println(mediaArredondada);
    }
}