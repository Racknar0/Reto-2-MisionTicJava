public class ComputadoresMesa extends Computadores {

    private final static Integer ALMACENAMIENTO_BASE = 50;
    // Variable
    private Integer almacenamiento;

    // * Constructor vacio */
    public ComputadoresMesa() {
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    // Métodos
    public Double calcularPrecio() {
        // Código
        Double adicion = super.calcularPrecio();
        if (almacenamiento > 100) {
            adicion += 50.0;
        }
        return adicion;
    }

    public Integer getCarga() {
        return almacenamiento;
    }
}
