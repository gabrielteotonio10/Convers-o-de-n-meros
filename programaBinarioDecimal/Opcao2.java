package programaBinarioDecimal;

import java.util.Scanner;

public class Opcao2 {
    //Scanner
    private static final Scanner scanner = new Scanner(System.in);
    //Conversão decimal para binário
    static void conversao(float num)
    {
        int numInt= (int) num;
        float numConvertido= 0;
        float acumulador= 1;
        while(numInt>=1)
        {
            int resto= numInt%2;
            if(resto!=0) numConvertido += acumulador;
            acumulador *=10;
            numInt /= 2;
        }

        numInt= (int) num;
        float numFloat= num- numInt;
        int i=0;
        acumulador= 0.1f;
        while (i<10) {
            numInt= (int) numFloat*2;
            if(numInt==1) numConvertido+= acumulador;
            else ;
            numFloat *=2 - numInt;
            acumulador /= 10;
            i++;
        }
        System.out.println("Número convetido: ");
        System.out.println(num + "(10) = " + numConvertido + "(2) ");
    }
    //Digitar número decimal
    static void numeroDecimal()
    {
        float num=0;
        String numString;
        System.out.print("Digite o número decimal: ");
        numString= scanner.next();
        num= Float.parseFloat(numString);
        conversao(num);
    }
    //Escolhen opção
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
