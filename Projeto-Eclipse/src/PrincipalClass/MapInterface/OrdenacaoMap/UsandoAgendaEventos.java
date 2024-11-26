package PrincipalClass.MapInterface.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;

public class UsandoAgendaEventos {
	
	public static void main(String[] args) {
	    AgendaEvento agendaEventos = new AgendaEvento();

	    // Adiciona eventos à agenda
	    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

	    // Exibe a agenda completa de eventos
	    agendaEventos.exibirAgenda();

	    // Obtém e exibe o próximo evento na agenda
	    agendaEventos.obterProximoEvento();
	}

}
