package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    public Quadrado(){}

    @Override
    public Double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return "Lado: " + this.lado + " Área: " + this.calcularArea();
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
