public class Operacao {

    private String data;
    private double valor;
    private float quantidadeCombustivel;
    private Veiculo veiculo;
    private Tanque tanque;


    
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return this.data;
    }

    public void setQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public float getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
    public Tanque getTanque() {
        return this.tanque;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return this.valor;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    Operacao(String data, double valor, int quantidadeCombustivel, Veiculo veiculo, Tanque tanque) {
        this.data = data;
        this.valor = valor;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.veiculo = veiculo;
        this.tanque = tanque;
    }

    Operacao(String data, double valor, int quantidadeCombustivel, Tanque tanque) {
        this.data = data;
        this.valor = valor;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.tanque = tanque;
    }
    
}
