package br.com.POO.heranca;
/*
 * Classes abstratas não podemos criar instâncias a partir dela.
 * métodos abstratos - não posso definir comportamento.
 */
public abstract class FiguraGeometrica {
    protected String tipo;
    
    public abstract Integer getArea();
}