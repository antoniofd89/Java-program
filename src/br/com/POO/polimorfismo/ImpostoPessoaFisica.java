package br.com.POO.polimorfismo;

public class ImpostoPessoaFisica implements Imposto {
    private Double rendaAnual;

    
    public ImpostoPessoaFisica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public Double calcularImposto() {
        return  (this.rendaAnual * 20)/100;
    }
    Double getRendaAtual(){
        return this.rendaAnual;
     }
    
}