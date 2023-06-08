package ExercicioDois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        boolean valoresValidos = false;

        while (!valoresValidos){
            try {
                System.out.println("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                if (x == 0){
                    throw new ArithmeticException("Não pode divisão por zero");
                }
                System.out.println("Informe o segundo valor: ");
                int y = teclado.nextInt();

                double r = ((double) x / y);
                System.out.println("O resultado da soma é " + r);

                valoresValidos = true;

            }catch (InputMismatchException errInput) {
                System.out.println("Informe um numero inteiro");
                teclado.nextLine();
            } catch (ArithmeticException errNumber){
                System.out.println("Divisão por zero não é permitido");
            }

        }

    }
}
