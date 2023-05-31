package ExercicioQuatro;

import java.util.Map;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        System.out.println("Informe seu Nome e CPF");
        cadastro.put(teclado.next(), teclado.next());

    }


    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadastro.entrySet()) {
            System.out.println("Nome: " + dados.getKey() + "\nCPF: " + dados.getValue() + "\nSaldo: " + getSaldo());

        }
    }

}

