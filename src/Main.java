import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre = "Matriz";
        String sinopsis = """
                Hola esta es la descripción de la pelicula""";
        int fechaDeLanzamiento = 1999;
        double evaluacion=4.6;
        double sumaEvaluacion = 0;
        boolean incluidoEnElPlanBasico=true;

        System.out.println("Nombre de la pelicula: "+nombre);
        System.out.println("Sinopsis: "+sinopsis);
        System.out.println("Fecha de lanzamiento: " +fechaDeLanzamiento);
        System.out.println("Evaluación: "+evaluacion);
        System.out.println("Plan Basico? "+incluidoEnElPlanBasico);

        if(fechaDeLanzamiento <= 2023){
            System.out.println("pelicula obsoleta");
        }else{
            System.out.println("pelicula nueva");
        }

        for (int i=0; i<3; i++){
            Scanner teclado= new Scanner(System.in);
            System.out.println("Ingresa la nota de la evaluación que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            sumaEvaluacion = sumaEvaluacion + notaMatrix;
        }

        System.out.println("la media de evaluación dada por el usuario es: "+sumaEvaluacion/3);
    }
}