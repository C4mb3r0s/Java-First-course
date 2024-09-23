public class grados {
  public static void main(String[] args) {
    int celcius = 38;

    int fahrenheit = (int) (celcius * 1.8) + 32;
    System.out.println("""
        Los grados transformados a Fahrenheit son: %d°F
        """.formatted(fahrenheit));
  }
}
