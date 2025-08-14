package programaBinarioDecimal;
import java.util.Scanner;

public class Opcao1 {
    //Scanner
    private static final Scanner scanner = new Scanner(System.in);
    //Convertendo binário em decimal
    static void conversao(float num)
    {
        //Parte inteira
        int numInt= (int) num;
        float numConvertido= 0.0f;
        float acumulador= 1;
        while(numInt!=0)
        {
            int resto= numInt%10;
            if(resto==1) numConvertido= numConvertido + acumulador;
            numInt /= 10;
            acumulador *= 2;
        }
        //Parte decimal
        numInt= (int) num;
        float numFloat= num- numInt;
        int i=0;
        acumulador= 1f/2;
        numFloat *= 10;
        numInt= (int) numFloat;
        while (i<10 && (numInt==0 || numInt==1)) {
            if(numInt==1) numConvertido= numConvertido + acumulador;
            acumulador /= 2f;
            numFloat -= numInt;
            i++;
            numFloat *= 10;
            numInt= (int) numFloat;
        }
        //Mensagens
        System.out.println("Número convetido: ");
        System.out.println(num + "(2) = " + numConvertido + "(10) ");
    }
    //Verificar se o número é binário
    static boolean verificacao(float num)
    {
        int numVerifica= (int) num;
        boolean teste= true;
        if(numVerifica<0) teste= false;
        while (teste && numVerifica>0) {
            int digito = numVerifica % 10;
            if(digito!=0 && digito!=1) teste= false;
            numVerifica /=10;
        }
        return teste;
    }
    //Digitar número binário
    static void numeroBinario()
    {
        float num= 0;
        String numString;
        boolean erro= true;
        while (erro)
        {
            System.out.print("Digite o número binário[máx 10 casas decimais]: ");
            numString= scanner.next();
            num= Float.parseFloat(numString);
            if(verificacao(num)) erro= false;
            else System.out.println("Erro: Apenas número binário");
        }
        conversao(num);
    }
    //Escolher opção
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
    //Parte principal
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
