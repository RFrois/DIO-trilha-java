package PrincipalClass.MapInterface.OrdenacaoMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
	
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEvento() {
		super();
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap); // já fica ordenado por data, pelo TreeMap LocalDate, olhar a estrutura do LocalDate 
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O proximo evento: " + entry.getKey() + "acontecera na data " + entry.getValue());
				break;
			}
			
		}
		
	}
	
	

}
