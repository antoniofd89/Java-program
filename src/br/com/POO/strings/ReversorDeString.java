package br.com.POO.strings;

public class ReversorDeString {


    public String reverterString (String texto){
        String textoRevertido = "";
        for(int i = texto.length() - 1; i>= 0 ; i-- ){
            textoRevertido += texto.charAt(i);
        }
       return textoRevertido;
    }

    public String reverterStringBuilder(String texto){
        return new StringBuilder(texto).reverse().toString();
    }

    public String leituraEsquerdaParaDireita(String texto){
        String textoEmOrdem = "";
        for(int i = 0; i<= texto.length(); i++){
            textoEmOrdem += texto.charAt(i);
        }
        return textoEmOrdem;
    }
}