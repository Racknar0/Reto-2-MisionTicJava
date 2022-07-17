public class ComputadoresPortatiles extends Computadores {

    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;

    // Constructor
    public ComputadoresPortatiles() {
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.consumoW = CONSUMO_W;
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    // Métodos
    public Double calcularPrecio() {
        Double adicion = super.calcularPrecio();
        // Método Código 
        if(pulgadas > 40) {
            adicion += precioBase * 0.3;
        }
        if(camaraITG) {
            adicion += 50.0;
        }
        
        return adicion;
    }
}