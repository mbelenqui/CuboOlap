package olapcube.metricas;

import java.util.List;

/**
 * Clase que representa una medida de maximo
 */
public class Maximo extends Medida {

    public Maximo() {
        super("Maximo");
    }

    @Override
    public double calcular(List<Double> valores) {
        double maximo = valores.get(0);

        for (int i = 0; i < valores.size(); i++) {
            if(valores.get(i) > maximo){
                maximo = valores.get(i);
            }
        }
        
        return maximo;
    }
}
