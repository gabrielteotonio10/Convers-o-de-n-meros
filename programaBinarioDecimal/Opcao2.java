package programaBinarioDecimal;

import java.util.Scanner;

public class Opcao2 {
    //Scanner
    private static final Scanner scanner = new Scanner(System.in);
    //Conversão decimal para binário
    static void conversao(float num)
    {
        //Parte inteira
        int numInt= (int) num;
        String binarioInt = "";
        if (numInt == 0) {
            binarioInt = "0";
        } else {
            while (numInt > 0) {
                int resto = numInt % 2;
                binarioInt = resto + binarioInt;
                numInt /= 2;
            }
        }
        //Parte decimal
        String binarioFloat = ""; 
        float numFloat = num - (int) num;
        int i = 0;
        
        if (numFloat > 0) {
            binarioFloat += "."; 
            while (numFloat > 0 && i < 10) { 
                numFloat *= 2;
                int digito = (int) numFloat;
                binarioFloat += digito;
                numFloat -= digito;
                i++;
            }
        }
        //Mensagens 
        System.out.println("Número convetido: ");
        System.out.println(num + "(10) = " + binarioInt + binarioFloat + "(2) ");
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