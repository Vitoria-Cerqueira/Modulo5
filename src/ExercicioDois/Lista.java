package ExercicioDois;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista {

     Set<Integer> numeros = new HashSet<>();
     // set é uma interface    hashSet é uma classe que implemeta a interface set
     Scanner teclado = new Scanner(System.in);

     public void adicionarNumero(){
         for (int i = 0; i < 8; i++) {
             System.out.println("Digite um numero inteiro");
             numeros.add(teclado.nextInt());
         }
         System.out.println(numeros);
     }




}
