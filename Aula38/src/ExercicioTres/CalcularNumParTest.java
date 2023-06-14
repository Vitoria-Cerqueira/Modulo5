package ExercicioTres;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularNumParTest {
    @Test
    public void testarSeONumeroEPar(){
        CalcularNumPar calcular = new CalcularNumPar();
        boolean valor = calcular.verificarSePar(2);
        assertEquals(true,valor);
    }
}
