package ExercicioQuatro;

import java.util.*;

public class Conta {
    Scanner teclado = new Scanner(System.in);
    public Map<String, String> cadastro = new HashMap<>();

    protected double saldo;

    public Conta() {
        this.saldo = 1000;
    }

    public double getSaldo() {
        return saldo;
    }

    public void decisao(){

        System.out.println("Seu saldo é: " + saldo);
        System.out.println("Você deseja acessar: \n1- Conta Poupança \n2- Conta Corrente \n3- Seguro de Vida");
        switch (teclado.nextInt()){
            case 1:
                ContaPoupanca cp = new ContaPoupanca();
                cp.mostrarDados();
                break;



            case 2:
                ContaCorrente acc = new ContaCorrente();
                acc.mostrarDados();
                System.out.println(acc.calcularTributo(saldo));
                break;

            case 3:
                SeguroVida sv = new SeguroVida();
                sv.mostrarDados();
                System.out.println(sv.calcularTributo(saldo));

            default:
                System.out.println("Opção invalida");
                System.exit(0);
        }
    }

}
