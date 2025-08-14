package programaBinarioDecimal;

import java.util.Scanner;

public class Opcao2 {
    private static final Scanner scanner = new Scanner(System.in);

    static void conversao(float numFloat)
    {
        int numInt= (int) numFloat;
        float numConvertido= 0;
        int acumulador= 1;
        while(numInt>1)
        {
            int resto= numInt%2;
            if(resto!=0) numConvertido += acumulador;
            acumulador *=10;
            numInt /= 2;
        }
        System.out.println("Número convetido: ");
        System.out.println(numFloat + "(10) = " + numConvertido + "(2) ");
    }

    static void numeroDecimal()
    {
        float num=0;
        System.out.print("Digite o número decimal: ");
        num= scanner.nextInt();
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

    static void opcao2()
    {
        int x;
        do{
            System.out.println("\n------Decimal para binário------\n");
            System.out.println("1- Digitar número");
            System.out.println("2- Menu");
            x= escolha();
            switch (x) {
                case 1:
                    numeroDecimal();
                    break;
            
                default:
                    break;
            }
        }
        while(x!=2);
    }
}
