public class Pilha {

  public int[] pilha;
  public int posicaoPilha;

  public Pilha() {
    this.pilha = new int[10];
    this.posicaoPilha = -1;
  }

  public void empilhar(int valor) {

    if (this.posicaoPilha < this.pilha.length - 1) {
      this.posicaoPilha++;
      this.pilha[this.posicaoPilha] = valor;
    }

  }

  public void mostrarPilha() {
    for (int i = this.pilha.length - 1; i >= 0; i--) {
      if (this.pilha[i] != 0) {
        System.out.println("|" + this.pilha[i] + "|");
      }
    }
  }

}
