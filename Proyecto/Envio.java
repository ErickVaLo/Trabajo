public abstract class Envio {
    protected double peso;
    protected double dimensiones;

    public Envio(double peso, double dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public abstract double calcularCostoEnvio();

}