package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso javaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descricao mentoria");
		mentoria1.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setTitulo("bootcamp java developer");
		bootcamp.setDescricao("descricao bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devCastro = new Dev();
		devCastro.setNome("Castro");
		devCastro.inscreverBootcamp(bootcamp);
				
		System.out.println("Conteudos inscritos" + devCastro.getConteudosInscritos());
		
		devCastro.progredir();
		devCastro.progredir();
		devCastro.progredir();
		System.out.println("Conteudos concluidos" + devCastro.getConteudosConcluidos());
		System.out.println("Conteudos inscritos" + devCastro.getConteudosInscritos());
		System.out.println("Total XP: " + devCastro.calcularTotalXp());
		
	}

}
