public class Percurso {

    private String id;
    private double tamanho;

    // Percurso terá id e tamanho para que o usuário possa diferenciar qual irá escolher
    Percurso(String id, double tamanho){
        setId(id);
        setTamanho(tamanho);
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    public double getTamanho() {
        return this.tamanho;
    }

    public String toString(){
        String str = "";
        str += "ID do percurso: " + this.id +
                "\nTamanho do percurso: " + this.tamanho + "km\n";
        return str;
    }
}
