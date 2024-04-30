
// Subclase DocumentoUrgente
public class DocumentoUrgente extends Envio {
    public DocumentoUrgente(double peso, double dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCostoEnvio() {
        // Implementación de cálculo de costo de envío para documento urgente
        return peso * 0.8 + dimensiones * 0.3; // Ejemplo de cálculo simple
    }
}