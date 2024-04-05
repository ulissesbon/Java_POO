public class Usuario {
    /* Todo participante e todo organizador são usuários, então é preciso uma classe usuário
        que os outros herdarão dela */
    private String nome;
    private String email;
    private String senha;

    Usuario(String nome, String email, String senha){
        setEmail(email);
        setNome(nome);
        setSenha(senha);
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha() {
        return this.senha;
    }

    public String toString(){
        String str = "";
        str += "Nome: " + this.nome;
        return str;
    }
}
