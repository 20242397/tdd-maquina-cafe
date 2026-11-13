public class MaquinaDeCafe {

    public static final String NO_HAY_VASOS = "No hay Vasos";
    public static final String NO_HAY_CAFE = "No hay Cafe";
    public static final String NO_HAY_AZUCAR = "No hay Azucar";
    public static final String FELICITACIONES = "Felicitaciones";

    // Package-private: los tests acceden directamente a estos campos
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;

    public Cafetera getCafetera() { return cafetera; }
    public void setCafetera(Cafetera cafetera) { this.cafetera = cafetera; }

    public Vaso getVasosPequeno() { return vasosPequeno; }
    public void setVasosPequeno(Vaso vasosPequeno) { this.vasosPequeno = vasosPequeno; }

    public Vaso getVasosMediano() { return vasosMediano; }
    public void setVasosMediano(Vaso vasosMediano) { this.vasosMediano = vasosMediano; }

    public Vaso getVasosGrande() { return vasosGrande; }
    public void setVasosGrande(Vaso vasosGrande) { this.vasosGrande = vasosGrande; }

    public Azucarero getAzucarero() { return azucarero; }
    public void setAzucarero(Azucarero azucarero) { this.azucarero = azucarero; }

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso) {
            case "pequeno": return vasosPequeno;
            case "mediano": return vasosMediano;
            case "grande":  return vasosGrande;
            default:        return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        int cafeNecesario = vaso.getContenido() * cantidadDeVasos;

        // Se valida todo primero para no descontar nada si falta algun insumo
        if (!vaso.hasVasos(cantidadDeVasos)) {
            return NO_HAY_VASOS;
        }
        if (!cafetera.hasCafe(cafeNecesario)) {
            return NO_HAY_CAFE;
        }
        if (!azucarero.hasAzucar(cantidadDeAzucar)) {
            return NO_HAY_AZUCAR;
        }

        vaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);

        return FELICITACIONES;
    }
}
