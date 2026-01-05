package model.entidade;

public class professor extends usuario{


 private String siape;
    private String departamento;
    
    public professor(String id, String nome, String email, String siape, String departamento) {
        super(id, nome, email);
        this.siape = siape;
        this.departamento = departamento;
        this.tipo = tipoUsuario.PROFESSOR;
    }
    
    @Override
    public int getLimiteReservasDiarias() {
        return 5;
    }
    
    public String getSiape() { return siape; }
    public String getDepartamento() { return departamento; }
}
