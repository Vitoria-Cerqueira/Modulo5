package ExercicioTres;

public class Main {
    public static void main(String[] args) throws ContaExcecao {
            Conta minhaConta = new Conta();
            minhaConta.deposita(100);
            minhaConta.setLimite(100);
            minhaConta.saca(1000);
    }
}
