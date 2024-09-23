public class Decisiones {
  public static void main(String[] args) {
    int fechaDeLanzamiento = 1999;
    boolean inclidoEnElPlan = true;
    double notaDeLaPelicula = 8.2;
    String tipoPlan = "plus";

    // código de prueba de los operadores relacionales
    if (fechaDeLanzamiento >= 2022) {
      System.out.println("Pelíulas más populares");
    } else {
      System.out.println("Películas retro que aún vale la pena ver");
    }

    if (inclidoEnElPlan && tipoPlan.equals("plus")) {
      System.out.println("Disfruta de su pelíula");
    } else {
      System.out.println("Película no disponible para su plan actual");
    }
  }
}
