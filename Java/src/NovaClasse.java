import java.util.Scanner;
/*
    Link métodos java
    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html

    Digite "main" e use o atalho TAB para criar uma classe main automaticamente
    Digite "sout" e use o atalho TAB para criar um System.out.Println() automaticamente

    Estrutura condicional (recomendado quando existem poucas condições)
    if("CONDIÇÃO"){
        ...instruções para true...
    }
    else{
        ...instruções para false...
    }

    -Dica: para comparar strings, utilize equals( ) ao invés de ==

    Estrutura de casos (recomendado quando existem muitas condições)
    switch("CONDIÇÃO"){
        case valor 1:
            ...instruções para valor 1...
            break;
        case valor 2:
            ...instruções para valor 2...
            break;
        case valor 3:
            ...instruções para valor 3...
            break;
        default:
            ...intruções para valor diferente...
            break;
    }
    -Não há limite para cases, o break faz a execução sair da estrutura;

    Receber dados
    Scanner "NOMEIE" = new Scanner(System.in);
    A IDE deve importar a classe java.util.Scanner automaticamente, System.in é o parâmetro que diz que o scanner
    receberá dados do teclado.
        Para criar a linha de receber dados, faça
            "TIPO" "VARIÁVEL" = "NOME_DO_SCANNER".next...();
            Use:
            para inteiros, nextInt();
            para strings, nextLine();
    -Dica: nossa IDE está configurado para linguagem pt-br, portanto na hora de inserir dados, não se usa "." para
    decimais, use ","

*/
public class NovaClasse {
    public static void main(String[] args) {
        boolean verdade = false;
        Scanner leia = new Scanner(System.in);
        if(verdade){
            System.out.println("Verdade aqui");
        }
        else{
            System.out.println("Mentira aqui");
        }
        String cor = leia.nextLine();
        switch (cor){
            case "vermelho":
                System.out.println("Cor vermelha identificada");
                break;
            case "azul":
                System.out.println("Cor azul identificada");
                break;
            case "amarelo":
                System.out.println("Cor amarela identificada");
                break;
            case "verde":
                System.out.println("Cor verde identificada");
                break;
            default:
                System.out.println("Cor não identificada, digite um valor maior que 18: ");
                int numero = leia.nextInt();
                if(numero > 18){
                    System.out.println("Confirmado");
                }
                else{
                    System.out.println("Valor incorreto");
                }
                break;
        }
    }
}
