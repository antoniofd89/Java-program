package br.com.POO.heranca;

public class Triangulo extends FiguraGeometrica {
    private Integer base;
    private Integer altura;
    
    public Triangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
        super.tipo = "Triangulo";
    }
    
    public Integer getArea() {
        return (base * altura) / 2;
    }
    
    public String toString() {
        return "{ base: " + this.base +  ", altura: " + this.altura + ", tipo: " + tipo +" }";
    }
}   