// Subclase PaqueteEstandar
public class PaqueteEstandar extends Envio {
    public PaqueteEstandar(double peso, double dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCostoEnvio() {
        // Implementación de cálculo de costo de envío para paquete estándar
        return peso * 0.5 + dimensiones * 0.2; // Ejemplo de cálculo simple
    }
}