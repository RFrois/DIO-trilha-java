package Principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Primeiros passos Java");
		curso1.setDescricao("Aprendendo os primeiros passos");
		curso1.setCargaHoraria(6);

		Curso curso2 = new Curso();
		curso2.setTitulo("POO java");
		curso2.setDescricao("Aprendendo os primeiros passos com POO");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Helo word no java");
		mentoria.setDescricao("Olá mundo no java - primeiros passos");
		mentoria.setDate(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java developer");
		bootcamp.setDescricao("Desenvolver do zero");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev rafael = new Dev();
		rafael.setNome("Rafael");
		rafael.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de " + rafael.getNome() + " " + rafael.getConteudoInscritos());
		System.out.println("XP " + rafael.calcularTotalXp());
		rafael.progredir();
		System.out.println("Conteudos Inscritos de " + rafael.getNome() + " " + rafael.getConteudoInscritos());
		System.out.println("Conteudos Concluidos de " + rafael.getNome() + " " + rafael.getConteudoConcluidos());
		System.out.println("XP " + rafael.calcularTotalXp());
		
		
		Dev alex = new Dev();
		alex.setNome("alex");
		alex.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos de " + alex.getNome() + " " + alex.getConteudoInscritos());
		System.out.println("Conteudos Concluidos de " + alex.getNome() + " " + alex.getConteudoConcluidos());
		System.out.println("XP " + rafael.calcularTotalXp());
		alex.progredir();
		System.out.println("Conteudos Inscritos de " + alex.getNome() + " " + alex.getConteudoInscritos());
		System.out.println("Conteudos Concluidos de " + alex.getNome() + " " + alex.getConteudoConcluidos());
		System.out.println("XP " + rafael.calcularTotalXp());
		alex.progredir();
		System.out.println("Conteudos Inscritos de " + alex.getNome() + " " + alex.getConteudoInscritos());
		System.out.println("Conteudos Concluidos de " + alex.getNome() + " " + alex.getConteudoConcluidos());
		System.out.println("XP " + rafael.calcularTotalXp());
		alex.progredir();
		System.out.println("Conteudos Inscritos de " + alex.getNome() + " " + alex.getConteudoInscritos());
		System.out.println("Conteudos Concluidos de " + alex.getNome() + " " + alex.getConteudoConcluidos());
		System.out.println("XP " + rafael.calcularTotalXp());
	}
}
