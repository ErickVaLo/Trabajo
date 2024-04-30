// Subclase ArticuloFragil
public class ArticuloFragil extends Envio {
    public ArticuloFragil(double peso, double dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCostoEnvio() {
        // Implementación de cálculo de costo de envío para artículo frágil
        return peso * 1.2 + dimensiones * 0.5; // Ejemplo de cálculo simple
    }
}
