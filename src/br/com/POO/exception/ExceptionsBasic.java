package br.com.POO.exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasic { // exceções interrompem o fluxo do código.

  public static void main(String[] args) throws Exception {

    //dividir(1,0);
    dividirNovo(1, 0);

  }
  // Exceções checáveis - herdam da Exception
  private static int dividir(int i , int j) throws Exception {
    if (j==0) throw new Exception("Não é possivel realizar divisão por zero");
   return i/j;
}
// Exceções não checáveis - RunTimeException
private static int dividirNovo(int i , int j) {
    if (j==0) throw new DivisaoPorZero("Não é possivel realizar divisão por zero");
   return i/j;
}

  private static void getNomes() {
    List<String> nomes = new ArrayList<>();
    nomes.add("Antonio");

    try {
        //System.out.println(nomes.get(1));
        int resultado = 10/0;
    } catch (IndexOutOfBoundsException ex ) {
        //ex.printStackTrace(); // pilha de erros.
        System.out.println("O indice informado não é válido.");
    }catch (ArithmeticException ex ) {
        //ex.printStackTrace(); // pilha de erros.
        System.out.println("Expressão aritmetica inválida.");
    }
  }

}