package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<Figura>();

    public Imagem(){}

    public void adicionar(Figura figura) {
        if (figura != null) {
            figuras.add(figura);
        }
    }

    public Double calcularSomaDasAreas() {
        Double somaDasAreas = 0.0;
        for (int i = 0; i < figuras.size(); i++) {
            somaDasAreas += figuras.get(i).calcularArea();
        }
        return somaDasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasComAreaMaiorQue20 = new ArrayList<Figura>();
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).calcularArea() > 20) {
                figurasComAreaMaiorQue20.add(figuras.get(i));
            }
        }
        return figurasComAreaMaiorQue20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> figurasQuadrados = new ArrayList<Figura>();
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i) instanceof Quadrado) {
                figurasQuadrados.add(figuras.get(i));
            }
        }
        return figurasQuadrados;
    }
}
