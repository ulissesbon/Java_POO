public class TestaCorrida {
    public static void main(String[] args) {
        
        // Organizador é definido
        Organizador o1 = new Organizador("Ulisses", "ulisses@email.com", "senha123");
        // O organizador cria o evento
        o1.criarEvento("Corrida da Beira-Mar", "31/02/2024", 1000, "Barra de proteína, mochila e energético.");
        // Percursos criados
        Percurso a1 = new Percurso("a1",42);
        Percurso a2 = new Percurso("a2",21);
        Percurso a3 = new Percurso("a3",10.5);

        // Criação de usuário
        Usuario u1 = new Usuario("Lucas", "lucas@email.com", "mbglfjgj");
        // Criação de participantes já com dados de usuários
        Participante p1 = new Participante("Gabriel","gabriel@email.com", "123senha");
        Participante p2 = new Participante("Luan","luan@email.com", "flhtrjssdnf");
        Participante p3 = new Participante("Matheus","matheus@email.com", "fafgfadg");
        Participante p4 = new Participante("Vinhas","vinhas@email.com", "flsgadfgdnf");
        Participante p5 = new Participante("Ajalmar","ajalmar@email.com", "beachTennis");
        // Participante recebendo os parâmetros do usuário
        Participante p6 = new Participante(u1.getNome(), u1.getEmail(), u1.getSenha());
        
        // Array de percursos para os percursos disponíveis na corrida
        Percurso percursos[] = {a1, a2, a3};

        // Evento pe criado pegando os dados do evento criado pelo organizador
        Evento e1 = o1.getEvento();
        // Percursos sãoa dicionados
        e1.setPercursos(percursos);
        // Participantes inscritos
        e1.inscrever(p1, "G", a1);
        e1.inscrever(p2, "GG", a1);
        e1.inscrever(p3, "P", a1);
        e1.inscrever(p4, "M", a1);
        e1.inscrever(p5, "M", a1);
        e1.inscrever(p6, "M", a3);
        // Printando as informações do evento
        System.out.println(e1.toString());

        // Usuário p1 cria um grupo
        p1.criarGrupo("Melhor de todos");
        Grupo g1 = p1.getGrupo();
        // Adicionando participantes ao grupo
        g1.addParticipante(p4);
        g1.addParticipante(p6);
        g1.addParticipante(p5);
        // Mostrando conteúdo do grupo
        System.out.println("\n\n" + g1);

        
        
    }
}
