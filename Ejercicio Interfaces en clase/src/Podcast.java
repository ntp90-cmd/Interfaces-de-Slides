public class Podcast extends Contenido implements Reproducible, Descargable {
    private final int duracionSeg;
    private final int episodio;

    public Podcast(String titulo, String autor, int duracionSeg, int episodio) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    @Override
    public String tipo() {
        return "Podcast";
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + getTitulo());
        System.out.println("Episodio " + episodio);
        System.out.println("Duracion: " + duracionSeg + " Segundos");
    }

    @Override
    public double calcularTamanoMB() {
        return duracionSeg / 60.0;
    }
}