package app;

public class Turma {
    private String codigo;
    private Professor[] professor;
    private Aluno[] alunos;
    private Disciplina disciplina;

    public final String getCodigo(){
        return codigo;
    }

   public final Professor[] getProfessor(){
    return professor;
   }

   public final Aluno[] getAlunos(){
    return alunos;
   }


    public final Disciplina getDisciplina(){
        return disciplina;
    }

    public String toString() {
		String resposta = super.toString();
		resposta += "PROFESSOR: " + /* */ + '\n';
		resposta += "DISCIPLINA: " + /* */ + '\n';
        resposta += "CÓDIGO: " + /* */ + '\n';
		resposta += "ALUNOS: " + /* */ + '\n';
		return resposta;
	}
}
