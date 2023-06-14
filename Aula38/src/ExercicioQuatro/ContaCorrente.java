package ExercicioQuatro;

import java.math.BigDecimal;

public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
       this.saldo = saldo;
    }

    public void depositoConta(double valor){
        setSaldo(getSaldo() + (valor));
        System.out.println("Seu saldo é: " + saldo);

    }
    public void saqueConta(double valor){
        if (saldo < 5){
            System.out.println("Não pode sacar");
        } else {
            System.out.println("Saque efetuado");
            setSaldo(getSaldo() - (valor));
            System.out.println("Seu saldo é: " + saldo);
        }
    }

}
