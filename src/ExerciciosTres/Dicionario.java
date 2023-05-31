package ExerciciosTres;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionario1 = new HashMap<>();

    public void adicionarDados(){
        dicionario1.put("bola", "azul");
        dicionario1.put("boneca", "amarela");
        dicionario1.put("dado", "rosa");

        for (Map.Entry<String, String> entry : dicionario1.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Cor: " + entry.getValue());
        }
    }





}
