package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Nota {
	private double nota;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Avaliação> avaliações = new ArrayList<Avaliação>();
	private int aprovado = 0;
	public Nota(double nota) {
		this.nota = nota;
	}
	
	public void adicionarAluno(Aluno alunos) {
		this.alunos.add(alunos);
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public double getNota() {
		return nota;
	}
}
