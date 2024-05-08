package Modelo;
import Interface.IStreaming;

public class Pelicula extends FichaTecnica implements IStreaming {
    private String director;
    private boolean incluidoEnElPlanBasico;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    @Override
    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }
}
