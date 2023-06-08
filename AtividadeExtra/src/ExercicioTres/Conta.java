package ExercicioTres;

public class Conta {

    private double saldo;
    private double limite;

  public Conta(){
      this.saldo = 1500;
  }

    public void setLimite(double limite) {
        this.limite = limite;
        System.out.println("Seu limite é R$" + limite);
    }

    public double deposita(double valor){
      System.out.println("Deposito efutuado com sucesso. Seu saldo é R$" + saldo );
      return saldo += valor;
  }

  public void saca(double valor) throws ContaExcecao{
      try {
          if (valor <= saldo){
              saldo -= valor;
              System.out.println("Saque realizado no valor de R$" + valor);
          }else {
              throw new ContaExcecao("Saldo insuficiente");
          }
      }catch (ContaExcecao err){
          System.out.println(err.getMessage());
          System.out.println("Saldo disponivel é R$" + saldo); // resolução do exercicio 4
      }



  }


}
