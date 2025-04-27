public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    double sumaDeLasEvaluaciones;
    int totalEvaluaciones;

    //Ahorrando codigo con un método
    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es " + fechaDeLanzamiento);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }
}
