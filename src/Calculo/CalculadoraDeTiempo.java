package Calculo;
import Modelo.FichaTecnica;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(FichaTecnica fichaTecnica) {
        tiempoTotal += fichaTecnica.getTiempoDeDuracionEnMinutos();


    }
}
