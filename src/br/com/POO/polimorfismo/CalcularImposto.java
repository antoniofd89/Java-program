package br.com.POO.polimorfismo;

public class CalcularImposto {
    public static void main(String[] args) {
        Imposto [] imposto = {new ImpostoPessoaFisica(100000.), 
            new ImpostoPessoaJuridica(100000.)};

            for (Imposto impostos : imposto) {
                System.out.println(impostos.calcularImposto());
            }
    }
}