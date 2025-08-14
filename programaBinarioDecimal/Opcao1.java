package programaBinarioDecimal;
import java.util.Scanner;

public class Opcao1 {
        
    private static final Scanner scanner = new Scanner(System.in);

    static void conversao(float numFloat)
    {
        int numInt= (int) numFloat;
        float numConvertido= 0;
        int acumulador= 1;
        while(numInt!=0)
        {
            int resto= numInt%10;
            if(resto==1) numConvertido= numConvertido+acumulador;
            numInt /= 10;
            acumulador *= 2;
        }
        System.out.println("Número convetido: ");
        System.out.println(numFloat + "(2) = " + numConvertido + "(10) ");
    }

    static boolean verificacao(float numFloat)
    {
        int num= (int) numFloat;
        boolean teste= true;
        if(num<0) teste= false;
        while (teste && num>0) {
            int digito = num % 10;
            if(digito!=0 && digito!=1) teste= false;
            num /=10;
        }
        return teste;
    }

    static void numeroBinario()
    {
        float num=0;
        boolean erro= true;
        while (erro)
        {
            System.out.print("Digite o número binário: ");
            num= scanner.nextInt();
            if(verificacao(num)) erro= false;
            else System.out.println("Erro: Apenas número binário");
        }
        conversao(num);
    }
    
    static int escolha()
    {
        int x=0;
        boolean erro= true;
        while (erro)
        {
            System.out.print("Digite o que deseja: ");
            x= scanner.nextInt();
            if(x>0 && x<3) erro= false;
            else System.out.println("Erro: Apenas números de 1 a 2");
        }
        return x;
    }

    public static void opcao1()
    {
        int x;
        do{
            System.out.println("\n------Binário para decimal------\n");
            System.out.println("1- Digitar número");
            System.out.println("2- Menu");
            x= escolha();
            switch (x) {
                case 1:
                    numeroBinario();
                    break;
            
                default:
                    break;
            }
        }
        while(x!=2);
    }
}
