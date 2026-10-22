import java.util.List;

public class Main {
    static int tiempoTotalSeg(List<Reproducible> lista) {
        int total = 0;
        for (Reproducible r : lista) {
            total = total + r.getDuracionSeg();
        }
        return total;
    }

    static double espacioTotalMB(List<Descargable> lista) {
        double total = 0;
        for (Descargable d : lista) {
            total = total + d.calcularTamanoMB();
        }
        return total;
    }

    public static void main(String[] args) {
        Cancion c1 = new Cancion("Cielo de Xela", "Banda Quetzal", 210);
        Cancion c2 = new Cancion("Marimba al Atardecer", "Los Tecomates", 180);
        Podcast p = new Podcast("Código y Café", "Ana Ruiz", 1800, 12);
        LibroDigital l = new LibroDigital("Estructuras de Datos", "Marco Pérez", 320);

        List<Contenido> catalogo = List.of(c1, c2, p, l);
        List<Reproducible> audios = List.of(c1, c2, p);
        List<Descargable> descargas = List.of(c1, c2, p, l);

        for (Contenido c : catalogo) {
            System.out.println(c);
        }

        for (Reproducible r : audios) {
            r.reproducir();
        }

        int tiempo = tiempoTotalSeg(audios);
        System.out.println("Tiempo: " + tiempo / 60 + " min " + tiempo % 60 + " s");
        System.out.println("Descarga: " + espacioTotalMB(descargas) + " MB");
    }
}
