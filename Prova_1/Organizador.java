public class Organizador extends Usuario {

    private Evento evento;

    // Organizador irá herdar os dados do usuário, porém terá a função de criar eventos
    Organizador(String nome, String email, String senha){
        super(nome, email, senha);
        this.evento = null;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Evento getEvento() {
        return this.evento;
    }

    // Nesse método o organizador irá setar os dados do evento em sua criação
    public void criarEvento(String nomeEvento, String data, int limiteParticipantes, String kitEvento){
        this.evento = new Evento(nomeEvento, data, limiteParticipantes, kitEvento);
        this.evento.setOrganizador(this);
    }
    // Nesse método, um evento já está criado, mas irá dizer quem é seu organizador
    public void criarEvento(Evento evento){
        setEvento(evento);
        evento.setOrganizador(this);
    }

}
