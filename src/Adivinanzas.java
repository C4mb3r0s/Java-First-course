import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
  public static void main(String[] args) {
    // Said hello to the players
    System.out.println("""
        ¡Bienvenido a números al azar!

        Ahora tienes 5 oportunidades para adivinar un número del 0 al 100
        """);

    // variable declaration and assignament
    int secretNumber = new Random().nextInt(101);
    int intentos = 0;
    int numberOfUser = 0;
    Scanner teclado = new Scanner(System.in);

    // Making the loop for the correct funcionament of the game while (intentos <=
    while (intentos <= 4) {
      System.out.println("Adivina el número: ");
      numberOfUser = teclado.nextInt();

      // Comparation of the variables
      if (numberOfUser == secretNumber) {
        System.out.println("Felicidades, encontraste el número.");
        break;
      } else {
        if (numberOfUser < secretNumber) {
          System.out.println("Ya casi lo consigues, el número es mayor a: " + numberOfUser + ". ¡Intentalo de nuevo!");
        } else {
          System.out.println("Ya casi lo consigues el número es menor a: " + numberOfUser + ". ¡Intentalo de nuevo!");
        }
      }

      // Increment of variable 'intentos'
      intentos++;

      if (intentos == 5 && numberOfUser != secretNumber) {
        System.out.println("""
            ¡Haz perdido! el numero secreto era: %d
            """.formatted(secretNumber));
      }

    } // close while
    // Closing the keyboard reading
    teclado.close();
  } // public static
} // public class
