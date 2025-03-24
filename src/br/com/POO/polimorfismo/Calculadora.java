package br.com.POO.polimorfismo;

/*
 * Polimorfismo estático - compile - sobrecarga de métodos.
 * comportamento muda em tempo de compilação
 */
public class Calculadora {
    public static void main(String[] args) {
        System.out.println(soma(10, 20));
            }
        
           static int soma(int a , int b) {
               return a+b;
            }
            static double soma(double a , double b) {
                return a+b;
             }
}
