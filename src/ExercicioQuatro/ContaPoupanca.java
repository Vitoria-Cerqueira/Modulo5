package ExercicioQuatro;

import java.util.Map;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        System.out.println("Informe seu CPF e Nome");
        cadastro.put(teclado.next(), teclado.next());

    }


    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadastro.entrySet()) {
            System.out.println("CPF: " + dados.getKey() + "\nNome: " + dados.getValue() + "\nSaldo: " + getSaldo());

        }
    }

}

