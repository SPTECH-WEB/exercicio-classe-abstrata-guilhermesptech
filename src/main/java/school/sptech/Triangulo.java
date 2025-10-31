package school.sptech;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    public Triangulo(){}

    @Override
    public Double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public String toString() {
        return "Base: " + this.base + " Altura: " + this.altura + " Área: " + this.calcularArea();
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
