import java.util.Scanner;
// Clase que se utiliza para lee datos de entrada en un programa de java

public class Lectura {
  public static void main(String[] args) {
    // Llamamos la funcion Scanner para escuchar el teclado, que es como si se
    // estuviera ceando un nuevo objeto
    Scanner teclado = new Scanner(System.in);

    System.out.println("Escribe el nombre de tu película favorita");
    // Se crea una vaiable para agrega el valor ingesado por teclado del usuario
    // dependiendo del tipo de dato
    String pelicula = teclado.nextLine();

    System.out.println("Ahora escribe la fecha de lanzamiento: ");
    int fechaDeLanzamiento = teclado.nextInt();

    System.out.println("Dinos la nota de la película: ");
    double nota = teclado.nextDouble();

    System.out.println(pelicula);
    System.out.println(fechaDeLanzamiento);
    System.out.println(nota);

    teclado.close(); // -> Se cierra el scanner
  }
}
