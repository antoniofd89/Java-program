package br.com.POO.collection;

import java.util.HashMap;
import java.util.Map;

public class TodoListMap {
    private Map<String, Todo> todos;
      
      public TodoListMap() {
          this.todos = new HashMap<>();
      }
      
      public void adicionarTarefa(String tarefa) {
          Todo todo = new Todo(tarefa);
          if (!todos.containsKey(tarefa))
              todos.put(tarefa, todo);
      }
      
      public void concluirTarefa(String tarefa) {
          Todo todo = todos.get(tarefa);
          todo.concluir();
      }
      
      public void removerTarefa(String tarefa) {
          todos.remove(tarefa);
      }
      
      public String toString() {
          StringBuilder builder = new StringBuilder();
          for(Todo todo: todos.values()) {
              if (todo.isConcluida())
                  builder.append("[x] ");
              else
                  builder.append("[ ] ");
              builder.append(todo.getTitulo());
              builder.append("\n");
          }
          return builder.toString();
      }
  }
  