package model;

public class Cliente {

    private int id;
    private String nome;
    private String fone;
    private String email;
    
    public Cliente() {}

    public Cliente(int id, String nome, String fone, String email) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     @Override
    public boolean equals(Object obj) {
        return ((Cliente) obj).getId() == this.id;
    }
    
    @Override
    public String toString() {
        return "Cliente{\n"
                + "id=" + this.id + "\n"
                + "nome="+ this.nome +"\n"
                + "fone="+ this.fone +"\n"
                + "email="+ this.email +"\n"
                + "}";
    }
    
}