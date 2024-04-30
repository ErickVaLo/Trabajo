public class DocumentoUrgente extends Envio {
    public DocumentoUrgente(double peso, double dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCostoEnvio() {
        return peso * 0.8 + dimensiones * 0.3; 
    }
}