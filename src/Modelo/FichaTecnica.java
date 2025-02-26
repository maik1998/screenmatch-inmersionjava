package Modelo;

public class FichaTecnica {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private String sinopsis;
    private int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("****FICHA TÉCNICA****");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos");
    }
}
