package ExercicioTres;

public class CalcularNumPar {
    public boolean verificarSePar(int numero){
        if (numero % 2 == 0){
            System.out.println("O número é par");
            return true;
        } else{
            System.out.println("O número é impar");
        }
        return false;

    }
}
