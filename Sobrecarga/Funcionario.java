package Sobrecarga;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String salario;
    private String dataAdmi;
    private String dataDemi;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setSalario(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return this.salario;
    }

    public void setDataAdmi(String dataAdmi){
        this.dataAdmi = dataAdmi;
    }
    public String getDataAdmi(){
        return this.dataAdmi;
    }

    public void setDataDemi(String dataDemi){
        this.dataDemi = dataDemi;
    }
    public String getDataDemi(){
        return this.dataDemi;
    }


}
