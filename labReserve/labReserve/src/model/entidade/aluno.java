package model.entidade;

public class aluno extends usuario {
    private String matricula;
    private String curso;
    private static int totalAlunos = 0; 
    
    public aluno(String id, String nome, String email, String matricula, String curso) {
        super(id, nome, email);
        this.matricula = matricula;
        this.curso = curso;
        this.tipo = tipoUsuario.ALUNO;
        totalAlunos++;
    }
    
    @Override
    public int getLimiteReservasDiarias() {
        return 2;
    }
    
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }
    
    
    public static int getTotalAlunos() {
        return totalAlunos;
    }
}


