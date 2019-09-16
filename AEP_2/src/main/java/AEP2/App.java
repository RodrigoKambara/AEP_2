package AEP2;

import java.util.List;

public class App {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Rodrigo");
		Nota n1 = new Nota(3.4);

		n1.adicionarAluno(a1);
		imprimirNotasDoAluno(a1);
}
	
	public static void imprimirNotasDoAluno(Aluno alunos ) {
		System.out.println("<><><><><><><><>");
		for (Nota notas : alunos.getNotas() ){
			System.out.println("O aluno " + alunos.getNome() + " tem a nota: " + notas.getNota());
			
		}
	}
}
