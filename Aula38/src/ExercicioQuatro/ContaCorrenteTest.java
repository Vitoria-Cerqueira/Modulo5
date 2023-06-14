package ExercicioQuatro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTest {

    @Test
    public void verificarSeODepositoFunciona(){
        ContaCorrente conta = new ContaCorrente(1234, "Vitoria", 1000);
        conta.depositoConta(200);
        assertEquals(1200, conta.getSaldo());
    }
    @Test
    public void verificarSeOSaqueFunciona(){
        ContaCorrente conta1 = new ContaCorrente(2123,"Victoria", 1000);
       conta1.saqueConta(300);
       assertEquals(700, conta1.getSaldo());
    }
}
