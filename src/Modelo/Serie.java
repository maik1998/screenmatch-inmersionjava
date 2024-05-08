package Modelo;

import Interface.IStreaming;

public class Serie extends FichaTecnica implements IStreaming {

    private boolean isIncluidoEnElPlanBasico;
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    @Override
    public boolean isIncluidoEnElPlanBasico() {
        return isIncluidoEnElPlanBasico;
    }

    @Override
    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        isIncluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }
}
