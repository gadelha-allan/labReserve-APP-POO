package model.entidade;
import java.util.ArrayList;
import java.util.List;

public abstract class usuario {
 private String id;
    private String nome;
    private String email;
    protected tipoUsuario tipo; 
    
    public usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    
   
    public abstract int getLimiteReservasDiarias();
    
   
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public tipoUsuario getTipo() { return tipo; }
    
   
    public static void mostrarInfoSistema() {
        System.out.println("=== Sistema de Usuários ===");
    }
}



