package br.com.POO.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
 
public class TodoList {
    private List<Todo> todos; // Lista de Objetos do tipo Todo
    
    public TodoList() { // Construtor que inicializa a lista de tarefas como um ArrayList
        this.todos = new ArrayList<>();
    }
    
    /*
     * adiciona uma nova tarefa à lista, 
     * verificando se ela já não existe na lista antes de adicioná-la.
     */
    public void adicionarTarefa(String tarefa) { 
        Todo todo = new Todo(tarefa);
        if (!todos.contains(todo))
            todos.add(todo);
    }
    
    /*
     * marca uma tarefa como concluída com base no título da tarefa.
     */
    public void concluirTarefa(String tarefa) {
        for(Todo todo: todos) {
            if (todo.getTitulo().equals(tarefa))
                todo.concluir();
        }
    }
    
    public void removerTarefa(String tarefa) {
        Iterator<Todo> it = todos.iterator();
        while(it.hasNext()) {
            Todo todo = it.next();
            if (todo.getTitulo().equals(tarefa))
                it.remove();
        }
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Todo todo: todos) {
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
