import java.util.Scanner;
public class Main {
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
    
        do {
            // Solicitar al usuario que ingrese los datos de envío
            double peso = 0;
            double dimensiones = 0;
    
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.println("Ingrese el peso del envío:");
                    peso = scanner.nextDouble();
                    entradaValida = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }
    
            entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.println("Ingrese las dimensiones del envío:");
                    dimensiones = scanner.nextDouble();
                    entradaValida = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }
    
            // Crear instancias de envíos con los datos ingresados por el usuario
            PaqueteEstandar paquete = new PaqueteEstandar(peso, dimensiones);
            DocumentoUrgente documento = new DocumentoUrgente(peso, dimensiones);
            ArticuloFragil articulo = new ArticuloFragil(peso, dimensiones);
    
            // Crear instancia de servicio de envío
            ServicioEnvio servicio = new ServicioEnvio();
    
            // Calcular costo de envío para cada envío
            double costoPaquete = servicio.calcularCostoEnvio(paquete);
            double costoDocumento = servicio.calcularCostoEnvio(documento);
            double costoArticulo = servicio.calcularCostoEnvio(articulo);
    
            // Imprimir resultados con la moneda local (en este caso, pesos)
            System.out.println("Costo de envío para paquete estándar: $" + costoPaquete);
            System.out.println("Costo de envío para documento urgente: $" + costoDocumento);
            System.out.println("Costo de envío para artículo frágil: $" + costoArticulo);
    
            // Preguntar al usuario si desea continuar
            String respuesta;
            do {
                System.out.println("¿Desea ingresar nuevos envíos? (S/N)");
                respuesta = scanner.next().toUpperCase();
                if (!respuesta.equals("S") && !respuesta.equals("N")) {
                    System.out.println("Opción no válida. Por favor, ingrese 'S' o 'N'.");
                }
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
    
            if (respuesta.equals("N")) {
                continuar = false;
            }
        } while (continuar);
    
        scanner.close();
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        main.ejecutar();
    }
}