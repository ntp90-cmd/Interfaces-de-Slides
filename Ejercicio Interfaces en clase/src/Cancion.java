public class Cancion extends Contenido implements Reproducible, Descargable {
    private final int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String tipo() {
        return "Cancion";
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo cancion: " + getTitulo());
        System.out.println("Duracion: " + duracionSeg + " Segundos");
    }

    @Override
    public double calcularTamanoMB() {
        return duracionSeg / 60.0 * 1.5;
    }
} 
