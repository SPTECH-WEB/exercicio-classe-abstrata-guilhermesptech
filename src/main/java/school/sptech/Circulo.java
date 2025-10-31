package school.sptech;

public class Circulo extends Figura {
    private Double raio;

    public Circulo(){}

    @Override
    public Double calcularArea() {
        return Math.pow(raio, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Raio: " + this.raio + " Área: " + this.calcularArea();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
