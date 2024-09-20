package br.edu.ifsp.bra.api_web.model;

public class Pet {
    private String apelido;
    private String raca;
    private int fofuraLevel;

    public Pet(){

    }

    public Pet(String apelido, String raca, int fofuraLevel) {
        this.apelido = apelido;
        this.raca = raca;
        this.fofuraLevel = fofuraLevel;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getFofuraLevel() {
        return fofuraLevel;
    }

    public void setFofuraLevel(int fofuraLevel) {
        this.fofuraLevel = fofuraLevel;
    }

    
}
