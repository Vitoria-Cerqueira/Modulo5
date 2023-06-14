package ExercicioDois;

public class CalcularDiaSemana {
    String dia = "Domingo";

    public String diaSemana(String entrada) {
        if (getDia().equals(entrada)) {
            System.out.println("Domingo é o melhor dia de feira");
        }else {
            System.out.println("Não é o melhor dia para ir à feira");
        }
        return entrada;
    }

    public String getDia() {
        return dia;
    }
}
