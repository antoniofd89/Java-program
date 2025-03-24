package br.com.POO.polimorfismo;

/*
 * Polimorfismo dinâmico - runtime
 * comportamento varia dependendo da instância
 */
public class Main {
    public static void main(String[] args) {
        Trabalhador [] trabalhadores = {new Programador(), new Cozinheiro(), new Medico()};
        Empregado empregado = new Empregado();
        Empregado programador = new Programador();//tipo mais generico - EMPREGADO, tras o atributo da super classe.

        System.out.println(empregado.nome);
        System.out.println(programador.nome);
        trabalhar(trabalhadores);

        
            }
        
            private static void trabalhar(Trabalhador[] trabalhadores) {
               for (Trabalhador trabalhador : trabalhadores) {
                trabalhador.trabalhar();
                if (trabalhador instanceof Cozinheiro)
                ((Cozinheiro)trabalhador).temperarComida();//Casting de polimorfismo.
               }
            }
}
