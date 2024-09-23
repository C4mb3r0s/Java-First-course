public class Main {
  public static void main(String[] args) {
    System.out.println("Bienvenido(a) a Screen Match");
    System.out.println("Película: Matrix");

    // Variable de tipo entenro
    int fechaDeLanzamiento = 1999;
    // Variable tipó boolean
    boolean incluidoEnElPlan = true;
    // Vaiable tipo double -> aquellos números que tienen notacion decimal
    double notaDeLaPelicula = 8.2;

    double media = (8.2 + 6.0 + 9.0) / 3;

    System.out.println(media);

    String sinopsis = """
        Matrix es una paradoja
        La mejor película del indel milenio
        Fué lanzada en:
        """ + fechaDeLanzamiento;
    System.out.println(sinopsis);

    int clasificacion = (int) media / 2;
    System.out.println(clasificacion);
  }
}
