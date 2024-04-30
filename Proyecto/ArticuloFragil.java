public class ArticuloFragil extends Envio {
    public ArticuloFragil(double peso, double dimensiones) {
        super(peso, dimensiones);
    }
    @Override
    public double calcularCostoEnvio() {
        return peso * 1.2 + dimensiones * 0.5; 
    }
}