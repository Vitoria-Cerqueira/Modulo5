package ExercicioUm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static Scanner teclado = new Scanner(System.in);

    public static List<Integer> listaNumeros = new ArrayList<>();

    public static void adicionarNumero(){

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um numero inteiro");
            listaNumeros.add(teclado.nextInt());
        }
        System.out.println(listaNumeros);
    }
}
