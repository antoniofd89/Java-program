package br.com.POO.polimorfismo;

import java.util.Arrays;

/*
 * Polimorfismo com generics
 */
public class ImpressaoGenerics {
    public static void main(String[] args) {
        Trabalhador [] trabalhadores = {new Programador(), new Cozinheiro(), new Medico()};

        imprimir(trabalhadores);
        imprimir(new Integer []{1,2,3});
        imprimir(new String[]{"texto1","texto2","texto3"});
            }
        
            private static <T> void imprimir(T[] trabalhadores) {
                System.out.println(Arrays.toString(trabalhadores));
            }
}
