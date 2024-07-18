import java.util.Scanner;
/*
    Estrutura while
    while(CONDIÇÃO){
        ...instruções enquanto CONDIÇÃO = true...
    }
*/
public class MaisUmaClasse {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
            System.out.println("Devo continuar ? (responda true ou false)");
            continuar = ler.nextBoolean();
        }
        System.out.println("while concluido");
    }
}