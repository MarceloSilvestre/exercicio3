import java.util.Scanner;

//Faça um Programa que peça dois números e imprima a soma.

public class exercicio3 {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("primeiro numero ");
        double n1 = teclado.nextDouble();

        System.out.println("segundo numero");
        double n2 = teclado.nextDouble();

        teclado.close();

        double soma = n1 + n2;

        System.out.println("a soma dos números é " + soma);


    }
    
}
