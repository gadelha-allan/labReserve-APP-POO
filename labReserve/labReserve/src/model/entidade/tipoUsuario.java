package model.entidade;

public enum tipoUsuario {
    ALUNO("Aluno"),
    PROFESSOR("Professor"),
    TECNICO("Técnico");
    
    private String descricao;
    
    tipoUsuario(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}

