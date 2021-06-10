package atividade;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante1 = new Estudante("Danilo", "Wall St.");
			estudante1.addCursoNota("Matematica", 9);
			estudante1.addCursoNota("Português", 6);
			
			Estudante estudante2 = new Estudante("Lucas", "Main st.");
			estudante2.addCursoNota("Historia", 8);
			estudante2.addCursoNota("Matematica", 9);
			estudante2.addCursoNota("Informatica", 9);
			
			Estudante estudante3 = new Estudante("Carlos", "Second st.");
			estudante3.addCursoNota("Historia", 8);
			estudante3.addCursoNota("Português", 9);
			estudante3.addCursoNota("Física", 9);
			estudante3.addCursoNota("Biologia", 9);
			pessoas.add(estudante1);
			pessoas.add(estudante2);
			pessoas.add(estudante3);

			Professor  professor01 = new Professor("André", "Fourth st.");
			professor01.addCurso("matematica");
			professor01.addCurso("biologia");
			
			Professor professor02 = new Professor("Thiago", "First st.");
			professor02.addCurso("informatica");
			professor02.addCurso("historia");
			
			pessoas.add(professor01);
			pessoas.add(professor02);
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println(test);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String str = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor teacher = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < teacher.getCursos().size(); y++) {
						str += "Curso: "+ teacher.getCursos().get(y)+"\n";
						str += "Professor: " + teacher.getNome()+"\n";
						str += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
											str += student.getNome()+"\n";
										}
									}
								}
							}
							str +="================ // ================= \n";
					 }
				 }
			}
			
			return str;
	}

}
