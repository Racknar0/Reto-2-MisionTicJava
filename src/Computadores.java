public class Computadores {
    // Variables base
    private final static char CONSUMO_W = 'F';
    private final static Double PRECIO_BASE = 100.0;
    private final static Integer PESO_BASE = 5;

    // Variables
    private Integer peso;
    private char consumoW;
    private Double precioBase;

    // Constructores public Computadores(){
    // Constructor
    public Computadores() {
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W;
        this.precioBase = PRECIO_BASE;
    }

    // * Constructor con 2 parametros
    public Computadores(Double precioBase, Integer peso) {
        this.peso = peso;
        this.consumoW = CONSUMO_W;
        this.precioBase = precioBase;
    }

    // * Constructor con 3 parametros
    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }

    // Metodos
    public Double calcularPrecio() {
        Double adicion = 0.0;
        // Código para consumo
        switch (consumoW) {
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;

        }
        // codigo para peso
        if (peso >= 0 && peso < 19) {
            adicion += 10.0;
        } else if (peso >= 20 && peso < 49) {
            adicion += 20.0;
        } else if (peso >= 50 && peso <= 79) {
            adicion += 80.0;
        } else if (peso >= 80) {
            adicion += 100.0;
        }

        return precioBase + adicion;

        // Getter

    }

    public Integer getPeso() {
        return peso;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

}