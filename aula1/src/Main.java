import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        ListaDeTarefas tarefas = new ListaDeTarefas();
        Tarefa tl = new Tarefa("Acordar","Abrir os olhos");

       //System.out.println(tl);

        tarefas.adicionarTarefa(tl);
        tarefas.adicionarTarefa(new Tarefa("Levantar","E tomar banho"));

        tl.completar();

        tarefas.listarTarefas();

        tarefas.limparTarefas();

        tarefas.listarTarefas();

    }

}