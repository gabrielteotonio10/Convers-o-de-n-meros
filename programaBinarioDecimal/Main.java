package programaBinarioDecimal;
import java.util.Scanner;

public class Main {
    
    private static final Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.println("\n------MENU------\n");
        System.out.println("1- Converter binário em decimal");
        System.out.println("2- Converter decimal em binário");
        System.out.println("3- Sair");
    }
    
    static int escolha() {
        int x = 0;
        boolean erro = true;
        while (erro) {
            System.out.print("Digite o que deseja: ");
            x = scanner.nextInt();
            if (x > 0 && x < 4) {
                erro = false;
            } else {
                System.out.println("Erro: Apenas números de 1 a 3");
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa!\n");
        int x;
        do {
            menu();
            x = escolha();
            switch (x) {
                case 1:
                    Opcao1.opcao1();
                    break;
                case 2:
                    //opcao2();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    break;
            }
        } while (x != 3);
        System.out.println("\nObrigado por usar o programa!\n");
        scanner.close();
    }
}