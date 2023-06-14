package ExercicioDois;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularDiaSemanaTest {

    @Test
    public void testarMelhorDia(){
        CalcularDiaSemana calcular = new CalcularDiaSemana();
        String teste = calcular.diaSemana("Segunda");
        assertEquals("Domingo",teste);
    }


}
