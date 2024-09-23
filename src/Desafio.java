import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    // Data client
    String nombre = "Tony Stark";
    String tipoDeCuenta = "Corriente";
    double saldo = 1599.99;
    int opcion = 0;

    // Writing the output of the data client
    System.out.println("    ***************************************");
    System.out.println("    ***************************************");
    System.out.println("    **  Nombre del cliente: " + nombre + "   **");
    System.out.println("    **  El tipo de cuenta es: " + tipoDeCuenta + "  **");
    System.out.println("    **  Su saldo disponible es: $" + saldo + " **");
    System.out.println("    ***************************************");
    System.out.println("    ***************************************");

    // Creation of options for the user
    String menu = """
          _____________________________________________
          |   Escriba el número de la opción deseada   |
          |____________________________________________|

        1 - Consultar saldo
        2 - Retirar
        3 - Depositar
        4 - salir
        """;

    // Open the listening of keyboard
    Scanner keyboard = new Scanner(System.in);

    // Creation of body an the loop of the complete aplication
    while (opcion != 4) {
      System.out.println(menu);
      opcion = keyboard.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("\nEl saldo actual de su cuenta es: $" + saldo + "\n");
          break;
        case 2:
          System.out.println("\n¿Cuál es el monto a retirar?");
          double retiro = keyboard.nextDouble();

          if (saldo < retiro) {
            System.out.println("Saldo insuficiente.");
          } else {
            saldo -= retiro;
            System.out.println("El monto restante es de: $" + saldo + "\n");
          }
          break;
        case 3:
          System.out.println("\n¿Cuál es el monto a depositar?");
          double depositoMonto = keyboard.nextDouble();
          saldo += depositoMonto;
          System.out.println("El monto total es de: $" + saldo + "\n");
          break;
        case 4:
          System.out.println("\n---- Cerrando programa, ¡vuelva pronto! ----");
          break;
        default:
          System.out.println("\n°° La opción no existente, elige una de las existentes °°");
          break;
      } // Switch key close
    } // while key close
    // keyboard closing
    keyboard.close();
  } // static key close
} // puclic class key close
