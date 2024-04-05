public class Kit {
    /* Kit será recebido por todos, mas os complementos devem ser definidos pela organização,
    mas a camisa todo participante terá a sua e dirá o tamanho que deseja*/ 
    private String complementos;
    
    Kit(String complemento){
        this.complementos = complemento;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }
    public String getComplementos() {
        return this.complementos;
    }

    public String toString(){
        String str = "";
        str += "Complementos: " + complementos;
        return str;
    }

    
}
