import com.backend.screenmatch.calculos.CalculadoraTiempo;
import com.backend.screenmatch.calculos.FiltroRecomendacion;
import com.backend.screenmatch.modelos.Episodio;
import com.backend.screenmatch.modelos.Pelicula;
import com.backend.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalEvaluaciones());
//        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

       CalculadoraTiempo calculadora = new CalculadoraTiempo();
       calculadora.incluye(miPelicula);
       calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);









//        com.backend.screenmatch.modelos.Pelicula otraPelicula = new com.backend.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//
//        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es " + otraPelicula.fechaDeLanzamiento);
    }
}
