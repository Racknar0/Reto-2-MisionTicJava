public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    // Constructor
    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
        // Código
        for (int l = 0; l < listaComputadores.length; l++){
            if(listaComputadores[l] instanceof Computadores) {
                totalComputadores += listaComputadores[l].calcularPrecio();
            }
            if(listaComputadores[l] instanceof ComputadoresMesa) {
                totalComputadoresMesa += listaComputadores[l].calcularPrecio();
            }
            if(listaComputadores[l] instanceof ComputadoresPortatiles) {
                totalComputadoresPortatiles += listaComputadores[l].calcularPrecio();
            }
        }
        // Mostramos los resultados
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }
}
