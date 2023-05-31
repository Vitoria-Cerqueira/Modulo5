package ExercicioQuatro;

import java.util.Map;

public class ContaCorrente extends Conta implements CalculoTributos{

    public ContaCorrente(){
        System.out.println("Informe seu CPF e Nome");
        cadastro.put(teclado.next(), teclado.next());
    }
    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadastro.entrySet()) {
            System.out.println("CPF: " + dados.getKey() + "\nNome: " + dados.getValue() + "\nSaldo: " + getSaldo());

        }
    }
    @Override
    public double calcularTributo(double saldo) {
        System.out.println("O valor do tributo é: " + (saldo * 0.01));
        System.out.println("Seu saldo ficará: ");
        return saldo - (saldo * 0.01);
    }

}
