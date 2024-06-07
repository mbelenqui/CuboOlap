package olapcube.metricas;

import java.util.List;

/**
 * Clase que representa una medida de minimo
 */
public class Minimo extends Medida {

    public Minimo() {
        super("Minimo");
    }

    @Override
    public double calcular(List<Double> valores) {
        double minimo = valores.get(0);

        for (int i = 0; i < valores.size(); i++) {
            if(valores.get(i) < minimo){
                minimo = valores.get(i);
            }
        }
        
        return minimo;
    }
}