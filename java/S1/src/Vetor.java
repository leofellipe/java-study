public class Vetor {
    public static void main(String[] args) throws Exception {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }

        System.out.println("Média: " + (total / vetor.length));
    }
}
