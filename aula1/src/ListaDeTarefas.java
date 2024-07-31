import java.util.ArrayList;

public class ListaDeTarefas {

    ArrayList<Tarefa> tarefas;

    public ListaDeTarefas() {

        this.tarefas = new ArrayList<Tarefa>();

    }

    public void adicionarTarefa(Tarefa t) {

        this.tarefas.add(t);

    }

    public void listarTarefas() {

            System.out.println(this.tarefas);

    }

    public void limparTarefas() {
        this.tarefas.clear();
    }

}
