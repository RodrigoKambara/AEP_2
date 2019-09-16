package AEP2;

import java.util.ArrayList;
import java.util.List;

public class Conceito {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Nota> notas = new ArrayList<Nota>();
	private List<Avaliação> avaliações = new ArrayList<Avaliação>();
	private double média = 0;
	private double somaDeNotas = 0;
	public void calcularMédia(List<Aluno> alunos, List<Nota> notas) {
		for (int contador = 0; contador < alunos.size(); contador++ ) {
			somaDeNotas = somaDeNotas + notas;
			int qtdeElementos = 0;
			qtdeElementos = qtdeElementos++;
			média = somaDeNotas/qtdeElementos;
		}
	}
	
}
