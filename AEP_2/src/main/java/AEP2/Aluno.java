package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Nota> notas = new ArrayList<Nota>();
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Nota> getNotas() {
		return notas;
	}
	
}
