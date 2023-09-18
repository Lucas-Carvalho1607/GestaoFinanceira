package Classes;

import Enum.UnidadeFederal;

public class Endereco {
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;
    UnidadeFederal uf;
    
    
    public Endereco(String rua, String bairro, String numero, String complemento, UnidadeFederal uf) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
    }
    
    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public UnidadeFederal getUf() {
        return uf;
    }


    public void setUf(UnidadeFederal uf) {
        this.uf = uf;
    }



    
}
