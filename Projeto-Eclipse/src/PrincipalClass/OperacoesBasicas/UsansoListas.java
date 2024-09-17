package PrincipalClass.OperacoesBasicas;

public class UsansoListas {

	public static void main(String[] args) {
		
		ListaTarefas listaTarefa = new ListaTarefas();
		
		System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.adicionarTarefa("Tarefa 01");
		listaTarefa.adicionarTarefa("Tarefa 01");
		listaTarefa.adicionarTarefa("Tarefa 02");
		listaTarefa.adicionarTarefa("Tarefa 03");
		listaTarefa.adicionarTarefa("Tarefa 04");
		System.out.println("Quantidade de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
		System.out.println("Lista de Tarefas: " );
		listaTarefa.obterDescricoesTarefas();
		
	}
}
