import java.util.Scanner;

/*
    Laço de repetição for
    for(DECLARAR_CONTADOR, CONDIÇÃO, INCREMENTO){
        ...instruções...
    }
    Ao digitar for, selecione fori para criar a estrutura automaticamente



* */
public class OutraClasse {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quantas vezes serei executado: ");
        int vezes = ler.nextInt();
        for (int i = 1; i <= vezes; i++){
            System.out.println("Execução de número: "+ i);
        }
    }
}
