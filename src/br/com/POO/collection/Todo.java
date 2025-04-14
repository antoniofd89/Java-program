package br.com.POO.collection;

public class Todo {
   private String titulo;
   private boolean concluida;
   
   public Todo(String titulo) { //Cria uma instancia de Todo com o titulo especifico
       this.titulo = titulo;
   }
   
   public void concluir() { // Marca a tarefa como concluida
       this.concluida = true;
   }
   
   public String getTitulo() { // Retorna o titulo da tarefa
       return this.titulo;
   }
   
   public boolean isConcluida() { // Retorna se a tarefa foi concluida ou não.
       return this.concluida;
   }
   
   public boolean equals(Object todo) { //Compara duas tarefas com base em seus titulos.
       return this.titulo.equals(((Todo) todo).getTitulo());
   }
}