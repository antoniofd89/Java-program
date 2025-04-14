package br.com.POO.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionsBasic {
    public static void main(String[] args) {
        //String [] nome = {"Antonio", "Thayane"};
        List<String> nomeArrayList = new ArrayList<>(); // Declarar com o tipo da interface - "List"

        //Adicionando valores ao ArrayList

        nomeArrayList.add("1");
        nomeArrayList.add("2");
        nomeArrayList.add("3");

        System.out.println(nomeArrayList);

        // Get
        System.out.println(nomeArrayList.get(0));
        System.out.println(nomeArrayList.get(1));
        //Insert
        System.out.println(nomeArrayList.set(0, "0"));
        System.out.println(nomeArrayList.set(1,"4"));
        // Update
        System.out.println(nomeArrayList.get(0));
        System.out.println(nomeArrayList.get(1));
        // Delete
        System.out.println(nomeArrayList.remove(0));// remover por index
        System.out.println(nomeArrayList.remove("4"));// remover por valor
        // sort - lista ordenada

        Collections.sort(nomeArrayList);// ordenação

        // percorrendo um array
        for (String nome : nomeArrayList) {
            System.out.println(nome);
        }
        // iterator

        Iterator<String> it = nomeArrayList.iterator();
        while (it.hasNext()){
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }
        //Conversões de Array/ArrayList

        List<String> listaDeNome= List.of("Texto1","Texto2");
        System.out.println(listaDeNome);

        // Convertendo de Array para Lista
        String [] arrayDeNomes = {"Texto1","Texto2", "Texto3","Texto4"};
        List<String> listaConvertida = Arrays.asList(arrayDeNomes);
        System.out.println(listaConvertida);
        //Array Convertido
        String [] arrayConvertido = listaConvertida.toArray(new String[0]);   
        System.out.println(arrayConvertido); 

        // Conjunto de chave e valor - Map

        Map<String,String> mapaDeUsuarios = new HashMap <>();
        mapaDeUsuarios.put("Texto1", "texto1");
        System.out.println(mapaDeUsuarios);

        // Obtendo valores no map pela chave
        System.out.println(mapaDeUsuarios.get("Texto1"));

        // iteração em maps - valores

        for (String valores : mapaDeUsuarios.values()) {
            System.out.println(valores);;
        }
        // iteração em maps - chaves

        for (String valores : mapaDeUsuarios.keySet()) {
            System.out.println(valores);;
        }
    }
}