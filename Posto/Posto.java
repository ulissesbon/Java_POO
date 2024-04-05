import java.util.ArrayList;

public class Posto{
    
    private Tanque tanquePrincipal;
    private ArrayList<Bomba> bombas = new ArrayList<Bomba>();

    public void setBombas(ArrayList<Bomba> bombas) {
        this.bombas = bombas;
    }
    public ArrayList<Bomba> getBombas() {
        return this.bombas;
    }

    public void setTanque(Tanque tanque) {
        this.tanquePrincipal = tanque;
    }
    public Tanque getTanque() {
        return this.tanquePrincipal;
    }
    
    public void addBombas(Bomba bombas){
        this.bombas.add(bombas);
        System.out.println("Bomba cadastrada");
    }

    public void abastecer(float combustivel, Veiculo veiculo, Bomba bomba) {
        int statusTanque = (veiculo.getTanque().getStatus()) + combustivel;
        if (newEstadoTanque > veiculo.getTanque().getCapacidade()) {
            System.out.println("Limite do tanque atigindo");
        } 
        else {
            if (this.tanquePrincipal.getStatus() < combustivel) {
                System.out.println("Bomba sem gasolina!");
            } else {
                this.tanquePrincipal.setStatus((tanquePrincipal.getEstadoTanque()) - qtdCombustivel);
                veiculo.getTanqueVeiculo().setEstadoTanque(newEstadoTanque);
                System.out.println("Abastecido com sucesso!");
                System.out.println("Nova reserva de gasolina no tanque: " + veiculo.getTanqueVeiculo().getEstadoTanque()
                        + " L");
                Operacao op = new Operacao("02/04", (qtdCombustivel * 5), qtdCombustivel, veiculo,
                        veiculo.getTanqueVeiculo());
                bomba.addOperacao(op);
                System.out.println("Numero de operações armazenadas na bomba: " + bomba.getNumOp());
            }
        }
    }
}