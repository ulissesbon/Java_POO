public class Posto{
    private Tanque tanque;
    private Bomba[] bombas;

    public void setBombas(Bomba[] bombas) {
        this.bombas = bombas;
    }
    public Bomba[] getBombas() {
        return this.bombas;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
    public Tanque getTanque() {
        return this.tanque;
    }
    
}