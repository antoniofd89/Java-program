package br.com.POO.polimorfismo;

public class ImpostoPessoaJuridica implements Imposto{
    private Double rendaAnual;

    public ImpostoPessoaJuridica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double calcularImposto() {
        return  (this.rendaAnual * 10)/100;
    }
     Double getRendaAtual(){
        return this.rendaAnual;
     }
  
}