public class PaqueteEstandar extends Envio {
    public PaqueteEstandar(double peso, double dimensiones) {
        super(peso, dimensiones);
    }

    @Override
    public double calcularCostoEnvio() {
        return peso * 0.5 + dimensiones * 0.2;
    }
}