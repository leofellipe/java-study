public class Matriz {
  public static void main(String[] args) throws Exception {
    int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    Double total = 0.0;
    int contador = 0;

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        total += matriz[i][j];
        contador++;
      }
    }
    System.out.println("Média: " + (total / contador));

  }

}