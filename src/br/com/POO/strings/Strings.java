package br.com.POO.strings;

import java.util.Arrays;

public class Strings {
    
    /*
     * Strings
     * diferença  - String texto= "texto"(Utiliza o pool de strings - economia de mémoria na JVM) 
     * - new String ("Texto")
     * Imutabilidade
     * Strings são um conjunto de caracter
     */
    public static void main(String[] args) {
        String texto = "Texto customizado";
    String outroTexto = new String("Outro Texto"); // Tipo de referência usa o new - endereço de mémoria diferente

    char[] texto1Array = texto.toCharArray();

    //percorrendo um array de strings
    for(char letra: texto1Array){
        if(letra == 'a'){
            System.out.println("Encontrou o a");
        }
    }
     System.out.println(texto.charAt(0));// primeira posição do array de string
     System.out.println(texto.length() - 1 );//ultima posição da string

     // Maiusculo e Minusculo (Capitalizar)
    System.out.println(texto.toUpperCase());
    System.out.println(texto.toLowerCase());

    // dividindo uma string
    String [] palavras = texto.split(" ");
    System.out.println(Arrays.toString(palavras));

    //conversão - cast de tipos
    String idade = "35";
    Integer idadeInt = Integer.valueOf(idade);
    idadeInt+=20;
    String idadeStr = String.valueOf(idadeInt);
    idadeStr+=" de idade";
    System.out.println(idadeInt);
    System.out.println(idadeStr);

    //String builder
    String concatenacao = " Ela "+ " é " + " muita" + "comum";
    StringBuilder builder = new StringBuilder();
    builder.append("Ela");
    builder.append("é");
    builder.append("muito");
    builder.append("comum");

    System.out.println(builder.toString());

    //Strings formatadas
    String nome = "Antonio";
    String sobrenome = "dias";
    String email = "a.faria.dias@gmail.com";
        String textoFormatado = " Meu primeiro nome é : %s sobrenome:  %s e email : %s"
        .formatted(nome, sobrenome, email);
        System.out.println(textoFormatado);

    /// para strings grandes podemos fazer o seguinte:
        String textoFormatadoVariasLinhas = """
                Meu primeiro nome é : %s sobrenome:  %s e email : %s"
                e estou estudando java.
                """
        .formatted(nome, sobrenome, email);
        System.out.println(textoFormatadoVariasLinhas);

    }
}
