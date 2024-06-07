package olapcube.metricas;

import java.util.List;

/**
 * Clase que representa una medida de contador
 */
public class Contador extends Medida {

    public Contador() {
        super("Contador");
    }

    @Override
    public double calcular(List<Double> valores) {
        double contador = 0;
        for (int i = 0; i < valores.size(); i++) {
            contador += 1;
        }
        
        return contador;
    }
}
