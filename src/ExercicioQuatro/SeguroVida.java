package ExercicioQuatro;

import java.util.Map;

public class SeguroVida extends Conta implements CalculoTributos {

    public SeguroVida(){
        System.out.println("Informe seu Nome e CPF");
        cadastro.put(teclado.next(), teclado.next());
    }
    public void mostrarDados(){
        for (Map.Entry<String, String> dados : cadastro.entrySet()) {
            System.out.println("Nome: " + dados.getKey() + "\nCPF: " + dados.getValue() + "\nSaldo: " + getSaldo());

        }
    }
    @Override
    public double calcularTributo(double saldo) {
        System.out.println("O valor do seguro de vida é: " + 42);
        System.out.println("O saldo ficará: ");
        return saldo - 42.0;


    }
}
